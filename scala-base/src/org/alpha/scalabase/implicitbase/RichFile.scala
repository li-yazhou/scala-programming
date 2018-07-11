package org.alpha.scalabase.implicitbase

import java.io.File

import scala.io.Source

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/11 21:48
  */
class RichFile(val from: File) {

    def read = Source.fromFile(from.getPath).mkString
}
