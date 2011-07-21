package scalaapplication1

object Main {

  val greetStrings = Array("Hello", ", ", "World!")
  
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    greetStrings.foreach(print)
  
    // This is a scala.List and it is immutable
    val oneTwoThree = List(1, 2, 3)
  
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
  
    println("" + oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")
  
    // cons operator works on the right hand side because the operator ends in ":"
    val myList = List(1, 2)
    val consdList = 3 :: myList
    println("ConsdList is " + consdList)
  }
}
