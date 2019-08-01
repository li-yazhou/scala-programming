package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
object ObjectApply {

  def main(args: Array[String]): Unit = {

    // 使用构造方法创建对象
    var mac = new Computer(1000.1)
    // 使用类的apply方法创建对象，比使用构造方法创建对象省略了关键字new
    var thinkPad = Computer(2000.2)


    // 使用Array构造器this(100)创建对象，结果是Array[Nothing]，包含了100个null元素
    val arrayByConstructor = new Array(100)
    // 使用apply(100)创建对象，结果是Array[Int]
    val arrayByApply = Array(100)

  }
}


class Computer private (val id: Int, initialPrice: Double) {

  private var price = initialPrice

}

object Computer {

  private var id = 0

  def newUniqueNumber(): Int = {
    id += 1
    id
  }

  def apply(initialPrice: Double) = {
    new Computer(newUniqueNumber(), 100.1)
  }
}

