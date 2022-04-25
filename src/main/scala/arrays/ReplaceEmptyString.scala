package arrays

import scala.io.StdIn

object ReplaceEmptyString extends App {

  val s = StdIn.readLine()
  val n = s.length
  val c = s.toCharArray
  val s1 = "Ajith"
  for (i <- 0 until n) {
    if (c(i) != ' ')
      println(c(i))
    else println(s1)
  }

}