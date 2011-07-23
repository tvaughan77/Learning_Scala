package scalaapplication1

//import scalaapplication1.ch04.ChecksumAccumulator
//import scalaapplication1.ch05.BasicTypesAndOperations
import scalaapplication1.ch06.Rational

object Main {

  
  
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    /* Chapter 6 */
    val r = new Rational(3, 5)
    println("Just created r = " + r)

    val s = new Rational(2, 3)
    println("Just created s = " + s)
    
    val rAndS = r.add(s)
    println("r + s = " + rAndS)
    
    /* Chapter 5 
    val ch5 = new BasicTypesAndOperations
    ch5.chapter5scratchpad
    ch5.playWithRichWrappers
    */
    
    /* Chapter 4 
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    println("result of calling acc.f is = " + acc.f)
    println("result of calling acc.g is = " + acc.g)
    println("result of calling acc.h is = " + acc.h)
    
    val myString = acc.h
    println("Calling calculate on acc.h is " + ChecksumAccumulator.calculate(myString))
    */
   
    /* Chapter 2-3
    val foo = new Foo
    foo.playWithLists
    foo.playWithTuples
    foo.playWithImmutableSets
    foo.playWithMutableSets
    foo.playWithMutableMaps
    foo.playWithImmutableMaps
   
    
    val args = Array("test/foo.txt")
    val cc = new CountChars
    val lines = cc.imperativeCountLines(args)
    println("Number of lines in " + args.mkString(" ") + " is " + lines)
    */
   
    /* Chapter 1
      val greetStrings = Array("Hello", ", ", "World!")
      greetStrings.foreach(print)
      */
  }
  

}
