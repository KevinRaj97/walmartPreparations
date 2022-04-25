package arrays

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

object ArrayUserInput extends App {
  var size = StdIn.readInt()
  var are = new ArrayBuffer[Int](size)

  for (i <- 0 to size - 1) {
    var o = StdIn.readInt()
    are += o
  }
  println(are)

  println("positivenegative")
  var arrayBufferpositive = ArrayBuffer[Int]()
  var arrayBuffernegative = ArrayBuffer[Int]()

  for (p <- are) {
    if (p > 0) {
      arrayBufferpositive += p
    }
    else if (p < 0) {
      arrayBuffernegative += p
    }
  }
  println("positive values" + arrayBufferpositive)
  println("negative values" + arrayBuffernegative)


  println("Sorting")

  for (l <- 0 until are.length - 1) {
    for (m <- 0 until are.length - 1) {
      if (are(m) < are(m + 1)) {
        var temp = are(m)
        are(m) = are(m + 1)
        are(m + 1) = temp
      }
    }
  }

  println("sorting " + are.mkString(","))
}
