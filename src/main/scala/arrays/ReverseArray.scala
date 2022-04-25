package arrays

object ReverseArray {

  def main(args: Array[String]): Unit = {
    var nums1 = Array(5, 4, 3, 2, 1)

    println("BEFORE")
    for (i <- nums1) {
      print(i + " ")
    }
    var result1 = test(nums1)
    println("Reversed array:")
    for (j <- result1) {
      print(s"${j}, ")
    }
  }

  def test(nums: Array[Int]): Array[Int] = {
    var temp1 = 0
    var temp2 = 0
    var index_position = 0
    var index_last_pos = nums.length - 1
    while (index_position < index_last_pos) {
      temp1 = nums(index_position)
      temp2 = nums(index_last_pos)
      nums(index_position) = temp2
      nums(index_last_pos) = temp1
      index_position += 1
      index_last_pos -= 1
    }
    nums
  }
}