package arrays

object SortingArray extends App {

  val array = Array(88, -1, -2, 55, 9, 0)

  val size = array.size
  val length: Double = array.length
  println(length)

  for (i <- 0 until array.length - 1) {
    for (j <- 0 until array.length - 1) {
      if (array(j) > array(j + 1)) {
        var temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
  }
    for (o <- array) {
      println(o + " ")
    }

}
