package com.example

class FakeBankingService: BankingService {

    override fun withdraw(shouldSucceed: Boolean): Int {
        if(shouldSucceed)    return 100
        else    throw error("Invalid Amount")
    }
}