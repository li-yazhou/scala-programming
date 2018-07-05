package org.alpha.scalabase.function

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/5 22:47
  */
object FunctionTest {

    def main(args: Array[String]): Unit = {

        (1 to 10).map("*" * _).foreach(println _)
        println("-" * 20)

        (1 to 9).filter(_ % 2 == 0).foreach(x => print(x + ", "))
        println()
        println("-" * 20)

        val multiply = (1 to 9).reduceLeft( _ * _)
        println("multiply = " + multiply)
        println("-" * 20)

        "Today is Thursday and it is sunny".split(" ")
                .sortWith(_.length < _.length)
                .foreach(x => print(x + ", "))
        println()
        println("-" * 20)
    }
}
