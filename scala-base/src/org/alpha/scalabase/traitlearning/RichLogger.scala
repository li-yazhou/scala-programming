package org.alpha.scalabase.traitlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/3 22:47
  */
trait RichLogger {

    def log(msg: String)

    def debug(msg: String) { log(s"DEBUG: $msg") }

    def info(msg: String) { log(s"INFO: $msg")}

    def warn(msg: String) { log(s"WARN: $msg")}

    def severe(msg: String) { log(s"SEVERE: $msg")}

}
