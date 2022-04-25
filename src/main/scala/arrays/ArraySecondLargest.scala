package arrays

object ArraySecondLargest extends App {

  val array = Array(1, 2, 3, 5, 8, 9)

  for (i <- 0 until (array.length - 1)) {
    for (j <- 0 until (array.length - 1)) {

      if (array(j) < array(j + 1)) {
        var temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
  }

  println(s"${array.mkString(",")} ")
  println(array(2))
}
