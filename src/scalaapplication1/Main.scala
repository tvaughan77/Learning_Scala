/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
      print(greetStrings(i))
  }
  
  // doesn't work because there isn't a receiver of the method call:
  // println 10
  
  // but this does work:
  Console println 10
  
}
