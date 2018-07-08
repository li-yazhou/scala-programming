package org.alpha.scalabase.test

import org.junit.Test

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 19:01
  */
class JunitTestTest {

    @Test(timeout = 5000)
    def testJunitTest(): Unit = {
        println("this is junit test")
    }

}
