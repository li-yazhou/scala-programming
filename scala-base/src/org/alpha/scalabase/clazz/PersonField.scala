package org.alpha.scalabase.clazz

import scala.beans.BeanProperty

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/30 17:59
  */
class PersonField {

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

    /**
      * 只带getter方法的属性
      */
    val IdCart = "412702xxxxxxxxx"


    /**
      * 没有getter和setter方法的属性
      */
    private[this] var innerAttr = "this is a inner field, without getter and setter"


    /**
      * 生成Java规范版本的getter和setter方法
      */
    @BeanProperty
    var address: String = "beijing"
    // var address: String = _

}
