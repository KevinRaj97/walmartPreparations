package arrays

object BirthdayCandles extends App {

  var candle = Array(3, 2, 1, 3)
  var max = Int.MinValue
  var count = 0

  for (d <- 0 until candle.length - 1) {

    if (candle(d) > max) {
      max = candle(d)
    }
  }
  println(max)

  for (i <- 0 to candle.length - 1) {

    if (candle(i) == max) {

      count += 1
    }
  }
  println(count)

}
