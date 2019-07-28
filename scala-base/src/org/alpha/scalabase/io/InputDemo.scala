package org.alpha.scalabase.io

import scala.io.StdIn
/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/7/28
  */
object InputDemo {

  def main(args: Array[String]): Unit = {
    inputNameAndAge()
  }

  def inputNameAndAge(): Unit = {
    val name = StdIn.readLine("Input Your Name: ")
    print("Input Your Age: ")
    val age = StdIn.readInt()
    println(s"name = $name, age = $age")}
}
