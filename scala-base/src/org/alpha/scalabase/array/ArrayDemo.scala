package org.alpha.scalabase.array

import scala.collection.mutable.ArrayBuffer

/**
  * <p>Description: </p>
  *
  *
  *
  * Author: lyz
  * Date: 2018/6/24 15:33
  */
object ArrayDemo {

  /* *********  ********* */

  /*
    使用数组
      - 若长度固定则使用Array，若长度可能变化则使用ArrayBuffer
      - 提供初始值时不要使用new
      - 用()访问元素
      - 用 for(elem <- arr) 遍历元素
      - 用 for(elem <- arr if ...) yield ... 生成新数组
      - Scala数组与Java数组可以互操作；用ArrayBuffer，使用scala.collection.JavaConversions中的转换函数
   */


  def main(args: Array[String]): Unit = {

    fixedLengthArray()

    testArrayBuffer()

    traverseArray()

    yieldArray()

    filterAndMapArray()

    deleteNegativeElement()

    mkString()

    testPrintArr()

    applyArrayAlgorithm()

    multiDimensionArray()
  }


  /**
    * 定长数组
    */
  def fixedLengthArray(): Unit = {
    println("-" * 20)
    println("fixedLengthArray")

    /* ********* 创建长度为10的Int数组，每个元素的默认值均是 0 ********* */
    val numArray = new Array[Int](10)
    println(numArray(5))

    /* ********* 创建固定长度的字符串数组，所有元素的默认值是null ********* */
    val strArrayWithoutDefault = new Array[String](10)
    println(strArrayWithoutDefault(5))

    /* ********* 定义并初始化数组，不需要指定元素类型，且不使用 new ********* */
    val strs = Array("zz", "dd")
    println(strs(0))

    /* ********* 改变数组中的元素 ********* */
    strs(1) = "zhou"
    println(strs.toString)

    /* ********* 打印数组 ********* */
    print("print array: ")
    for (ch <- strs) print(ch)
    println()
  }


  /**
    * 变长数组
    */
  def testArrayBuffer(): Unit =  {
    println("-" * 20)
    println("testArrayBuffer")

    // 推荐使用第一种定义变长数组的方式，仅仅比定长数组少(length)，便于记忆
    val arrayBuffer1 = new ArrayBuffer[Int]
    val arrayBuffer2 = ArrayBuffer[Int]()

    // 在变长数组末尾添加单个元素
    arrayBuffer1 += 1
    arrayBuffer1 += 2

    // 在变长数组末尾添加多个元素
    arrayBuffer2 += (1, 2)

    // 在变长数组末尾添加数组，使用 ++=
    arrayBuffer2 ++= Array(3, 4, 5)

    printArray(arrayBuffer2.toArray)

    // 在指定位置插入单个或者多个元素
    arrayBuffer2.insert(0, 100)
    arrayBuffer2.insert(0, -1, -2, -3)

    // 删除指定下标的元素
    arrayBuffer2.remove(0)
    arrayBuffer2.remove(0, 1)

    // 删除最后n个元素
    arrayBuffer2.trimEnd(2)

    // 变长数组和定长数组之间互相转换
    val arr = arrayBuffer2.toArray
    val newArrayBuffer = arr.toBuffer
  }


  /**
    * 遍历数组
    */
  def traverseArray(): Unit = {
    println("-" * 20)
    println("traverseArray")

    val arr = Array("ll", "ya", "zz")

    // 正序遍历数组
    for (i <- 0 until arr.length) {
      println(s"arr[$i] = ${arr(i)}")
    }
    for (i <- arr.indices) {
      println(s"arr[$i] = ${arr(i)}")
    }

    // 倒序遍历数组
    for (i <- Range(arr.length-1, -1, -1)) {
      println(s"arr[$i] = ${arr(i)}")
    }
    for (i <- arr.indices.reverse) {
      println(s"arr[$i] = ${arr(i)}")
    }

    // foreach
    for (elem <- arr) {
      print(elem + " ")
    }
    println()

  }

  def yieldArray(): Unit = {
    println("-" * 20)
    println("yieldArray")

    val originArr = Array(1, 2, 3, 4, 5, 6)
    print("originArr = ")
    for (elem <- originArr) print(elem + " ")
    println()
    printArray(originArr)

    val newArr = for(elem <- originArr if elem % 2 == 0) yield elem * elem
    print("newArr = ")
    for (elem <- newArr) print(elem + " ")
    println()
    printArray(newArr)
  }


