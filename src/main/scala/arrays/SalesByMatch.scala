package arrays

object SalesByMatch extends App {

  val array = Array(10, 20, 30, 40, 10, 20, 25, 30, 50, 50, 20)

  for (i <- 0 until array.length - 1) {
    for (j <- 0 until array.length - 1) {
      if (array(j) > array(j + 1)) {
        var temp = array(j)
        array(j) = array(j + 1)
        array(j + 1) = temp
      }
    }
  }

  println(array.mkString(","))

  var s = array.groupBy(x => x).
    map(pair => pair._2
      .count(x => x == x) / 2).sum

  println(s)
}
