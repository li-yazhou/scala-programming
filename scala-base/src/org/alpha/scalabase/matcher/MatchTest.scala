package org.alpha.scalabase.matcher

import org.scalatest.FunSuite

/**
  * <p>Description: </p>
  *
  * Author: lyz
  * Date: 2018/7/8 16:56
  */
class MatchTest extends FunSuite {

    test("better switch") {
        var sign = 1

        val ch: Char = '+'

        ch match {
            case '+' => sign = 1
            case '-' => sign = -1
            case _ => sign = 0
        }

        println("sign = " + sign)

        /* match 是表达式，而不是语句 */
        val flag = ch match {
            case '+' => 1
            case '-' => -1
            case _ => 0
        }
        println("flag = " + flag)
    }


    test("match separator") {
        // 'F', throw scala.MatchError
        val ranks = Array('A', 'B', 'C', 'D', 'E', 'F')
        for (rank <- ranks) {
            val score = rank match {
                case 'A' => "90-100"
                case 'B' => "80-89"
                case 'C' => "70-79"
                case 'D' | 'E' => "0-69"
            }
            println(rank + " => " + score)
        }
    }

}
