package arrays

import scala.io.StdIn

object NumberLinesJump extends App {

  val x1 = StdIn.readInt()
  val v1 = StdIn.readInt()
  val x2 = StdIn.readInt()
  val v2 = StdIn.readInt()

  jump(x1, v1, x2, v2)

  def jump(x1: Int, v1: Int, x2: Int, v2: Int): Any = {

    if (v1 > v2) {
      val rem = (x1 - x2) % (v2 - v1) == 0
      if (rem == 0) {
        println("Yes")
      }
    }
    else println("No")
  }
}
