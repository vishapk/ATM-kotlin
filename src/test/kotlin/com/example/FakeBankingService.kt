package com.example

class FakeBankingService(val shouldSucceed: Boolean): BankingService {

    var amountWithdrawn=0

    override fun withdraw(amountToWithdraw: Int){
        if(amountToWithdraw<0 || !shouldSucceed)    throw error("Invalid Amount")
        else        amountWithdrawn+=amountToWithdraw
    }
}