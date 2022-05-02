package arrays

object FindDigits extends App {

  val n = 450
  var r = n
  var count = 0
  while (r > 0) {
    if (r % 10 != 0 && n % (r % 10) == 0)
      count += 1
    r = r / 10
  }
  println(count)
}
