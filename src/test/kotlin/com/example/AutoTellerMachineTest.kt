package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AutoTellerMachineTest: StringSpec({

    "should print a receipt if money is withdrawn successfully" {

        val printer=    FakePrinter()
        val bankingService= FakeBankingService(true)

        val ATM= AutoTellerMachine(bankingService, printer)
        ATM.withdraw(200)
        printer.transactionStatement shouldBe ("200 withdrawn successfully.")
    }

    "should print an error if banking service throws an Exception" {

        val printer=    FakePrinter()
        val bankingService= FakeBankingService(false)

        val ATM= AutoTellerMachine(bankingService, printer)
        ATM.withdraw(200)
        printer.transactionStatement shouldBe ("Error occurred during transaction.")
    }

    "should print an error if amount entered is invalid" {

        val printer=    FakePrinter()
        val bankingService= FakeBankingService(true)

        val ATM= AutoTellerMachine(bankingService, printer)
        ATM.withdraw(-200)
        printer.transactionStatement shouldBe ("Error occurred during transaction.")
    }
})