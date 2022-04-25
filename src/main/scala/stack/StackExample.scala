package stack

import scala.collection.mutable
import scala.io.StdIn

object StackExample extends App {

  println("Range")
  val range = StdIn.readInt()

  var mainStack = mutable.Stack[Int]()
  var maxStack = mutable.Stack[Int]()

  maxStack.push(Integer.MIN_VALUE)

  for (i <- 1 to range) {
    println("choose option")
    val iterator = StdIn.readInt()

    iterator match {
      case 1 =>
        println("print the value")
        var push = StdIn.readInt()
        mainStack.push(push)
        var max = mainStack.top
        if (push > max) {
          maxStack.push(max)
        }
        else {
          maxStack.push(max)
        }

      case 2 =>
        mainStack.pop()
        maxStack.pop()

      case 3 =>
        println("MAximum value is  " + maxStack.top)
    }
  }

}
