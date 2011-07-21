package scalaapplication1.ch04
import scala.collection.mutable.Map

class ChecksumAccumulator {

  // with no modifier, Scala defaults to public
  private var sum = 0
  
  def add(b : Byte) { sum += b }
  
  def checksum() : Int = ~(sum & 0xFF) + 1
  
  def f() : Unit = "this string gets lost because Scala turns the string to declared Unit return type"
  
  def g() {"this string gets lost too because the method-style automatically assumes Unit"}
  
  def h() = {"the equals sign defines a method whose return type can be inferred. This string is preserved"}
  
}

/**
 *  This is a singleton companion object
 *  
 *  A class and companion object can access each others private members.
 *  Java programmers can think about companion objects as the place to store all the static methods you would write in Java, but
 * it's also first-class object.  Its type is defined by the singleton object's companion class...though singleton objects
 * exted a superclass and can mix in traits.
 * 
 *  Singleton objects cannot take parameters.  They're implemented as an instance of a synthetic class referenced from a static
 * variable, so they have the same initialization semantics as a Java statics.
 * 
 */
object ChecksumAccumulator {
  private val cache = Map[String, Int]()

  /**
   * This is callable like ChecksumAccumulator.calculate("Ever value is an object")
   */  
  def calculate(string : String) : Int =
    if (cache.contains(string))
      cache(string)
    else {
      val accumulator = new ChecksumAccumulator   // new class instance, not new singleton companion object, obviously
      for (char <- string)
        accumulator.add(char.toByte)
      
      val checksum = accumulator.checksum()
      
      cache += (string -> checksum)
      checksum
    }
      
}