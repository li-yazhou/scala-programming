package org.alpha.scalabase.lang

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/7/28
  */
object IfDemo {

  def main(args: Array[String]): Unit = {

    ifDemo()

    println("-" * 20)

  }

  /* ********* 条件表达式有返回值 ********* */
  def ifDemo(): Unit = {
    val age = 10
    val result = if (age > 16) "adult" else "child"
    println(result)

    val complexResult = if (age > 16) {
      println("age > 16, is an adult")
      "adult"
    } else {
      println("age <= 16, is a child")
      "child"
    }
    println("complexResult = " + complexResult)
  }
}
