package scalaapplication1

object Main {

  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "World"
  
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    for(i <- (0).to(2)) 
      print(greetStrings.apply(i))
    
    val three = (1).+(2)
    println(three)
  }
}
