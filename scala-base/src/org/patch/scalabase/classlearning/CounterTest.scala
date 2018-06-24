package org.patch.scalabase.classlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:43
  */
object CounterTest {

    def main(args: Array[String]): Unit = {
        val counter = new Counter
        counter.increment()
        println("current = " + counter.current)
    }

}
