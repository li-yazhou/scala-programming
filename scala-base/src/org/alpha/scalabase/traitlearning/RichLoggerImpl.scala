package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/4 21:56
  */
trait RichLoggerImpl extends RichLogger{

    def log(msg: String): Unit = {
        println(msg)
    }
}
