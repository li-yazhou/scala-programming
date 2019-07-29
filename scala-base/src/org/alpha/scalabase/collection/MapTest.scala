package org.alpha.scalabase.collection

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:04
  */
object MapTest {

  def main(args: Array[String]): Unit = {

      map()

      updateMutableMap()

      traverseMap()

      linkedHashMap()
    }


  def map(): Unit = {

    // 构造Map，不可变的Map，value不可变
    val scores = Map("Math" -> 130, "Chinese" -> 99, "English" -> 126)
    println(s"scores = $scores")
    // Error:(20, 5) value update is not a member of scala.collection.immutable.Map[String,Int]
    //    scores("Math") = 120
    // scores("Math") = 120

    // 构造Map
    val scoresWithBracket = Map(("aa", 11), ("bb", 22), ("cc", 33))
    println(scoresWithBracket.toString())

    // 构造可变Map
    val mutableScores = scala.collection.mutable.Map("math" -> 120, "chinese" -> 110)
    mutableScores("math") = 140
    println(mutableScores.toString())

    // 创建空Map
    val emptyMap = scala.collection.mutable.Map[String, Int]()

    // 获取Map键值对中的值
    // 根据key获取value，如果key不存在将抛出异常
    val chineseScore = scores("Chinese")
    println(s"chineseScore = $chineseScore")

    // 安全地获取value
    val englishScore = if (scores.contains("English")) scores("English") else -1
    println(s"englishScore = $englishScore")
    val mathScore = scores.getOrElse("Math", -1)
    println(s"mathScore = $mathScore")

    // 当key-value不存在时，为其设置默认值
    val scoresWithDefaultValue = scores.withDefaultValue(-1)
    val sportScore = scoresWithDefaultValue("Sport")
    println(s"sportScore = $sportScore")

  }


  /**
    * 更新可变Map中的元素
    */
  def updateMutableMap(): Unit = {
    println("-" * 20)
    println("updateMutableMap")

    val scores = scala.collection.mutable.Map("Swimming" -> 100, "Running" -> "80", "Badminton" -> 60)
    println(s"scores = $scores")

    // 更新单个元素
    if (scores.contains("Swimming")) scores("Swimming") = 120
    println(s"scores = $scores")

    // 添加键值对，与更新键值对语法相同，如果key存在则更新value，如果key不存在则添加key-value
    scores("Dance") = 65
    println(s"scores = $scores")

    // 添加多个键值对
    scores += ("Basketball" -> 70, "Football" -> 80)
    println(s"scores = $scores")

    // 删除键值对
    scores -= "Basketball"
    println(s"remove Basketball, scores = $scores")
    // 删除键值对，如果key存在则删除，否则不删除也不抛出异常
    scores -= "FOOTBALL"
    println(s"remove FOOTBALL, scores = $scores")

  }


  /**
    * 遍历Map
    */
  def traverseMap(): Unit = {
    println("-" * 20)
    println("traverseMap")

    val scores = scala.collection.mutable.Map("Swimming" -> 100, "Running" -> "80", "Badminton" -> 60)

    // 遍历key-value
    for((k, v) <- scores) {
      println(s"k = $k, v = $v")
    }

    // 遍历key
    for (key <- scores.keys) {
      print(key + " ")
    }
    println()
    for (key <- scores.keySet) {
      print(key + " ")
    }
    println()

    // 遍历value
    for (value <- scores.values) {
      print(value + " ")
    }
    println()

  }


  /**
    * LinkedHashMap
    */
  def linkedHashMap(): Unit = {
    println("-"*20)
    println("linkedHashMap")
    val scores = scala.collection.mutable.LinkedHashMap("January" -> 1, "February" -> 2,
      "March" -> 3, "April" -> 4, "May" -> 5, "June" -> 6)

    for((k, v) <- scores) {
      println(s"$k-$v")
    }
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
