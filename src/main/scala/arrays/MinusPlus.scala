package arrays

object MinusPlus extends App {

  var a = Array(-7, 5, 3, -8, 0, 8)

  var pos: Double = 0
  var neg: Double = 0
  var zero: Double = 0

  for (o <- a) {
    if (o > 0) {
      pos = pos + 1
    }
    else if (o < 0) {
      neg = neg + 1
    }
    else {
      zero = zero + 1
    }
  }

  println(pos)
  println(neg)
  println(zero)


  //  println("%.6f \n", pos)
  //  println("%.6f \n", neg)
  //  println("%.6f \n", zero)

  //  System.out.format("%.6f", pos.asInstanceOf[Double] / a.length)
  //  println()
  //  System.out.format("%.6f", neg.asInstanceOf[Double] / a.length)
  //  println()
  //  System.out.format("%.6f", zero.asInstanceOf[Double] / a.length)
  //  println()
  printf("%f", pos.asInstanceOf[Double] / a.length)
  println()
  printf("%f", neg.asInstanceOf[Double] / a.length)
  println()
  printf("%f", zero.asInstanceOf[Double] / a.length)



  //  println(test)
}
