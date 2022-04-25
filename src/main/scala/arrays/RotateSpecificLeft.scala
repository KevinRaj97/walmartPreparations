package arrays

object RotateSpecificLeft extends App {

  var a = Array(1, 2, 3, 4, 5)
  var result1 = rotateLeft(a, 3)

  def rotateLeft(a: Array[Int], d: Int): Array[Int] = {
    for (j <- 0 until d) {
      val first = a(0)
      for (i <- 0 until a.length - 1) {
        a(i) = a(i + 1)
      }
      a(a.length - 1) = first
    }
    a
  }

  println("RotateArray")
  for (j <- result1) {
    print(s"${j} ")
  }

  // left rotation n change n-1
  // right rotation n-1 change n

}

