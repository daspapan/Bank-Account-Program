package com.example.bankaccountprogramm

fun main(){
    val dasBankAC = BankAccount("Papan Das", 300.00)

    println("Accout Holder: ${dasBankAC.accountHolder}")
    println("Opening Balance: ${dasBankAC.balance} ")

    dasBankAC.deposit(randAmtGen())
    dasBankAC.withdraw(randAmtGen())
    dasBankAC.deposit(randAmtGen())
    dasBankAC.withdraw(randAmtGen())
    dasBankAC.deposit(randAmtGen())
    dasBankAC.withdraw(randAmtGen())

    println("Closing Balance: ${dasBankAC.balance} ")
    println(dasBankAC.displayTransactionHistory())
}

fun randAmtGen():Double{
    val num = (10..50).random()
    return num.toDouble()
}