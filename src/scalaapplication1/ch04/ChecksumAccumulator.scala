package scalaapplication1.ch04

class ChecksumAccumulator {

  // with no modifier, Scala defaults to public
  private var sum = 0
  
  def add(b : Byte) { sum += b }
  
  def checksum() : Int = ~(sum & 0xFF) + 1
}
