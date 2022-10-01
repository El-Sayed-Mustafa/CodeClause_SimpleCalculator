package com.example.simplecalculator

import com.plcoding.calculatorprep.CalculatorOperation

sealed class CalculatorAction{
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
    object Calculate: CalculatorAction()
    object Decimal: CalculatorAction()
}

