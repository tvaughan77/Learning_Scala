package scalaapplication1.ch04

class ChecksumAccumulator {

  // with no modifier, Scala defaults to public
  private var sum = 0
  
  def add(b : Byte) { sum += b }
  
  def checksum() : Int = ~(sum & 0xFF) + 1
  
  def f() : Unit = "this string gets lost because Scala turns the string to declared Unit return type"
  
  def g() {"this string gets lost too because the method-style automatically assumes Unit"}
}
