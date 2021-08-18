package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AutoTellerMachineTest: StringSpec({

    "should print a receipt if money is withdrawn successfully" {

        val ATM= AutoTellerMachine(FakeBankingService(), FakePrinter())
        ATM.withdraw(200)
        ATM.printer.printStatement(200) shouldBe println("200 withdrawn successfully")
    }

    "should throw exception if banking service throws an exception" {
    }
})