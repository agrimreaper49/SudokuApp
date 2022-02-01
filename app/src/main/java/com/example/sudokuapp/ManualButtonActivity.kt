package com.example.sudokuapp

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.util.Log
import android.util.TypedValue
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM
import androidx.appcompat.app.ActionBar.LayoutParams

class ManualButtonActivity : AppCompatActivity() {
    private var unsolved = Array(9) {Array(9) {0} }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualbutton)

        val actionbar = supportActionBar
        supportActionBar?.apply {
            // show custom title in action bar
            customView = actionBarCustomTitle()
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        val buttonsolve = findViewById(R.id.button4) as Button
        buttonsolve.setOnClickListener {
//            var test = "530070000600195000098000060800060003400803001700020006060000280000419005000080079"
            var input = grabAllText()
            stringToGrid(input)

            if (checkSolvable()) {
                Toast.makeText(this@ManualButtonActivity, "Solving...",Toast.LENGTH_LONG).show()
                var solved = solve()
                if (!solved.contains("0")) {
                    val intent = Intent(this@ManualButtonActivity, SolvedActivity::class.java)
                    intent.putExtra("solved", solved)
                    intent.putExtra("unsolved", input)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@ManualButtonActivity, "The puzzle you input was not solvable",Toast.LENGTH_LONG).show()
                }
            }
            else {
                Toast.makeText(this@ManualButtonActivity, "The puzzle you input was not solvable",Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun actionBarCustomTitle():TextView{
        return TextView(this).apply {
            text = "Input Puzzle"

            val params = LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
            )
            // center align the text view/ action bar title
            params.gravity = Gravity.CENTER_HORIZONTAL
            layoutParams = params

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                setTextAppearance(
                    android.R.style.TextAppearance_Material_Widget_ActionBar_Title
                )
            }else{
                // define your own text style
                setTextSize(TypedValue.COMPLEX_UNIT_SP,17F)
                setTypeface(null,Typeface.BOLD)
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    private fun checkSolvable() : Boolean {
        for (n in 1..9) {
            for (i in 0..8) {
                for (j in 0..8) {
                    if (unsolved[i][j] == n) {
                        for (f in 0..8) {
                            if (unsolved[f][j] == n && f != i) {
                                if (unsolved[i][f] == n && f != j) {
                                    Log.i("solvable", "false")
                                    return false
                                }
                            }
                        }
                        for (xx in ((i / 3) * 3)..((i / 3) * 3 + 2)) {
                            for (yy in ((j / 3) * 3)..((j / 3) * 3 + 2)) {
                                if (unsolved[xx][yy] == n && xx != i && yy != j) {
                                    Log.i("solvable", "false")
                                    return false
                                }
                            }
                        }
                    }
                }
            }
        }
        Log.i("solvable", "true")
        return true
    }
    private fun grabAllText()  : String {
        var totalSumOfTable = ""

        val table = findViewById<TableLayout>(R.id.tableLayout)
        for (i in 0..8) {
            val row = (table.getChildAt(i)) as TableRow
            for (j in 0..8 ) {
                val slot = row.getChildAt(j) as EditText
                var t = slot.text.toString()
                if (t == "") {
                    t = "0"
                }
                totalSumOfTable += t
            }
        }
        return totalSumOfTable
    }
    private fun stringToGrid(str : String) {
        var r = 0
        var c = 0
        for (s in 0..80) {
            unsolved[r][c] = str.get(s).toString().toInt()
            c += 1
            if (c == 9) {
                r += 1
                c = 0
            }
        }

    }
    private fun solve() : String {
        var run = true
        var zBefore = 0
        var zAfter = 0
        for (x in 0..8) {
            for (y in 0..8) {
                if (unsolved[x][y] == 0) {
                    zAfter += 1
                }
            }
        }
        while (run && zBefore != zAfter) {
            zBefore = zAfter
            for (p in 0..1) {
                for (i in 0..8) {
                    traditionalStrategySolve(i + 1)
                }
            }
            notThere()
            run = false
            zAfter = 0
            for (x in 0..8) {
                for (y in 0..8) {
                    if (unsolved[x][y] == 0) {
                        run = true
                        zAfter += 1
                    }
                }
            }
            Log.i("zerosAfter", zAfter.toString())
        }
        var solvedPuzzle = ""
        for (i in 0..8) {
            for (j in 0..8) {
                solvedPuzzle += unsolved[i][j]
            }
        }
        return solvedPuzzle
    }
    private fun tempFill(xx : Int, yy : Int, temp : Array<Array<Int>>) : Array<Array<Int>>{
        for (i in 0..8) {
            temp[i][yy] = 0
            temp[xx][i] = 0
        }
        return temp
    }
    private fun availableLocations(l : Int) : Array<Array<Int>> {
        var temp = Array(9) {Array(9) {l} }
        for (i in 0..8) {
            for (j in 0..8) {
                if (unsolved[i][j] != 0) {
                    temp[i][j] = 0
                }
                if (unsolved[i][j] == l) {
                    temp = tempFill(i, j, temp)
                    for (xx in ((i / 3) * 3)..((i / 3) * 3 + 2)) {
                        for (yy in ((j / 3) * 3)..((j / 3) * 3 + 2)) {
                            temp[xx][yy] = 0
                        }
                    }
                }
            }
        }
        return temp
    }
    private fun traditionalStrategySolve(num : Int) {
        for (x in 0..2) {
            for(y in 0..2) {
                var xx = 0
                var yy = 0
                var count = 0
                for (i in (x * 3)..((x + 1) * 3 - 1)) {
                    for (j in (y * 3)..((y + 1) * 3 - 1)) {
                        if (availableLocations(num)[i][j] == num) {
                            xx = i
                            yy = j
                            count = count + 1
                        }
                    }
                }
                if (count == 1 && availableLocations(num)[xx][yy] == num) {
                    unsolved[xx][yy] = num
                }
            }
        }
    }
    private fun notThere() {
        var temp = Array(9) {Array(9) {""} }
        for (x in 0..8) {
            for (y in 0..8) {
                for (loop in 0..8) {
                    temp[x][y] += availableLocations(loop + 1)[x][y].toString().replace("0", "")
                }
            }
        }
        for (x in 0..8) {
            for (y in 0..8) {
                if (temp[x][y].length == 1) {
                    unsolved[x][y] = Integer.parseInt(temp[x][y])
                }
            }
        }
    }
}