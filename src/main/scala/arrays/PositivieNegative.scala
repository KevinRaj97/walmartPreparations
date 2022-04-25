package arrays

import scala.collection.mutable.ArrayBuffer

object PositivieNegative extends App {
  val array = Array(-8, -22, 5, 7, -9, 2, 99, -87)

  var arrayBufferpositive = ArrayBuffer[Int]()
  var arrayBuffernegative = ArrayBuffer[Int]()

  for (i <- array) {
    if (i > 0) {
      arrayBufferpositive += i
    }
    else if (i < 0) {
      arrayBuffernegative += i
    }
  }
  println("positive values" + arrayBufferpositive)
  println("negative values" + arrayBuffernegative)


}
