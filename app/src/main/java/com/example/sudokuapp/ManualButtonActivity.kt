package com.example.sudokuapp

import android.app.AppComponentFactory
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ManualButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualbutton)
        grabAllText()
    }
    private fun grabAllText() {
        var totalSumOfTable : String = ""

        var editText : String = findViewById<EditText>(R.id.text1).text.toString()
        if (editText == null) {
            editText = "0"
        }
        totalSumOfTable += editText

        var editText2 : String = findViewById<EditText>(R.id.text2).text.toString()
        if (editText2 == null) {
            editText2 = "0"
        }
        totalSumOfTable += editText2

        var editText3 : String = findViewById<EditText>(R.id.text3).text.toString()
        if (editText3 == null) {
            editText3 = "0"
        }
        totalSumOfTable += editText3

        var editText4 : String = findViewById<EditText>(R.id.text4).text.toString()
        if (editText4 == null) {
            editText4 = "0"
        }
        totalSumOfTable += editText4

        var editText5 : String = findViewById<EditText>(R.id.text5).text.toString()
        if (editText5 == null) {
            editText5 = "0"
        }
        totalSumOfTable += editText5

        var editText6 : String = findViewById<EditText>(R.id.text6).text.toString()
        if (editText6 == null) {
            editText6 = "0"
        }
        totalSumOfTable += editText6

        var editText7 : String = findViewById<EditText>(R.id.text7).text.toString()
        if (editText7 == null) {
            editText7 = "0"
        }
        totalSumOfTable += editText7

        var editText8 : String = findViewById<EditText>(R.id.text8).text.toString()
        if (editText8 == null) {
            editText8 = "0"
        }
        totalSumOfTable += editText8

        var editText9 : String = findViewById<EditText>(R.id.text9).text.toString()
        if (editText9 == null) {
            editText9 = "0"
        }
        totalSumOfTable += editText9

        var editText10 : String = findViewById<EditText>(R.id.text10).text.toString()
        if (editText10 == null) {
            editText10 = "0"
        }
        totalSumOfTable += editText10

        var editText11 : String = findViewById<EditText>(R.id.text11).text.toString()
        if (editText11 == null) {
            editText11 = "0"
        }
        totalSumOfTable += editText11

        var editText12 : String = findViewById<EditText>(R.id.text12).text.toString()
        if (editText12 == null) {
            editText12 = "0"
        }
        totalSumOfTable += editText12

        var editText13 : String = findViewById<EditText>(R.id.text13).text.toString()
        if (editText13 == null) {
            editText13 = "0"
        }
        totalSumOfTable += editText13

        var editText14 : String = findViewById<EditText>(R.id.text14).text.toString()
        if (editText14 == null) {
            editText14 = "0"
        }
        totalSumOfTable += editText14

        var editText15 : String = findViewById<EditText>(R.id.text15).text.toString()
        totalSumOfTable += editText15

        var editText16 : String = findViewById<EditText>(R.id.text16).text.toString()
        totalSumOfTable += editText16

        var editText17 : String = findViewById<EditText>(R.id.text17).text.toString()
        totalSumOfTable += editText17

        var editText18 : String = findViewById<EditText>(R.id.text18).text.toString()
        totalSumOfTable += editText18

        var editText19 : String = findViewById<EditText>(R.id.text19).text.toString()
        totalSumOfTable += editText19

        var editText20 : String = findViewById<EditText>(R.id.text20).text.toString()
        totalSumOfTable += editText20

        var editText21 : String = findViewById<EditText>(R.id.text21).text.toString()
        totalSumOfTable += editText21

        var editText22 : String = findViewById<EditText>(R.id.text22).text.toString()
        totalSumOfTable += editText22

        var editText23 : String = findViewById<EditText>(R.id.text23).text.toString()
        totalSumOfTable += editText23

        var editText24 : String = findViewById<EditText>(R.id.text24).text.toString()
        totalSumOfTable += editText24

        var editText25 : String = findViewById<EditText>(R.id.text25).text.toString()
        totalSumOfTable += editText25

        var editText26 : String = findViewById<EditText>(R.id.text26).text.toString()
        totalSumOfTable += editText26

        var editText27 : String = findViewById<EditText>(R.id.text27).text.toString()
        totalSumOfTable += editText27

        var editText28 : String = findViewById<EditText>(R.id.text28).text.toString()
        totalSumOfTable += editText28

        var editText29 : String = findViewById<EditText>(R.id.text29).text.toString()
        totalSumOfTable += editText29

        var editText30 : String = findViewById<EditText>(R.id.text30).text.toString()
        totalSumOfTable += editText30

        var editText31 : String = findViewById<EditText>(R.id.text31).text.toString()
        totalSumOfTable += editText31

        var editText32 : String = findViewById<EditText>(R.id.text32).text.toString()
        totalSumOfTable += editText32

        var editText33 : String = findViewById<EditText>(R.id.text33).text.toString()
        totalSumOfTable += editText33

        var editText34 : String = findViewById<EditText>(R.id.text34).text.toString()
        totalSumOfTable += editText34

        var editText35 : String = findViewById<EditText>(R.id.text35).text.toString()
        totalSumOfTable += editText35

        var editText36 : String = findViewById<EditText>(R.id.text36).text.toString()
        totalSumOfTable += editText36

        var editText37 : String = findViewById<EditText>(R.id.text37).text.toString()
        totalSumOfTable += editText37

        var editText38 : String = findViewById<EditText>(R.id.text38).text.toString()
        totalSumOfTable += editText38

        var editText39 : String = findViewById<EditText>(R.id.text39).text.toString()
        totalSumOfTable += editText39

        var editText40 : String = findViewById<EditText>(R.id.text40).text.toString()
        totalSumOfTable += editText40

        var editText41 : String = findViewById<EditText>(R.id.text41).text.toString()
        totalSumOfTable += editText41

        var editText42 : String = findViewById<EditText>(R.id.text42).text.toString()
        totalSumOfTable += editText42

        var editText43 : String = findViewById<EditText>(R.id.text43).text.toString()
        totalSumOfTable += editText43

        var editText44 : String = findViewById<EditText>(R.id.text44).text.toString()
        totalSumOfTable += editText44

        var editText45 : String = findViewById<EditText>(R.id.text45).text.toString()
        totalSumOfTable += editText45

        var editText46 : String = findViewById<EditText>(R.id.text46).text.toString()
        totalSumOfTable += editText46

        var editText47 : String = findViewById<EditText>(R.id.text47).text.toString()
        totalSumOfTable += editText47

        var editText48 : String = findViewById<EditText>(R.id.text48).text.toString()
        totalSumOfTable += editText48

        var editText49 : String = findViewById<EditText>(R.id.text49).text.toString()
        totalSumOfTable += editText49

        var editText50 : String = findViewById<EditText>(R.id.text50).text.toString()
        totalSumOfTable += editText50

        var editText51 : String = findViewById<EditText>(R.id.text51).text.toString()
        totalSumOfTable += editText51

        var editText52 : String = findViewById<EditText>(R.id.text52).text.toString()
        totalSumOfTable += editText52

        var editText53 : String = findViewById<EditText>(R.id.text53).text.toString()
        totalSumOfTable += editText53

        var editText54 : String = findViewById<EditText>(R.id.text54).text.toString()
        totalSumOfTable += editText54

        var editText55 : String = findViewById<EditText>(R.id.text55).text.toString()
        totalSumOfTable += editText55

        var editText56 : String = findViewById<EditText>(R.id.text56).text.toString()
        totalSumOfTable += editText56

        var editText57 : String = findViewById<EditText>(R.id.text57).text.toString()
        totalSumOfTable += editText57

        var editText58 : String = findViewById<EditText>(R.id.text58).text.toString()
        totalSumOfTable += editText58

        var editText59 : String = findViewById<EditText>(R.id.text59).text.toString()
        totalSumOfTable += editText59

        var editText60 : String = findViewById<EditText>(R.id.text60).text.toString()
        totalSumOfTable += editText60

        var editText61 : String = findViewById<EditText>(R.id.text61).text.toString()
        totalSumOfTable += editText61

        var editText62 : String = findViewById<EditText>(R.id.text62).text.toString()
        totalSumOfTable += editText62

        var editText63 : String = findViewById<EditText>(R.id.text63).text.toString()
        totalSumOfTable += editText63

        var editText64 : String = findViewById<EditText>(R.id.text64).text.toString()
        totalSumOfTable += editText64

        var editText65 : String = findViewById<EditText>(R.id.text65).text.toString()
        totalSumOfTable += editText65

        var editText66 : String = findViewById<EditText>(R.id.text66).text.toString()
        totalSumOfTable += editText66

        var editText67 : String = findViewById<EditText>(R.id.text67).text.toString()
        totalSumOfTable += editText67

        var editText68 : String = findViewById<EditText>(R.id.text68).text.toString()
        totalSumOfTable += editText68

        var editText69 : String = findViewById<EditText>(R.id.text69).text.toString()
        totalSumOfTable += editText69

        var editText70 : String = findViewById<EditText>(R.id.text70).text.toString()
        totalSumOfTable += editText70

        var editText71 : String = findViewById<EditText>(R.id.text71).text.toString()
        totalSumOfTable += editText71

        var editText72 : String = findViewById<EditText>(R.id.text72).text.toString()
        totalSumOfTable += editText72

        var editText73 : String = findViewById<EditText>(R.id.text73).text.toString()
        totalSumOfTable += editText73

        var editText74 : String = findViewById<EditText>(R.id.text74).text.toString()
        totalSumOfTable += editText74

        var editText75 : String = findViewById<EditText>(R.id.text75).text.toString()
        totalSumOfTable += editText75

        var editText76 : String = findViewById<EditText>(R.id.text76).text.toString()
        totalSumOfTable += editText76

        var editText77 : String = findViewById<EditText>(R.id.text77).text.toString()
        totalSumOfTable += editText77

        var editText78 : String = findViewById<EditText>(R.id.text78).text.toString()
        totalSumOfTable += editText78

        var editText79 : String = findViewById<EditText>(R.id.text79).text.toString()
        totalSumOfTable += editText79

        var editText80 : String = findViewById<EditText>(R.id.text80).text.toString()
        totalSumOfTable += editText80

        var editText81 : String = findViewById<EditText>(R.id.text81).text.toString()
        totalSumOfTable += editText81
    }
}