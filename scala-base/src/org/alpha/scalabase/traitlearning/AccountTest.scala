package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/2 22:33
  */
object AccountTest {

    def main(args: Array[String]): Unit = {
        val account = new SavingAccount()
        account.withdraw(20)
    }

}
