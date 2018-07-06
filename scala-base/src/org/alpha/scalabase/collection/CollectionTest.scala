package org.alpha.scalabase.collection

import scala.collection.mutable.ArrayBuffer

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/5 23:05
  */
object CollectionTest {

    def main(args: Array[String]): Unit = {
        coll()
        println("-" * 20)

        val digits = List(1, 2, 3, 4, 5)
        println("sum = " + sum(digits))
        println("sumElse = " + sumElse(digits))
        println("List.sum = " + digits.sum)

        println("-" * 20)
        testSet()
    }


    def coll(): Unit = {
        val coll = Seq(1, 1, 2, 3, 5, 8, 13)

        val set = coll.toSet

        val buff = coll.to[ArrayBuffer]

        println("coll = " + coll)
        println("set = " + set)
        println("buff = " + buff)
    }


    /**
      * List，链表
      * @param lst
      */
    def sum(lst: List[Int]): Int = {
        if (lst == Nil) 0
        else lst.head + sum(lst.tail)
    }


    def sumElse(lst: List[Int]): Int = lst match {
        case Nil => 0
        case h :: t => h + sumElse(t)
    }


    /**
      *
      */
    def testSet(): Unit = {
        val set = Set(5, 2, 3, 1, 4)
        println("set = " + set)

        val newSet = set + 1
        println("set = " + set)
        println("newSet = " + newSet)

        println("set contains 0 = " + (set contains 0))
        println("set contains 0 = " + (set contains 1))
        println("Set(5, 2) subsetOf set = " + (Set(5, 2) subsetOf set))


    }



}
