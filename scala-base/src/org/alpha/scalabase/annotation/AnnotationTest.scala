package org.alpha.scalabase.annotation

import java.io.IOException

import org.junit.Test

import scala.annotation.strictfp

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 18:55
  */
class AnnotationTest {

    @Test(timeout = 10000)
    def testJunit(): Unit = {
        println("junit test")
    }


    def keyword(): Unit = {
        @volatile var done = false
        @transient var name = "zz"
    }

    @strictfp
    def calculate(x: Double): Double = {
        0.0
    }

    @native
    def win32RegKeys(root: Int, path: String): Array[String]


    /* @Cloneable class Employee {}*/

    class Book {
        @throws(classOf[IOException]) def read(filename: String): Unit = {
        }
    }




}
