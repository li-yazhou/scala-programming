package org.patch.scalabase.lang

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:04
  */
object MapTest {

    def main(args: Array[String]): Unit = {
        testMutableMap()
    }


    def testMutableMap(): Unit = {
        val person = scala.collection.mutable.Map(
            "name" -> "zz",
            "gender" -> "male"
        )

        // 访问Map的元素
        val name = if (person.contains("name")) person("name") else "no name"
        println(name)

        val gender = person.getOrElse("gender", "unknown")
        println("gender = " + gender.toUpperCase)

        // 更新value
        person("name") = "zhouzhou"

        // 删除 key-value
        person -= "name"

        // 添加key-value
        person += ("address" -> "beijing", "age" -> "22")

        // 迭代Map
        for((k, v) <- person) {
            println(k + " -> " + v)
        }

        // keySet、values
        for(k <- person.keySet) {
            print(k + ", ")
        }
        println()
        for(v <- person.values) {
            print(v + ", ")
        }
        println()


    }

    def testImmutableMap(): Unit = {
        val scores = Map(
            "lyz" -> 88,
            "sjl" -> 90,
            "ljl" -> 98
        )
    }

}
