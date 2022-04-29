package arrays

object EqualiseTheArray extends App {

  val array = Array(3, 3, 2, 1, 3)

  var maxcount = 0

  for (i <- 0 until array.length) {
    var count = 0
    for (j <- 0 until array.length) {
      if (array(i) == array(j)) {
        count += 1
      }
    }
    if (maxcount < count) {
      maxcount = count
    }
  }
  println(array.size - maxcount)
}

