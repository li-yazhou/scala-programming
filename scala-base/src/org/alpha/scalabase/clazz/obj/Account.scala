package org.alpha.scalabase.clazz.obj

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

  def accessCompanionObjectMember(): Unit = {
    val privateMemberVal = Account.lastNumber
    println(privateMemberVal)
  }

}

/*
 companion object，伴生对象

 单例对象，静态方法

 类和它的伴生对象可以互相访问私有特性，它们必须存在于同一个源文件中。

 类访问其伴生对象的成员时，不可省略对象名（类名）

*/

object Account {
  private var lastNumber = 0

  def newUniqueNumber(): Int = {
    lastNumber += 1
    lastNumber
  }
}
