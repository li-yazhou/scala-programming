package org.patch.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 10:58
  */
object BasicDataType {
    def main(args: Array[String]): Unit = {
        testBasicDataType()
        println("-------------------------")
    }


    def testBasicDataType(): Unit = {
        val intVal = 2 * 5
        println("intVal = " + intVal)

        val doubleVal = 3.14
        // 数字类型转换
        val intTypeVal= doubleVal.toInt
        println("doubleVal = " + doubleVal + ", intTypeVal = " + intTypeVal)
    }
}
