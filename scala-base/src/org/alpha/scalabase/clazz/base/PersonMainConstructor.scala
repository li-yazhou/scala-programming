package org.alpha.scalabase.clazz.base

import scala.beans.BeanProperty

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/1 9:57
  */
// 主构造器，带默认参数
class PersonMainConstructor(@BeanProperty var name: String = "", val age: Int = 0) {
    // 上一行代码相当于
    /*
        public PersonMainConstructor {
            private String name = "";
            private int age = 0;

            public PersonMainConstructor(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int age() {
                return age;
            }


        }

     */

}
