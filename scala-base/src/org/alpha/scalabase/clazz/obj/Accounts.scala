package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
object Accounts {

  println("单例对象的构造方法体，但是不能为构造方法提供参数")

  private var lastNumber = 0

  /*
    单例对象

    对象的构造器在该对象第一次被使用时调用

    不可以为对象构造器提供参数
   */
  def newUniqueNumber(): Int = {
    lastNumber += 1
    lastNumber
  }

}

object Main {

  def main(args: Array[String]): Unit = {
    for (_ <- Range(1, 5)) {
      val number = Accounts.newUniqueNumber()
      print(number + "\t")
    }
    /*
      单例对象的构造方法体，但是不能为构造方法提供参数
      1	2	3	4
     */
  }
}

