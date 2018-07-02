package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/2 22:29
  */
trait ConsoleLogger {

    def log(msg: String): Unit = {
        print(msg)
    }

}
