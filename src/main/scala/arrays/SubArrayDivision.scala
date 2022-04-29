package arrays


object SubArrayDivision extends App {

  val array = Array(2,2,1,3,2)
  val length: Int = array.length
  println("Array length " + length)
  val result: Int = 4
  var sum = 0

  if (length == 1) {
    for (j <- array) {
      if (j.equals(result)) {
        sum += 1
      }
    }
  }
  if (length >= 1)
    for (i <- 0 until (array.length - 1)) {
      if (array(i) + array(i + 1) == result) {
        sum += 1
      }
    }
  println(sum)

}
