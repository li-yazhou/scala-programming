package org.alpha.scalabase.classlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/30 17:59
  */
class Person {

    /**
      * Scala生成面向JVM的类，
      * 其中有一个私有字段age，以及相应的getter和setter（age, age_=）方法，这两个方法是公有的，
      * 如果Scala代码中将age指定为私有的，则getter和setter也是私有的
      */
    // var age = 0

    private var privateAge = 0

    def age = privateAge

    def age_=(newAge: Int): Unit = {
        if (newAge > privateAge) {
            privateAge = newAge
        } else {
            println("new age must be bigger than old age.")
        }
    }
}
