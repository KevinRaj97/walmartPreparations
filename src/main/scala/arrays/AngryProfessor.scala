package arrays

object AngryProfessor extends App {

  val ar = Array(0, -3, 4, 2)
  //  var limit = 3
  //  var count = 0
  //  for (i <- ar) {
  //    if (i <= 0) {
  //      count += 1
  //    }
  //  }
  //
  //  if (count == 3) {
  //    println("Yes")
  //  }
  //  else {
  //    println("No")
  //  }

  def angryProfessor(k: Int, a: Array[Int]): String = {

    var count = 0

    for (i <- a) {
      if (i <= 0) {
        count += 1
      }
    }
    if (count >= k) {
      "Yes"
    }
    else {
      "No"
    }
  }

  println(angryProfessor(3, ar))
}
