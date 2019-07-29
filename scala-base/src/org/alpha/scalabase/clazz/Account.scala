package org.alpha.scalabase.clazz

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/1 10:18
  */

class Account {

    val id = Account.newUniqueNumber()

    private var balance = 0.0

    def deposit(amount: Double): Unit = {
        balance += amount
    }



}

// companion object，伴生对象
// 单例对象，静态方法
object Account {
    private var lastNumber = 0;

    def newUniqueNumber(): Int = {
        lastNumber += 1
        lastNumber
    }
}
