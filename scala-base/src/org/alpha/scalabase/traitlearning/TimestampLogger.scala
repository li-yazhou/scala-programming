package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/3 22:36
  */
trait TimestampLogger extends ConsoleLogger{

    override def log(msg: String): Unit = {
        super.log(s"${java.time.Instant.now()} $msg")
    }
}
