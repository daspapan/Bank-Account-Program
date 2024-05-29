package com.example.bankaccountprogramm

class BankAccount (var accountHolder: String, var balance: Double){

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance = balance + amount;
        transactionHistory.add("Deposit $amount, Balance: $balance")
        // println("Balance available: $balance")
    }

    fun withdraw(amount: Double){
        balance = balance - amount;
        transactionHistory.add("Withdraw $amount, Balance: $balance")
        // println("Balance available: $balance")
    }

    fun displayTransactionHistory(){
        /*for(item in 0 until transactionHistory.size){
            println(transactionHistory[item]);
        }*/
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}