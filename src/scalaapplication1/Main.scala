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
    for(i <- 0 to 2) 
      print(greetStrings(i))
  }

}
