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

        val coll = Seq(1, 1, 2, 3, 5, 8, 13)

        val set = coll.toSet

        val buff = coll.to[ArrayBuffer]

        println("coll = " + coll)
        println("set = " + set)
        println("buff = " + buff)
    }

}
