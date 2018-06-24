package org.patch.scalabase.classlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:41
  */
class Counter {
    private var value = 0

    def increment(): Unit = {
        value += 1
    }

    def current(): Int = {
        value
    }
}
