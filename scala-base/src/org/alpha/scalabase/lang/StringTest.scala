package org.alpha.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 11:00
  */
object StringTest {

  def main(args: Array[String]): Unit = {
    testString()

    println("-" * 20)

    stringInterpolation()

  }

  def testString(): Unit = {
      val str = "abC"
      println(str + " => " + str.toUpperCase())
      // 没有参数且不改变当前对象的方法不用带圆括号
      println(str + " => " + str.toUpperCase)
  }

  /* ********** 字符串插值 **********/
  def stringInterpolation(): Unit = {
    val age = 20
    val name = "zz"
    val score = 366.5

    val result = f"age = $age, name = $name, origin score = $score%7.2f, total score = ${score + 20}%7.2f"
    println(result)

  }

}
