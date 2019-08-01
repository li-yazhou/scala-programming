package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