  /**
    * 转换数组
    */
  def filterAndMapArray(): Unit = {
    println("-" * 20)
    println("filterAndMapArray")
    val array = Array(0, 1, 2, 3, 4, 5)
    // array.filter(_ % 2 == 0).map(print(_))
    val oddArray = array.filter(_ % 2 == 1).map(_ * 2)
    printArray(oddArray)
  }


  def deleteNegativeElement(): Unit = {
    println("-" * 20)
    println("deleteNegativeElement")
    val originArr = Array(1, -1, 2, -2, 3, -3, 4, -4, 5, -5)
    printArray(originArr)

    // 产生新的数组
    val newArr = originArr.filter(_ >= 0).map(_ + 0)
    printArray(newArr)

    // 修改原数组
    // 方法一，收集需要删除的下标，然后从后往前删除指定下标的元素
    val originArr1 = ArrayBuffer(1, -1, 2, -2, 3, -3, 4, -4, 5, -5)
    val positionToRemove = for(i <- originArr1.indices if originArr1(i) < 0) yield i
    for (i <- positionToRemove.reverse) originArr1.remove(i)
    print("originArr1.toArray = ")
    printArray(originArr1.toArray)


    // 方法二，收集需要保留的下标，然后从前往后复制指定下标的元素，然后截断数组
    val originArr2 = ArrayBuffer(1, -1, 2, -2, 3, -3, 4, -4, 5, -5)
    val positionToKeep = for (i <- originArr2.indices if originArr2(i) >= 0) yield i
    for (j <- positionToKeep.indices) originArr2(j) = originArr2(positionToKeep(j))
    originArr2.trimEnd(originArr2.length - positionToKeep.length)
    print("originArr2.toArray = ")
    printArray(originArr2.toArray)
  }


  def mkString(): Unit = {
    println("-" * 20)
    println("mkString")
    val array = Array("aaa", "bbb", "ccc")
    val str = array.mkString(", ")
    println(str)
  }


  def testPrintArr(): Unit = {
    println("-" * 20)
    println("testPrintArr")

    val intArr = Array(1, 2, 3)
    printArr(intArr)

    val strArr = Array("aa", "bb", "cc")
    printArr(strArr)

  }


  def printArr(arr: Array[_], start: String = "[", end: String = "]") : Unit = {
    var s = start
    s += arr.mkString(", ")
    s += end
    println(s)
  }


  def printArray(arr: Array[Int], start: String = "[", end: String = "]"): Unit = {
      if (arr.isEmpty) {
          println("arr is empty.")
          return
      }
      print(start)
      /*
      for (i <- 0 until arr.length) {
          print(arr(i))
          if (i < arr.length - 1) {
              print(", ")
          }
      }
      */
      // 提升性能
      // 把数组中的元素划分为两类，一类元素后面带逗号，一类不带，然后分别处理
      // 当把两类数据统一处理时，需要设置判断条件，影响性能
      for (i <- 0 until arr.length - 1) {
          print(arr(i) + ", ")
      }
      print(arr(arr.length-1))

      print(end)
      println()
  }


  def applyArrayAlgorithm(): Unit = {
    println("-" * 20)
    println("applyArrayAlgorithm")

    val originArr = Array(5, 2, 3, 4, 1)
    println(originArr.toString())
    printArr(originArr)
    val sum = originArr.sum
    println(s"sum = $sum")

    // 数组的 sorted 方法不改变原数组，产生一个有序的新数组
    val sortedArr = originArr.sorted
    printArr(sortedArr)

    // 排序工具函数，改变原数组中元素的位置
    scala.util.Sorting.quickSort(originArr)
    printArr(originArr)

    val originBuf = ArrayBuffer("zz", "ff", "dd")
    println(originBuf.toString())
    printArr(originBuf.toArray)
    val max = originBuf.max
    println(s"max = $max")
  }


  /**
    * Array 和 ArrayBuffer 的 API
    */
  def apiForArray(): Unit = {

  }

  def multiDimensionArray(): Unit = {
    println("-" * 20)
    println("multiDimensionArray")

    val matrix = Array.ofDim[Double](3, 4)
    val elem = matrix(1)(2)
    println(s"matrix(1)(2) = $elem")
  }


}
