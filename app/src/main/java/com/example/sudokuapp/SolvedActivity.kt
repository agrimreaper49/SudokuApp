package com.example.sudokuapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.widget.*
import androidx.appcompat.app.ActionBar

class SolvedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solved)

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
        val unsolved = intent.getStringExtra("unsolved")
        val solve = intent.getStringExtra("solved")
        if (solve != null) {
            if (unsolved != null) {
                displayFillTable(unsolved, solve)
            }
        }
        var tryagain = findViewById<Button>(R.id.tryagain)
        tryagain.setOnClickListener {
            var intent = Intent(this@SolvedActivity, ManualButtonActivity::class.java)
            startActivity(intent)
        }
    }
    private fun displayFillTable(unsolved : String, solved : String) {
        var zeros = mutableSetOf<Int>()
        var index: Int = unsolved.indexOf("0")
        while (index >= 0) {
            zeros.add(index)
            index = unsolved.indexOf("0", index + 1)
        }
        val table = findViewById<TableLayout>(R.id.tableLayout)
        var slotNum = 0
        for (i in 0..8) {
            val row = (table.getChildAt(i)) as TableRow
            for (j in 0..8 ) {
                val slot = row.getChildAt(j) as TextView
                slot.setText(solved.get(slotNum).toString())
                if (zeros.contains(slotNum)) {
                    slot.setTextColor(Color.RED)
                }
                slotNum += 1
            }
        }
    }
    private fun actionBarCustomTitle():TextView{
        return TextView(this).apply {
            text = "Solved Puzzle"

            val params = ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT
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
                setTypeface(null, Typeface.BOLD)
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}