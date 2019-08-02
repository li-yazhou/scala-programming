package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
object TrafficLight extends Enumeration {

  // 枚举的类型是 TrafficLight.Value，而不是TrafficLight
  val Red, Yellow, Green = Value

  // Value 方法有两个参数id、name
  val RED = Value(10, "red light")
  val YELLOW = Value(20, "yellow light")
  val GREEN = Value("green light") // id = 21

}


object MainForEnumObject {

  def main(args: Array[String]): Unit = {

    val color = TrafficLight.GREEN
    doWhat(color)

    // 获取枚举的ID，使用id方法
    val id = TrafficLight.GREEN.id
    println("id = " + id)

    // 获取枚举的名称，使用toString方法
    val name = TrafficLight.GREEN.toString
    println(s"name = $name")

    // 获取所有的枚举值，使用values方法
    for (color <- TrafficLight.values) {
      print(color + "\t")
    }
    println()

    // 根据id获取枚举，使用 apply 方法
    val green = TrafficLight(21)
    println(green)

    // 根据name获取枚举，使用withName方法
    val yellow = TrafficLight.withName("yellow light")
    println(yellow)


  }

  // 使用枚举
  def doWhat(color: TrafficLight.Value): Unit = {
    if (color == TrafficLight.RED) {
      println("STOP")
    } else if (color == TrafficLight.YELLOW) {
      println("WAIT")
    } else if (color == TrafficLight.GREEN) {
      println("GO")
    }
  }

}