package org.patch.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:26
  */
object TupleTest {
    def main(args: Array[String]): Unit = {
        testTuple()
        print("-" * 20 + "\n")
        testZip()
    }

    def testZip(): Unit = {
        val symbols = Array("<", "-", ">")
        val counts = Array(1, 10, 1)
        val pairs = symbols.zip(counts)
        for((k, v) <- pairs) {
            Console.print(k * v)
        }
        println()
    }

    def testTuple(): Unit = {
        val tuple = ("liyazhou", 23, "China.Beijing")

        val name = tuple._1
        val age = tuple._2
        val address = tuple._3
        val content = "name = " + name + ", " + "age = " + age + ", " + "address = " + address
        println("content = [" + content + "]")
    }

}
