package org.alpha.scalabase.collection

import org.scalatest.FunSuite

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 16:15
  */
class IteratorTest extends FunSuite {

    test("BufferedIterator") {
        val strList = List("aaa", "bbb", "ccc")

        /*
            val iter = strList.iterator
            for (element <- iter) {
                println(element)
            }
        */
        val iter = strList.iterator.buffered
        while (iter.hasNext && iter.head.startsWith("aa")) {
            println(iter.next())
        }
        /*
            result is:
                aaa
         */
    }

}
