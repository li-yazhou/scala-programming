package org.alpha.scalabase.lang

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/7/28
  */
object LazyValue {

  def main(args: Array[String]): Unit = {

    val path = "/Users/liyazhou1/self-repo/scala-programming/scala-base/resources/numbers.txt"

    lazy val words = scala.io.Source.fromFile(path).mkString
    // println(s"words = $words")

    val noSuchFilePath = "exception.file"
    val numbers = scala.io.Source.fromFile(noSuchFilePath).mkString

  }


}
