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
//
//        var editText : String = findViewById<EditText>(R.id.text1).text.toString()
//        if (editText == null) {
//            editText = "0"
//        }
//        totalSumOfTable += editText
//
//        var editText2 : String = findViewById<EditText>(R.id.text2).text.toString()
//        if (editText2 == null) {
//            editText2 = "0"
//        }
//        totalSumOfTable += editText2
//
//        var editText3 : String = findViewById<EditText>(R.id.text3).text.toString()
//        if (editText3 == null) {
//            editText3 = "0"
//        }
//        totalSumOfTable += editText3
//
//        var editText4 : String = findViewById<EditText>(R.id.text4).text.toString()
//        if (editText4 == null) {
//            editText4 = "0"
//        }
//        totalSumOfTable += editText4
//
//        var editText5 : String = findViewById<EditText>(R.id.text5).text.toString()
//        if (editText5 == null) {
//            editText5 = "0"
//        }
//        totalSumOfTable += editText5
//
//        var editText6 : String = findViewById<EditText>(R.id.text6).text.toString()
//        if (editText6 == null) {
//            editText6 = "0"
//        }
//        totalSumOfTable += editText6
//
//        var editText7 : String = findViewById<EditText>(R.id.text7).text.toString()
//        if (editText7 == null) {
//            editText7 = "0"
//        }
//        totalSumOfTable += editText7
//
//        var editText8 : String = findViewById<EditText>(R.id.text8).text.toString()
//        if (editText8 == null) {
//            editText8 = "0"
//        }
//        totalSumOfTable += editText8
//
//        var editText9 : String = findViewById<EditText>(R.id.text9).text.toString()
//        if (editText9 == null) {
//            editText9 = "0"
//        }
//        totalSumOfTable += editText9
//
//        var editText10 : String = findViewById<EditText>(R.id.text10).text.toString()
//        if (editText10 == null) {
//            editText10 = "0"
//        }
//        totalSumOfTable += editText10
//
//        var editText11 : String = findViewById<EditText>(R.id.text11).text.toString()
//        if (editText11 == null) {
//            editText11 = "0"
//        }
//        totalSumOfTable += editText11
//
//        var editText12 : String = findViewById<EditText>(R.id.text12).text.toString()
//        if (editText12 == null) {
//            editText12 = "0"
//        }
//        totalSumOfTable += editText12
//
//        var editText13 : String = findViewById<EditText>(R.id.text13).text.toString()
//        if (editText13 == null) {
//            editText13 = "0"
//        }
//        totalSumOfTable += editText13
//
//        var editText14 : String = findViewById<EditText>(R.id.text14).text.toString()
//        if (editText14 == null) {
//            editText14 = "0"
//        }
//        totalSumOfTable += editText14
//
//        var editText15 : String = findViewById<EditText>(R.id.text15).text.toString()
//        if (editText15 == null) {
//            editText15 = "0"
//        }
//        totalSumOfTable += editText15
//
//        var editText16 : String = findViewById<EditText>(R.id.text16).text.toString()
//        if (editText16 == null) {
//            editText16 = "0"
//        }
//        totalSumOfTable += editText16
//
//        var editText17 : String = findViewById<EditText>(R.id.text17).text.toString()
//        if (editText17 == null) {
//            editText17 = "0"
//        }
//        totalSumOfTable += editText17
//
//        var editText18 : String = findViewById<EditText>(R.id.text18).text.toString()
//        if (editText18 == null) {
//            editText18 = "0"
//        }
//        totalSumOfTable += editText18
//
//        var editText19 : String = findViewById<EditText>(R.id.text19).text.toString()
//        if (editText19 == null) {
//            editText19 = "0"
//        }
//        totalSumOfTable += editText19
//
//        var editText20 : String = findViewById<EditText>(R.id.text20).text.toString()
//        if (editText20 == null) {
//            editText20 = "0"
//        }
//        totalSumOfTable += editText20
//
//        var editText21 : String = findViewById<EditText>(R.id.text21).text.toString()
//        if (editText21 == null) {
//            editText21 = "0"
//        }
//        totalSumOfTable += editText21
//
//        var editText22 : String = findViewById<EditText>(R.id.text22).text.toString()
//        if (editText22 == null) {
//            editText22 = "0"
//        }
//        totalSumOfTable += editText22
//
//        var editText23 : String = findViewById<EditText>(R.id.text23).text.toString()
//        if (editText23 == null) {
//            editText23 = "0"
//        }
//        totalSumOfTable += editText23
//
//        var editText24 : String = findViewById<EditText>(R.id.text24).text.toString()
//        if (editText24 == null) {
//            editText24 = "0"
//        }
//        totalSumOfTable += editText24
//
//        var editText25 : String = findViewById<EditText>(R.id.text25).text.toString()
//        if (editText25 == null) {
//            editText25 = "0"
//        }
//        totalSumOfTable += editText25
//
//        var editText26 : String = findViewById<EditText>(R.id.text26).text.toString()
//        if (editText26 == null) {
//            editText26 = "0"
//        }
//        totalSumOfTable += editText26
//
//        var editText27 : String = findViewById<EditText>(R.id.text27).text.toString()
//        if (editText27 == null) {
//            editText27 = "0"
//        }
//        totalSumOfTable += editText27
//
//        var editText28 : String = findViewById<EditText>(R.id.text28).text.toString()
//        if (editText28 == null) {
//            editText28 = "0"
//        }
//        totalSumOfTable += editText28
//
//        var editText29 : String = findViewById<EditText>(R.id.text29).text.toString()
//        if (editText29 == null) {
//            editText29 = "0"
//        }
//        totalSumOfTable += editText29
//
//        var editText30 : String = findViewById<EditText>(R.id.text30).text.toString()
//        if (editText30 == null) {
//            editText30 = "0"
//        }
//        totalSumOfTable += editText30
//
//        var editText31 : String = findViewById<EditText>(R.id.text31).text.toString()
//        if (editText31 == null) {
//            editText31 = "0"
//        }
//        totalSumOfTable += editText31
//
//        var editText32 : String = findViewById<EditText>(R.id.text32).text.toString()
//        if (editText32 == null) {
//            editText32 = "0"
//        }
//        totalSumOfTable += editText32
//
//        var editText33 : String = findViewById<EditText>(R.id.text33).text.toString()
//        if (editText33 == null) {
//            editText33 = "0"
//        }
//        totalSumOfTable += editText33
//
//        var editText34 : String = findViewById<EditText>(R.id.text34).text.toString()
//        if (editText34 == null) {
//            editText34 = "0"
//        }
//        totalSumOfTable += editText34
//
//        var editText35 : String = findViewById<EditText>(R.id.text35).text.toString()
//        if (editText35 == null) {
//            editText35 = "0"
//        }
//        totalSumOfTable += editText35
//
//        var editText36 : String = findViewById<EditText>(R.id.text36).text.toString()
//        if (editText36 == null) {
//            editText36 = "0"
//        }
//        totalSumOfTable += editText36
//
//        var editText37 : String = findViewById<EditText>(R.id.text37).text.toString()
//        if (editText37 == null) {
//            editText37 = "0"
//        }
//        totalSumOfTable += editText37
//
//        var editText38 : String = findViewById<EditText>(R.id.text38).text.toString()
//        if (editText38 == null) {
//            editText38 = "0"
//        }
//        totalSumOfTable += editText38
//
//        var editText39 : String = findViewById<EditText>(R.id.text39).text.toString()
//        if (editText39 == null) {
//            editText39 = "0"
//        }
//        totalSumOfTable += editText39
//
//        var editText40 : String = findViewById<EditText>(R.id.text40).text.toString()
//        if (editText40 == null) {
//            editText40 = "0"
//        }
//        totalSumOfTable += editText40
//
//        var editText41 : String = findViewById<EditText>(R.id.text41).text.toString()
//        if (editText41 == null) {
//            editText41 = "0"
//        }
//        totalSumOfTable += editText41
//
//        var editText42 : String = findViewById<EditText>(R.id.text42).text.toString()
//        if (editText41 == null) {
//            editText42 = "0"
//        }
//        totalSumOfTable += editText42
//
//        var editText43 : String = findViewById<EditText>(R.id.text43).text.toString()
//        if (editText43 == null) {
//            editText43 = "0"
//        }
//        totalSumOfTable += editText43
//
//        var editText44 : String = findViewById<EditText>(R.id.text44).text.toString()
//        if (editText44 == null) {
//            editText44 = "0"
//        }
//        totalSumOfTable += editText44
//
//        var editText45 : String = findViewById<EditText>(R.id.text45).text.toString()
//        if (editText45 == null) {
//            editText45 = "0"
//        }
//        totalSumOfTable += editText45
//
//        var editText46 : String = findViewById<EditText>(R.id.text46).text.toString()
//        if (editText46 == null) {
//            editText46 = "0"
//        }
//        totalSumOfTable += editText46
//
//        var editText47 : String = findViewById<EditText>(R.id.text47).text.toString()
//        if (editText47 == null) {
//            editText47 = "0"
//        }
//        totalSumOfTable += editText47
//
//        var editText48 : String = findViewById<EditText>(R.id.text48).text.toString()
//        if (editText48 == null) {
//            editText48 = "0"
//        }
//        totalSumOfTable += editText48
//
//        var editText49 : String = findViewById<EditText>(R.id.text49).text.toString()
//        if (editText49 == null) {
//            editText49 = "0"
//        }
//        totalSumOfTable += editText49
//
//        var editText50 : String = findViewById<EditText>(R.id.text50).text.toString()
//        if (editText50 == null) {
//            editText50 = "0"
//        }
//        totalSumOfTable += editText50
//
//        var editText51 : String = findViewById<EditText>(R.id.text51).text.toString()
//        if (editText51 == null) {
//            editText51 = "0"
//        }
//        totalSumOfTable += editText51
//
//        var editText52 : String = findViewById<EditText>(R.id.text52).text.toString()
//        if (editText52 == null) {
//            editText52 = "0"
//        }
//        totalSumOfTable += editText52
//
//        var editText53 : String = findViewById<EditText>(R.id.text53).text.toString()
//        if (editText53 == null) {
//            editText53 = "0"
//        }
//        totalSumOfTable += editText53
//
//        var editText54 : String = findViewById<EditText>(R.id.text54).text.toString()
//        if (editText54 == null) {
//            editText54 = "0"
//        }
//        totalSumOfTable += editText54
//
//        var editText55 : String = findViewById<EditText>(R.id.text55).text.toString()
//        if (editText55 == null) {
//            editText55 = "0"
//        }
//        totalSumOfTable += editText55
//
//        var editText56 : String = findViewById<EditText>(R.id.text56).text.toString()
//        if (editText56 == null) {
//            editText56 = "0"
//        }
//        totalSumOfTable += editText56
//
//        var editText57 : String = findViewById<EditText>(R.id.text57).text.toString()
//        if (editText57 == null) {
//            editText57 = "0"
//        }
//        totalSumOfTable += editText57
//
//        var editText58 : String = findViewById<EditText>(R.id.text58).text.toString()
//        if (editText58 == null) {
//            editText58 = "0"
//        }
//        totalSumOfTable += editText58
//
//        var editText59 : String = findViewById<EditText>(R.id.text59).text.toString()
//        if (editText59 == null) {
//            editText59 = "0"
//        }
//        totalSumOfTable += editText59
//
//        var editText60 : String = findViewById<EditText>(R.id.text60).text.toString()
//        if (editText60 == null) {
//            editText60 = "0"
//        }
//        totalSumOfTable += editText60
//
//        var editText61 : String = findViewById<EditText>(R.id.text61).text.toString()
//        if (editText61 == null) {
//            editText61 = "0"
//        }
//        totalSumOfTable += editText61
//
//        var editText62 : String = findViewById<EditText>(R.id.text62).text.toString()
//        if (editText62 == null) {
//            editText62 = "0"
//        }
//        totalSumOfTable += editText62
//
//        var editText63 : String = findViewById<EditText>(R.id.text63).text.toString()
//        if (editText63 == null) {
//            editText63 = "0"
//        }
//        totalSumOfTable += editText63
//
//        var editText64 : String = findViewById<EditText>(R.id.text64).text.toString()
//        if (editText64 == null) {
//            editText64 = "0"
//        }
//        totalSumOfTable += editText64
//
//        var editText65 : String = findViewById<EditText>(R.id.text65).text.toString()
//        if (editText65 == null) {
//            editText65 = "0"
//        }
//        totalSumOfTable += editText65
//
//        var editText66 : String = findViewById<EditText>(R.id.text66).text.toString()
//        if (editText66 == null) {
//            editText66 = "0"
//        }
//        totalSumOfTable += editText66
//
//        var editText67 : String = findViewById<EditText>(R.id.text67).text.toString()
//        if (editText67 == null) {
//            editText67 = "0"
//        }
//        totalSumOfTable += editText67
//
//        var editText68 : String = findViewById<EditText>(R.id.text68).text.toString()
//        if (editText68 == null) {
//            editText68 = "0"
//        }
//        totalSumOfTable += editText68
//
//        var editText69 : String = findViewById<EditText>(R.id.text69).text.toString()
//        if (editText69 == null) {
//            editText69 = "0"
//        }
//        totalSumOfTable += editText69
//
//        var editText70 : String = findViewById<EditText>(R.id.text70).text.toString()
//        if (editText70 == null) {
//            editText70 = "0"
//        }
//        totalSumOfTable += editText70
//
//        var editText71 : String = findViewById<EditText>(R.id.text71).text.toString()
//        if (editText71 == null) {
//            editText71 = "0"
//        }
//        totalSumOfTable += editText71
//
//        var editText72 : String = findViewById<EditText>(R.id.text72).text.toString()
//        if (editText72 == null) {
//            editText72 = "0"
//        }
//        totalSumOfTable += editText72
//
//        var editText73 : String = findViewById<EditText>(R.id.text73).text.toString()
//        if (editText73 == null) {
//            editText73 = "0"
//        }
//        totalSumOfTable += editText73
//
//        var editText74 : String = findViewById<EditText>(R.id.text74).text.toString()
//        if (editText74 == null) {
//            editText74 = "0"
//        }
//        totalSumOfTable += editText74
//
//        var editText75 : String = findViewById<EditText>(R.id.text75).text.toString()
//        if (editText75 == null) {
//            editText75 = "0"
//        }
//        totalSumOfTable += editText75
//
//        var editText76 : String = findViewById<EditText>(R.id.text76).text.toString()
//        if (editText76 == null) {
//            editText76 = "0"
//        }
//        totalSumOfTable += editText76
//
//        var editText77 : String = findViewById<EditText>(R.id.text77).text.toString()
//        if (editText77 == null) {
//            editText77 = "0"
//        }
//        totalSumOfTable += editText77
//
//        var editText78 : String = findViewById<EditText>(R.id.text78).text.toString()
//        if (editText78 == null) {
//            editText78 = "0"
//        }
//        totalSumOfTable += editText78
//
//        var editText79 : String = findViewById<EditText>(R.id.text79).text.toString()
//        if (editText79 == null) {
//            editText79 = "0"
//        }
//        totalSumOfTable += editText79
//
//        var editText80 : String = findViewById<EditText>(R.id.text80).text.toString()
//        if (editText80 == null) {
//            editText80 = "0"
//        }
//        totalSumOfTable += editText80
//
//        var editText81 : String = findViewById<EditText>(R.id.text81).text.toString()
//        if (editText81 == null) {
//            editText81 = "0"
//        }
//        totalSumOfTable += editText81
        return totalSumOfTable
    }
}