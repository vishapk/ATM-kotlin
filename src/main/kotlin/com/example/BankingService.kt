package com.example

data class BankAccount(val accountNumber: Int, val balance: Int){
}

interface BankingService {
    fun withdraw(amount: Int) {
        //DO NOT CHANGE. ONLY FOR DEMO PURPOSES.
    }

}