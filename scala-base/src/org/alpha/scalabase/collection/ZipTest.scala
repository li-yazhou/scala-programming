package org.alpha.scalabase.collection

import org.scalatest.FunSuite

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 15:51
  */
class ZipTest extends FunSuite{


    test("zip base") {
        val prices = List(2.0, 3.0, 5.0)
        val quantities = List(2, 3, 5)

        val amounts = (prices zip quantities).map( p => p._1 * p._2)
        println("amounts = " + amounts)
        println("sum = " + amounts.sum)
    }

}
