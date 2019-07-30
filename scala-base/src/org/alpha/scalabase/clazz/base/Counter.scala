package org.alpha.scalabase.clazz.base

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/6/24 20:41
  */
class Counter {


  // 初始化字段
  private var value = 0

  // 方法默认访问权限是 public
  def increment(): Unit = {
      value += 1
  }

  // 一般的取值器，可以使用带括号的方法或者省略括号的方法名访问
  def current(): Int = {
      value
  }

  // 定义取值器
  // 强制取值器不能使用括号进行调用，方法名之后不使用括号，并省略冒号和返回值类型
  def miniCurrentWithoutBracket = value

  def simpleCurrentWithoutBracket = {
    println("simpleCurrentWithoutBracket")
    value
  }
}
