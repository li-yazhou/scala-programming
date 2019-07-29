package org.alpha.scalabase.collection

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:26
  */
object TupleTest {

  def main(args: Array[String]): Unit = {

      defineTuple()

      zipTuple()

  }

  /**
    *  定义元祖
    */
  def defineTuple(): Unit = {
      val tuple = ("zhou", 23, "China.Beijing")
      val name = tuple._1
      val age = tuple._2
      val address = tuple._3

      val content = s"name = $name, age = $age, address = $address"
      println("content = [" + content + "]")
  }


  /**
    * 对一对Array拉链操作生成数组
    */
  def zipTuple(): Unit = {
      val symbols = Array("<", "-", ">")
      val counts = Array(1, 10, 1)

      val pairs = symbols.zip(counts)

      for((k, v) <- pairs) {
          Console.print(k * v)
      }
      println()

      val keys = Array("ll", "yy", "zz")
      val values = Array(12, 22, 26)

      val arrays = keys.zip(values)
      println(s"array = $arrays")

      val map = keys.zip(values).toMap
      println(s"map = $map")
  }



}
