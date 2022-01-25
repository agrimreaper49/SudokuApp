package com.example.sudokuapp

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.util.TypedValue
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.ActionBar.DISPLAY_SHOW_CUSTOM
import androidx.appcompat.app.ActionBar.LayoutParams

class ManualButtonActivity : AppCompatActivity() {
    var unsolved = Array(9) {Array(9) {0} }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualbutton)

        val actionbar = supportActionBar
        actionbar!!.title = "Manual Solver"
        supportActionBar?.apply {
            // show custom title in action bar
            customView = actionBarCustomTitle()
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

            setDisplayShowHomeEnabled(true)
            setDisplayUseLogoEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            val buttonsolve = findViewById(R.id.button4) as Button
            buttonsolve.setOnClickListener {
                Toast.makeText(this@ManualButtonActivity, grabAllText(), Toast.LENGTH_LONG).show()
                solve(grabAllText())
            }
        }
    }
    private fun actionBarCustomTitle():TextView{
        return TextView(this).apply {
            text = "Manual Solving"

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
    private fun solve(puzzle : String) : String {
        for (i in 0..8) {
            for (j in 0..8) {
                unsolved[i][j] = puzzle.get(i * 8 + j).toString().toInt()
            }
        }

        return ""
    }
    private fun tempFill(xx : Int, yy : Int, temp : Array<Array<Int>>) : Array<Array<Int>>{
        for (i in 0..8) {
            temp[i][yy] = 0
            temp[xx][i] = 0
        }
        return temp
    }
    private fun availableLocations(l : Int) : Array<Array<Int>> {
        var temp = Array(9) {Array(9) {0} }
        for (i in 0..8) {
            for (j in 0..8) {
                if (unsolved[i][j] != 0) {
                    temp[i][j] = 0
                }
                if (unsolved[i][j] == l) {
                    temp = tempFill(i, j, temp)
                    for (xx in ((i / 3) * 3)..((i / 3) * 3 + 3)) {
                        for (yy in ((i / 3) * 3)..((i / 3) * 3 + 3)) {
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
                for (i in (x * 3)..((x + 1) * 3)) {
                    for (j in (y * 3)..((y + 1) * 3)) {
                        if (true) {
                            xx = i
                            yy = j
                            count = count + 1
                        }
                    }
                }
            }
        }
    }
}