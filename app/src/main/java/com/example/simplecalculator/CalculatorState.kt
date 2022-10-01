package com.example.simplecalculator

import com.plcoding.calculatorprep.CalculatorOperation

data class CalculatorState( val number1: String = "",
                            val number2: String = "",
                            val operation: CalculatorOperation? = null
    )
