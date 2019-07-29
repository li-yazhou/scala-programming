package org.alpha.scalabase.clazz

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

  def current(): Int = {
      value
  }
}
