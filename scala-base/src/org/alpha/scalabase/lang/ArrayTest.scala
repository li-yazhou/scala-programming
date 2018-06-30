package org.alpha.scalabase.lang

import scala.collection.mutable.ArrayBuffer

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 15:33
  */
object ArrayTest {

    def main(args: Array[String]): Unit = {
        testArray()
        testArrayBuffer()
        println("--------------------")
        testYieldArray()
        println("--------------------")
        testFilterAndMap()
        println("--------------------")
        testMkString()
    }


    def testMkString(): Unit = {
        val array = Array("aaa", "bbb", "ccc")
        val str = array.mkString(", ")
        println(str)
    }


    def testFilterAndMap(): Unit = {
        val array = Array(0, 1, 2, 3, 4, 5)
        // array.filter(_ % 2 == 0).map(print(_))
        val newArray = array.filter(_ % 2 == 1).map(_ * 2)
        println("testFilterAndMap")
        printArray(newArray)
    }


    def testYieldArray(): Unit = {
        val array = Array(1, 2, 3, 4, 5)
        val newArray = for (element <- array) yield element * element
        printArray(newArray)

        val evenArray = for (element <- array if element % 2 == 0) yield element
        printArray(evenArray)
    }


    def getRange(): Unit = {
        val seqRange = 0 to 10
        val seqRange2 = 0 until 11

        val oddRange = 1 to 10 by 2
        val evenRange = 0 to (10, 2)

        val reverseRange = 10 to 0 by -1
        val reverseRange2 = (0 to 10).reverse
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

    /**
      * 变长数组
      */
    def testArrayBuffer(): Unit =  {
        // 推荐使用第一种定义变长数组的方式，仅仅比定长数组少(length)，便于记忆
        val arrayBuffer1 = new ArrayBuffer[Int]
        val arrayBuffer2 = ArrayBuffer[Int]()

        // 在变长数组末尾添加元素
        arrayBuffer1 += 1
        arrayBuffer1 += 2
        arrayBuffer2 += (1, 2)
        arrayBuffer2 ++= Array(3, 4, 5)

        printArray(arrayBuffer2.toArray)

        // 在指定位置插入元素
        arrayBuffer2.insert(0, 100)
        arrayBuffer2.insert(0, -1, -2, -3)

        // 删除元素
        arrayBuffer2.remove(0)
        arrayBuffer2.remove(0, 1)
        arrayBuffer2.trimEnd(2)

        // 变长数组和定长数组之间互相转换
        val arr = arrayBuffer2.toArray

        val newArrayBuffer = arr.toBuffer
    }

    /**
      * 定长数组
      */
    def testArray(): Unit = {

        // 创建长度为10的Int数组，每个元素的默认值均是 0
        val nums = new Array[Int](10)
        println(nums(5))

        // 定义并初始化数组，不需要指定元素类型
        val strs = Array("zz", "dd")
        println(strs(0))
    }

}
