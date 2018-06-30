package org.alpha.scalabase.classlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/30 18:15
  */
object PersonTest {

    def main(args: Array[String]): Unit = {
        var zz = new Person
        println("age = " + zz.age)

        zz.age = -1
        println("age = " + zz.age)

        zz.age = 10
        println("age = " + zz.age)
    }
}
