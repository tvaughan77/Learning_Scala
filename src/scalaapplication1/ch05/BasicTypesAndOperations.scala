
package scalaapplication1.ch05

class BasicTypesAndOperations {

  def chapter5scratchpad() {
    // Byte, Short, Int, Long, Char are Integral types.  With Float and Double, that's Numeric types.
    println("""|Welcome to Ultamix 3000
               |Type "Help" for help.""".stripMargin)
    
    val string = "Hello, world"
    print("An example of using a method as an operator: ")
    println(string indexOf 'o')
    
    // possible unary operators: {+, -, !, ~}
    val zero = 2 + (2).unary_-;
    assert(zero == 0, "I was expecting 2 - 2 to be 0")
    
    // Scala provides a facility for comparing reference equality under the name "eq", however eq (and its opposite ne) only
    // apply to objects that directly map to Java objects
    val areEqual = (List(1, 2, 3) == List(1, 2, 3))
    println("Are two separate list constructors with the same values equal? " + areEqual)
    
    println("1 == 1.0 .... is equal? ... " + 1 == 1.0)
  }
  
  /**
   * These rich wrapper methods are available via implicit conversions.  For each basic type described in chapter 5
   * (Byte, Int, String, Float, Char, Double, etc), there is a "rich wrapper" that provides several additional methods.
   */
  def playWithRichWrappers() {
    println("0 max 5 = " + (0 max 5))
    println("0 min 5 = " + (0 min 5))
    println("-2.7 abs = " + (-2.7 abs))
    println("-2.7 round = " + (-2.7 round))
    println("1.5 isInfinity = " + (1.5 isInfinity))
    println("(1.0/0) isInfinity = " + ((1.0/0) isInfinity))
    println("4 to 6 is = " + (4 to 6))
    println("\"bob\" capitalize is = " + ("bob" capitalize))
    println("\"robert\" drop 2 is = " + ("robert" drop 2))
  }
}
