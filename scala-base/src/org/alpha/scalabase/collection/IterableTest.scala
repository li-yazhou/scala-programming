package org.alpha.scalabase.collection

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 10:49
  */
class IterableTest extends FunSuite {

    /*
    def main(args: Array[String]): Unit = {

    }
    */

    test("head, tail") {
        val intList = List(1, 2, 3, 4, 5, 6)
        println("head = " + intList.head)
        println("tail = " + intList.tail)
        println("tail.head = " + intList.tail.head)
    }


    test("length, isEmpty") {
        val strList = List("lyz", "zz", "xz", "yz")
        println("length = " + strList.length)
        println("isEmpty = " + strList.isEmpty)

        println("length = " + List.empty.length)
        println("isEmpty = " + List.empty.isEmpty)
    }


    test("map, flatMap") {
        println("list.map(f), only map")
        val intList = List(1, 2, 3, 4, 5, 6)
        println("intList = " + intList)

        val newList = intList.map(
            x => List(x, x * x)
        )
        println("map = " + newList)

        println("list.flatMap(f), map and flat")
        var _1DimList = intList.flatMap(
            x => List(x, x * x)
        )
        println("flatMap = " + _1DimList)

        _1DimList = intList.flatMap(
            x => x match {
                case 1 => List(x)
                case 2 => List(x)
                case _ => List(x, x * 100)
            }
        )
        println("flatMap = " + _1DimList)
    }


    test("flatMap") {
        val names = List("lyz", "wcs", "ldf")
        def lucases(name: String) = Vector(name, name.toLowerCase(), name.toUpperCase())
        val lunames = names.flatMap(lucases)
        println("names = " + names)
        println("lunames = " + lunames)
    }


    test("flatMap vs foreach") {
        // for (i <- 1 to 9; j <- 1 to i)  println(i + " * " + j + " = " + i * j)
        for (i <- 1 to 9) {
            for (j <- 1 to i) {
                print(i + " * " + j + " = " + (i * j) + ", \t")
            }
            println()
        }

        val seq = for (i <- 1 to 9; j <- 1 to i) yield i * j

        (1 to 9).map(i => for (j <- 1 to i) println(i * j) )
    }


    /**
      * map 不改变原来的集合
      * transform 对集合做原地修改操作
      */
    test("map vs transform") {
        // var names = List("lyz", "wcs", "ldf")
        val names = ArrayBuffer("lyz", "wcs", "ldf")
        println("names = " + names)
        names.transform(_.toUpperCase)
        println("names = " + names)
        // names.transfrom(x => x.toLowerCase)
        // println("names = " + names)
    }


}
