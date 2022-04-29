package arrays

import scala.collection.mutable.ArrayBuffer

object Grades extends App {

  val a = Array(77, 55, 33, 38)

  var array = ArrayBuffer[Int]()

  for (i <- a) {
    println(if (i < 38 || i % 5 < 3) i
    else i + (5 - i % 5))
  }

}
