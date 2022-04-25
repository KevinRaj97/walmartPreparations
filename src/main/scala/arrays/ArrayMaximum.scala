package arrays

object ArrayMaximum extends App {

  val a = Array(5, 10, 1, 3, 5)
  var max = a(0)
  for (i <- 1 to a.length - 1) {
    if (a(i) > max) {
      max = a(i)
    }
  }
  println(max)
}
