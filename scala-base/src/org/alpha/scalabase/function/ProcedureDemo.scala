package org.alpha.scalabase.function

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/7/28
  */
object ProcedureDemo {

  def main(args: Array[String]): Unit = {
    box("this is a procedure, it returns Unit")
    boxWithoutEqual("this is procedure, it is without equal symbol")
  }

  def box(content : String): Unit = {
    val border = "-" * (content.length + 2)
    println(f"$border%n|$content|%n$border%n")
  }

  def boxWithoutEqual(content: String) {
    val border = "-" * (content.length + 2)
    println(f"$border%n|$content|%n$border%n")
  }

}
