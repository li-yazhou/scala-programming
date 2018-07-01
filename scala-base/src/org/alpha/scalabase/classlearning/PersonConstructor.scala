package org.alpha.scalabase.classlearning

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/1 9:52
  */
class PersonConstructor {

    private var name = ""
    private var age = 0

    // 辅助构造器
    def this(name: String) {
        // 主构造器，自动生成的无参的主构造器
        this()
        this.name = name
    }

    def this(name: String, age: Int) {
        this(name)
        this.age = age
    }



}
