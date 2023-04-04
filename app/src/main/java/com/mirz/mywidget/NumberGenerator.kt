package com.mirz.mywidget

internal object NumberGenerator {
    fun generate(max: Int): Int {
        return (1..max).random()
    }
}