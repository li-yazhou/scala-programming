package org.patch.scalabase.lang
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

}
