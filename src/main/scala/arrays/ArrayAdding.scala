package arrays

object ArrayAdding extends App {

  val a = Array(1, 2, 3, 5, 6, 7)
  var count = 0

  def add(ar: Array[Int]): Unit = {

    for (i <- ar) {
      count += i
    }
    println(count)
  }

  add(a)
}
