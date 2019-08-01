package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
object AppObject extends App {
  println("继承App，不用写Main方法，构造方法体的语句即是程序的入口")

  // 若需要命令行参数，则可以通过args属性获取
  if(args.length > 0) {
    println(s"Hello, ${args(0)}")
  } else {
    println(s"Hello, world")
  }
}

object NormalObject {
  def main(args: Array[String]): Unit = {
    println("Entrance of Normal Object Program")
  }
}
