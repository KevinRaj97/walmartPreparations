package arrays

object BeautifullDays extends App {


  //Initializing values
  var i = 20
  var j = 23
  var k = 6

  var beautifulDays = 0
  var day = i

  while (day <= j) {
    var x = day
    var reverse = 0
    while (x != 0) {
      reverse = reverse * 10 + x % 10
      x /= 10
    }
    if (Math.abs(day - reverse) % k == 0)
      beautifulDays += 1
      day += 1
  }
  println(beautifulDays)
}
