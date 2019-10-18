package com.globant.lyfecycles

class PiggyBank(var one: Int, var two: Int, var five: Int, var open: Boolean) {

    fun openPiggyBank(): String {
        open = true
        return "PiggyBank now is Opened " + getTotalValue()
    }

    fun closePiggyBank(): String {
        open = false
        return "PiggyBank now is Closed"
    }

    fun deposit(_one: Int, _two: Int, _five: Int): String {
        return if (open) {
            one += _one
            two += _two
            five += _five
            getTotalValue()
        } else {
            closePiggyBank()
        }
    }

    fun getTotalValue(): String {
        val totalValue = (one * 100) + (two * 200) + (five * 5000)
        return "Balance: $totalValue"
    }

    fun areThereFunds(): String {
        return if (five > 0 && one > 0 && two > 0) {
            getTotalValue()
        } else {
            "Insufficient funds"
        }
    }

    fun getFounds(_one: Int, _two: Int, _five: Int): String {
        if (open) {
            if (_five > five) {
                println("Insufficient funds")
            } else {
                five -= _five
            }
            if (_one > one) {
                println("Insufficient funds")
            } else {
                one -= _one
            }
            if (_two > two) {
                println("Insufficient funds")
            } else {
                two -= _two
            }

        } else {
            println("PiggyBank is closed")
        }
        return getTotalValue()
    }
}
fun main() {
    println("Hello, world!!!")
    val blondePiggyBank = PiggyBank(10, 10, 5, true)
    blondePiggyBank.openPiggyBank()
    blondePiggyBank.getTotalValue()
    blondePiggyBank.areThereFunds()
    blondePiggyBank.deposit(1, 1, 2)
    blondePiggyBank.closePiggyBank()
}

