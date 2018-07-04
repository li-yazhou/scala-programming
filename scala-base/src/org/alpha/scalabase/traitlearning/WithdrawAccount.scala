package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/4 21:59
  */
abstract class WithdrawAccount extends Account with RichLogger {

    def withdraw(account: Double): Unit = {
        if (account > balance) {
            severe("severe: Insufficient funds.")
        } else {
            balance -= account
        }
        println("balance = " + balance)
    }
}

object WithdrawAccount {
    def main(args: Array[String]): Unit = {
        val withdrawAccount = new WithdrawAccount {
            override def log(msg: String): Unit = {
                println(msg)
            }
        }
        withdrawAccount.withdraw(100)
        println("-" * 50)
        val withdrawAccount2 = new WithdrawAccount() with RichLoggerImpl
        withdrawAccount2.withdraw(200)
    }
}
