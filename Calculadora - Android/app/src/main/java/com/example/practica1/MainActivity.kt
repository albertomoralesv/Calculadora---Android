package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClearAll.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            screen.text = "0"
        }
        buttonClear.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
                screen.text = screen2.text
            }
            if (screen.text=="0") {
                screen.text = "0"
            }else if(screen.text[screen.text.length-1] == ' '){
                screen.text = screen.text.dropLast(3)
            }else{
                screen.text = screen.text.dropLast(1)
            }
            if (screen.text.isEmpty()){
                screen.text = "0"
            }
        }
        button0.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "0"
            }else if (screen.text[screen.text.length-1] != ' '){
                screen.text = screen.text.toString() + "0"
            }
        }
        button1.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "1"
            }else{
                screen.text = screen.text.toString() + "1"
            }
        }
        button2.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "2"
            }else{
                screen.text = screen.text.toString() + "2"
            }
        }
        button3.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "3"
            }else{
                screen.text = screen.text.toString() + "3"
            }
        }
        button4.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "4"
            }else{
                screen.text = screen.text.toString() + "4"
            }
        }
        button5.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "5"
            }else{
                screen.text = screen.text.toString() + "5"
            }
        }
        button6.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "6"
            }else{
                screen.text = screen.text.toString() + "6"
            }
        }
        button7.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "7"
            }else{
                screen.text = screen.text.toString() + "7"
            }
        }
        button8.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "8"
            }else{
                screen.text = screen.text.toString() + "8"
            }
        }
        button9.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "9"
            }else{
                screen.text = screen.text.toString() + "9"
            }
        }
        buttonDivision.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
                if (screen3.text.toString() != "0"){
                    screen.text = screen3.text.toString() + " / "
                }
            }
            if (screen.text != "0" && screen.text[screen.text.length-1] != ' ' && screen.text.length < 197) {
                screen.text = screen.text.toString() + " / "
            }
        }
        buttonMultiply.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
                if (screen3.text.toString() != "0"){
                    screen.text = screen3.text.toString() + " * "
                }
            }
            if (screen.text != "0" && screen.text[screen.text.length-1] != ' ' && screen.text.length < 197) {
                screen.text = screen.text.toString() + " * "
            }
        }
        buttonSubtraction.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
                if (screen3.text.toString() != "0"){
                    screen.text = screen3.text.toString() + " - "
                }
            }
            if (screen.text == "0"){
                screen.text = screen.text.toString() + " - "
            } else if (screen.text[screen.text.length-1] != ' ' && screen.text.length < 197) {
                screen.text = screen.text.toString() + " - "
            }
        }
        buttonAddition.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
                if (screen3.text.toString() != "0"){
                    screen.text = screen3.text.toString() + " + "
                }
            }
            if (screen.text != "0" && screen.text[screen.text.length-1] != ' ' && screen.text.length < 197) {
                screen.text = screen.text.toString() + " + "
            }
        }
        buttonEqual.setOnClickListener{
            if (screen.visibility == View.GONE){
                screen.visibility = View.VISIBLE
                screen2.visibility = View.GONE
                screen3.visibility = View.GONE
            }
            if (screen.text=="0") {
                screen.text = "0"
            }
            else if (screen.text[screen.text.length-1] != ' '){
                screen.text = screen.text.toString() + " = "
                val fullOperation:String = screen.text as String
                val numbers = ArrayList<Double>()
                val operations = ArrayList<Char>()
                var number = ""
                for (element in fullOperation){
                    if (element.code in 48..57 || element == '.' || (fullOperation[0] == '-' && element == '-' && number == "")){
                        number += element
                    }else if (element == '*' || element == '/' || element == '+' || element == '-' || element == '='){
                        numbers.add(number.toDouble())
                        operations.add(element)
                        number = ""
                    }
                }
                if (numbers.isEmpty()){
                    numbers.add(number.toDouble())
                }
                var result:Double? = null
                var multiplications = true
                var divisions = true
                var additions = true
                var subtractions = true
                var multiplicationIndex:Int = -1
                var divisionIndex:Int = -1
                var additionIndex: Int = -1
                var subtractionIndex: Int = -1
                val indices = ArrayList<Int>()
                var currentIndex: Int
                var operator = "?"
                var newNumber = 0.0
                while (result == null){
                    if (multiplications){
                        multiplicationIndex = operations.indexOf('*')
                        if (multiplicationIndex == -1){
                            multiplications = false
                        }
                    }
                    if (divisions){
                        divisionIndex = operations.indexOf('/')
                        if (divisionIndex == -1){
                            divisions = false
                        }
                    }
                    if (additions){
                        additionIndex = operations.indexOf('+')
                        if (additionIndex == -1){
                            additions = false
                        }
                    }
                    if (subtractions){
                        subtractionIndex = operations.indexOf('-')
                        if (subtractionIndex == -1){
                            subtractions = false
                        }
                    }
                    if (multiplications && divisions){
                        if (multiplicationIndex < divisionIndex){
                            currentIndex = multiplicationIndex
                            operator = "*"
                        }else{
                            currentIndex = divisionIndex
                            operator = "/"
                        }
                    }else if (multiplications){
                        currentIndex = multiplicationIndex
                        operator = "*"
                    }else if(divisions){
                        currentIndex = divisionIndex
                        operator = "/"
                    }else{
                        if (additions && subtractions){
                            if (additionIndex < subtractionIndex){
                                currentIndex = additionIndex
                                operator = "+"
                            }else{
                                currentIndex = subtractionIndex
                                operator = "-"
                            }
                        }else if (additions){
                            currentIndex = additionIndex
                            operator = "+"
                        }else if (subtractions){
                            currentIndex = subtractionIndex
                            operator = "-"
                        }else{
                            operator = "?"
                            currentIndex = -1
                        }
                    }
                    indices.add(currentIndex)
                    indices.add(currentIndex+1)
                    for (i in currentIndex-1 downTo 0){
                        if (operations[i] == '?'){
                            indices.add(i)
                        }else{
                            break
                        }
                    }
                    for (i in currentIndex+1 until operations.size-1){
                        if (operations[i] == '?'){
                            indices.add(i+1)
                        }else{
                            break
                        }
                    }
                    when(operator){
                        "*" ->  newNumber = (numbers[currentIndex+1] * numbers[currentIndex])
                        "/" -> newNumber = (numbers[currentIndex] / numbers[currentIndex+1])
                        "+" -> newNumber = (numbers[currentIndex+1] + numbers[currentIndex])
                        "-" -> newNumber = (numbers[currentIndex] - numbers[currentIndex+1])
                        else -> result = numbers[0]
                    }
                    if (currentIndex != -1){
                        for (index in indices){
                            numbers[index] = newNumber
                        }
                        indices.clear()
                        operations[currentIndex] = '?'
                    }
                }
                screen2.text = fullOperation
                screen3.text = result.toString()
                if (screen3.text.length > 15){
                    screen3.textSize = 40F - (screen3.text.length - 15) * 1.75F
                }
                screen.text = "0"
                screen.visibility = View.GONE
                screen2.visibility = View.VISIBLE
                screen3.visibility = View.VISIBLE
            }


        }
    }
}