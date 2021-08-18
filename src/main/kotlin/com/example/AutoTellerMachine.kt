package com.example

import java.lang.Exception

class AutoTellerMachine(val bankingService: BankingService, val printer: Printer){

    fun withdraw(amount: Int) {
        try {
            bankingService.withdraw(amount)
            printer.printStatement("$amount withdrawn successfully.")
        }catch (E: Exception){
            printer.printStatement("Error occurred during transaction.")
        }
    }
}