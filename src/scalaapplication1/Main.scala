package scalaapplication1

//import scalaapplication1.ch02_03._
//import scalaapplication1.ch04._
//import scalaapplication1.ch05._
//import scalaapplication1.ch06._
//import scalaapplication1.ch07._
//import scalaapplication1.ch08._

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
     scalaapplication1.ch07.Scratchpad.scratch()
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
     scalaapplication1.ch04.ScratchPad.scratch()
     */
    
    /* Chapter 2-3 
     scalaapplication1.ch02_03.ScratchPad.scratch()
    */
   
    /* Chapter 1
      val greetStrings = Array("Hello", ", ", "World!")
      greetStrings.foreach(print)
      */
  }
}
