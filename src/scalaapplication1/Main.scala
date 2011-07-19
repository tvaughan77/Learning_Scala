package scalaapplication1

object Main {

  val greetStrings = Array("Hello", ", ", "World!")
  
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    greetStrings.foreach(print)
  }
}
