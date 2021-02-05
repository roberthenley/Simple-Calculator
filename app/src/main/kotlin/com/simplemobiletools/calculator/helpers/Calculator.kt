package com.simplemobiletools.calculator.helpers

import android.content.Context

interface Calculator {
    fun showNewResult(value: String, context: Context, announceResult: Boolean = false)

    fun showNewFormula(value: String, context: Context)
}
