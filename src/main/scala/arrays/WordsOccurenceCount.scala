package arrays

import scala.io.StdIn

object WordsOccurenceCount extends App {


  val text = "kevinmanumessiAjith"

  val char = text.toCharArray
  var count = 0
  var a = StdIn.readChar()

  for (i <- char) {
    if (i == a) {
      count = count + 1
    }
  }
  println(count)

}
