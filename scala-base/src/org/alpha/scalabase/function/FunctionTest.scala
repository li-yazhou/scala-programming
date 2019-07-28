package org.alpha.scalabase.function

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/5 22:47
  */
object FunctionTest {

    def main(args: Array[String]): Unit = {
      func()

      println("-" * 20)

      println(abs(-10.1))
      println(abs(10.1))

      println(decorate("Test default values of function parameters"))
      println(decorate("Test default values of function parameters", "<", ">"))
      println(decorate(left = "[", str = "Test default values of function parameters", right = "]"))

      println(sum(1, 2, 3, 4, 5))
      println(sum(1 to 5: _*))
      println(recusiveSum(1 until 6: _*))

    }

  def func() = {
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


  def abs(x : Double) = {
      if (x >= 0) x else -x
  }


  def decorate(str: String, left: String = "(", right: String = ")") = {
      left + str + right
  }


  def sum(args: Int*): Int = {
    var sum = 0
    for (arg <- args) {
      sum += arg
    }
    sum
  }


  def recusiveSum(args: Int*): Int = {
    if (args.length == 0) {
      0
    } else {
      args.head + recusiveSum(args.tail: _*)
    }
  }

}
