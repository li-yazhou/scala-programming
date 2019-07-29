package org.alpha.scalabase.collection

/**
  * @desc TODO
  * @author liyazhou1
  * @date 2019/7/29
  */
object Seq {

  def getRange(): Unit = {
    val seqRange = 0 to 10
    val seqRange2 = 0 until 11

    val oddRange = 1 to 10 by 2
    val evenRange = 0 to (10, 2)

    val reverseRange = 10 to 0 by -1
    val reverseRange2 = (0 to 10).reverse
  }

}
