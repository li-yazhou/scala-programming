package org.alpha.scalabase.clazz.base

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/30 18:15
  */
object PersonFieldTest {

    def main(args: Array[String]): Unit = {
        val zz = new PersonField
        println("age = " + zz.age)

        // 调用 age_=(-1)方法
        zz.age = -1
        // 调用 age() 方法
        println("age = " + zz.age)

        // 调用 age_=(10)方法
        zz.age = 10
        // 调用 age() 方法
        println("age = " + zz.age)


        println("address = " + zz.getAddress)
        zz.setAddress("zhengzhou")
        println("address = " + zz.getAddress)

    }
}
