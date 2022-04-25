package arrays

import scala.io.StdIn

object WordsCountEmptyString extends App {

  val string = StdIn.readLine()
  val k = string.length
  val array = string.toCharArray
  var empty = 0
  var count = 0
  for (i <- 0 until k) {

    if (array(i) != ' ')
      count += 1
  }
  println(count)
}
