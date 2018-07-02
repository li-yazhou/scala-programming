package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/2 22:30
  */
class SavingAccount extends Account with ConsoleLogger {

    def withdraw(amount: Double): Unit = {
        if (amount > balance) {
            log("Insufficient funds.\n")
        } else {
            balance -= amount
        }
        log("balance = " + balance)
    }

}
