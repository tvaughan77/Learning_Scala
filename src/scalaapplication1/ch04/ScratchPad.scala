package scalaapplication1.ch04

object ScratchPad {

  def scratch() {
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator

    println("result of calling acc.f is = " + acc.f)
    println("result of calling acc.g is = " + acc.g)
    println("result of calling acc.h is = " + acc.h)
    
    val myString = acc.h
    println("Calling calculate on acc.h is " + ChecksumAccumulator.calculate(myString))
  }
}
