package org.alpha.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 11:42
  */
object FunctionTest {

    def main(args: Array[String]): Unit = {
        val num = abs(-10.1)
        System.out.println(num)

        val facResult = fac(5)
        println(facResult)

        // 可变参数
        val sumVal = sum(1, 2, 3, 4, 5)
        println("sum = " + sumVal)

        val s = sum(1 to 5: _*)
        println("s = " + s)

        headAndTail(0 until 10: _*)

        val recursiveSumResult = recursiveSum(1 to 5: _*)
        println("recursiveSumResult = " + recursiveSumResult)

    }


    /*
        def abs(x: Double) = if(x >= 0) x else -x
    */
    def abs(x: Double): Double = {
        if (x >= 0) x else -x
        /*
        if(x >= 0) {
            x
        }else {
            -x
        }
        */
    }

    def fac(n: Int): Int = {
        if (n <= 1) n else n * fac(n-1)
    }

    /**
      * 变长参数
      * @param args Seq参数
      * @return
      */
    def sum(args: Int*): Int = {
        var sum = 0
        for(arg <- args) {
            sum += arg
        }
        sum
    }

    def headAndTail(args: Int*): Unit = {
        if (args.isEmpty) println(0)
        else println("head = " + args.head + ", tail = " + args.tail)
    }

    /**
      * 使用Seq的head与tail递归求和
      * @param args Seq参数
      * @return
      */
    def recursiveSum(args: Int*): Int = {
        if (args.isEmpty) 0
        else args.head + recursiveSum(args.tail: _*)
    }


}
