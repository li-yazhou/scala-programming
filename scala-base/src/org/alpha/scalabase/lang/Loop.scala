package org.alpha.scalabase.lang

import scala.util.control.Breaks
import scala.util.control.BreakControl
// import scala.util.control.Breaks._

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 11:20
  */
object Loop {
  def main(args: Array[String]): Unit = {
    testWhile()
    println("----------------")
    testFor()
    println("----------------")
    // testBreak()
    println("----------------")
    testForByStep()

    println("-" * 20 + "\nbreakForUsingBool")
    breakForUsingBool()

    println("-" * 20 + "\ntraverseStringElement")
    traverseStringElement()


    reverseOrder()

  }

  def testWhile(): Unit = {
      var n = 0
      while (n <= 10) {
          print(n + ", ")
          n += 1
      }
      println()
  }


  def testFor(): Unit = {
      val intRange = 0 to 10
      for (i <- intRange) {
          print(i + ", ")
      }
      println()

      val intRangeWithoutRight = 0 until 10
      for (i <- intRangeWithoutRight) {
          print(i + ", ")
      }
      println()
  }

  def testForByStep(): Unit = {
      for (x <- 10 to 1 by -1) {
          print(x + ", ")
      }
      println()
  }


  /**
    * Breaks.break
    */
  def testBreak(): Unit = {
      val str = "sunday"

      for (i <- 0 until str.length) {
          if (i == 2) {
              try {
                  // continue
                  // todo 异常问题
                  Breaks.break
              } catch {
                  case _: Exception =>
                          println("no solution.")
              } finally {
                  println("finally.")
              }
          }
          println(i + ", " + str(i))
      }
  }

  /**
    * break、continue 循环
    *
    * 使用Boolean变量break循环
    * 使用if语句实现continue语义
    */
  def breakForUsingBool(): Unit = {
    var bool = true
    var i = 0
    while (bool && i < 10) {
      print(i + " ")
      i += 1
      if (i == 5) {
        bool = false
      }
    }
    println()
  }



  def traverseStringElement(): Unit = {
    val s = "Hello, Scala"
    for (i <- 0 until s.length) {
      print(s.apply(i) + " ")
    }
  }


  def reverseOrder(): Unit = {
    println()
    for (i <- 10.to(0, -1)) {
      print(i + " ")
    }
  }


}
