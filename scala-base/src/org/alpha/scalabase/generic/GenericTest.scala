package org.alpha.scalabase.generic

import org.junit.Test

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/10 22:28
  */
class GenericTest {

    /*
     * 泛型类
     */
    @Test(timeout = 5000)
    def genericClass(): Unit = {
        val pair = new Pair(22, "zz")
        println("first = " + pair.getFirst)
        println("second = " + pair.getSecond)

        val entry = new Pair("key", "value")
        println("key = " + entry.first)
        println("value = " + entry.second)
    }


    /**
      * 泛型方法
      */
    def getMiddle[T](array: Array[T]): T = {
        array(array.length/2)
    }

    @Test(timeout = 5000)
    def genericMethod(): Unit = {
        val array = Array("ll", "yy", "zz", "hh")
        val result = getMiddle(array)
        println("middle value of array = " + result)
    }


    /**
      * 泛型上界
      */
    def smaller[T <: Comparable[T]](first: T, second: T): T = {
        if (first.compareTo(second) < 0)
            first
        else
            second
    }

    @Test(timeout=5000)
    def testSmaller(): Unit = {
        val small = smaller[String]("10", "20")
        println("small value = " + small)

        val result = smaller("abc", "bca")
        println("small result = " + result)
    }


}


