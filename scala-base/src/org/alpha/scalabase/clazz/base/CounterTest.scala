package org.alpha.scalabase.clazz.base

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:43
  */
object CounterTest {

  def main(args: Array[String]): Unit = {

    // 创建对象，调用无参构造方法时，可以省略()
    val counter = new Counter
    val counter2 = new Counter()
    println(counter)

    // 调用对象无参的方法时，可以省略()
    // 一般当方法修改成员变量（改值器）时，使用bracket
    // 当方法是取值器时，不使用bracket
    counter.increment()
    var currVal = counter.current
    println(s"currVal = $currVal")

    currVal = counter.miniCurrentWithoutBracket
    println(s"currVal = $currVal")

    currVal = counter.simpleCurrentWithoutBracket
  }



}
