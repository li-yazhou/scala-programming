package org.alpha.scalabase.clazz.obj

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/8/1
  */
object DoNothingAction extends UndoableAction ("Do nothing"){
  override def undo(): Unit = {
    println("undo do nothing ...")
  }

  override def redo(): Unit = {
    println("redo do nothing ...")
  }
}

/*
  扩展类或者特质的对象

  一个object可以扩展类以及一个或者多个特质，其结果是一个扩展了指定类以及特质的类的对象，同时拥有在对象定义中给出的所有特性。

  一个由适用的场景是，给出可被共享的默认对象，该对象可以被所有需要这个默认行为的地方共用。

 */

object MainForDoNothingAction{
  def main(args: Array[String]): Unit = {
    DoNothingAction.undo()
    DoNothingAction.redo()
  }
}