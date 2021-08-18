package com.example

class FakePrinter(var countTransaction: Int=0): Printer {

    override fun printStatement(transactionAmout: Int){
        countTransaction++
        val transactionStatement="$transactionAmout withdrawn successfully"
        println(transactionStatement)

    }
}