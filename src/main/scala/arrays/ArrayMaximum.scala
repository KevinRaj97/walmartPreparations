package arrays

object ArrayMaximum extends App {

  val a = Array(256741038, 623958417, 467905213, 714532089, 938071625)
//  2063136757 2744467344

  var min:Long = a(0) // taking index(0) as minimum
  var max:Long = min  //swapping the values
  var sum:Long = min

  for (i <- 1 until a.length) {
    sum += a(i)
    if (a(i) < min) {
      min = a(i)
    }
    else if (a(i) > max) {
      max = a(i)
    }
  }
  println(min)
  println(max)
  println(sum)

  var a1: Long =sum-max
  var b: Long =sum-min

  println(a1+" "+b)
}
