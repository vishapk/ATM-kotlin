package com.example

class AutoTellerMachine(val bankingService: BankingService, val printer: Printer){

    fun withdraw(amount: Int) {

        try {
            bankingService.withdraw()
            printer.printStatement(amount)
        }catch (exception)
    }
}