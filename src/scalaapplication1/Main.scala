package scalaapplication1

//import scalaapplication1.ch04.ChecksumAccumulator
//import scalaapplication1.ch05.BasicTypesAndOperations
//import scalaapplication1.ch06.Rational
//import scalaapplication1.ch07.Control
//import scalaapplication1.ch07.MultiplicationTable
//import scalaapplication1.ch07.MyFileReader
//import scalaapplication1.ch07.Matches

import scalaapplication1.ch08.LongLines
import scalaapplication1.ch08.FirstClassFunctions

import scalaapplication1.ch20._

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    
    /*
     * Chapter 20: Actors
     */
    SillyActor.start()
    SeriousActor.start()
    println("I just started silly actor and serious actor")
    
    val echoActor = new EchoActor()
    echoActor.start()
    
    echoActor ! "Hello there"
    
    echoActor ! "This is main, sending you another message"
    
    val pickyEchoActor = new IntOnlyEchoActor()
    pickyEchoActor.start()
    
    pickyEchoActor ! "You're going to ignore this, aren't you?"
    
    pickyEchoActor ! 12   // but you won't ignore this
    
    
    /*
     * Chapter 8
    
    LongLines.processFile("/tmp/foo.txt", 40)
    var someFunc = FirstClassFunctions.getIncreaseFunctionLiteral
    println("Calling someFunc(10) is " + someFunc(10))
    */
    
    /* Chapter 7 
    Control.ifExample
    Control.whileExample
    Control.doWhileExample
    Control.forLoopOverTmpExample
    Control.forLoopRangeExample
    Control.forLoopRangeNoUpperBoundExample
    Control.forLoopWithFilter
    Control.grep(".*gcd.*")
    Control.grepWithMidStreamVariableBinding(".*gcd.*")
    val counts = Control.yieldingForLoop
    println("Counts from my yieldingForLoop is " + counts.mkString(" "))
    val fr = MyFileReader.readFile("foobar.txt")
   println("A good food pairing with salt is " + Control.matchExample("salt"));
   println("My multiplication table is \n" + MultiplicationTable.multiTable)
   
    Matches.foodTaste("bacon")
    Matches.foodTaste("pork")
    */    

    
    /* Chapter 6 
    Rational.playWithRationalNumbers
    */
    
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
