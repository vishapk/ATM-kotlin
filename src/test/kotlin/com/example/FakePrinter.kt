package com.example

class FakePrinter: Printer {

    var countTransaction: Int=0
    var transactionStatement: String=""

    override fun printStatement(transactionStatement: String){
        countTransaction++
        this.transactionStatement=transactionStatement
    }
}