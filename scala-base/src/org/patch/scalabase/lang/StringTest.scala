package org.patch.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 11:00
  */
object StringTest {

    def main(args: Array[String]): Unit = {
        testString()
    }

    def testString(): Unit = {
        val str = "abC"
        println(str + " => " + str.toUpperCase())
        // 没有参数且不改变当前对象的方法不用带圆括号
        println(str + " => " + str.toUpperCase)
    }

}
