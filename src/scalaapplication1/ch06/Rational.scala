package scalaapplication1.ch06

/**
 * A Rational number (numerator, denomintor).  Constructor is automatically generated by compiler
 */
class Rational(n: Int, d: Int) {
  
  require (d != 0)
  
  // The initializers of these three fields are folded in to the primary constructor in the order they appear
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  
  def this(i: Int) = this(i, 1)  // auxillary constructor
  
  def +(that: Rational) : Rational = {
    new Rational(
      (this.numer * that.denom + that.numer * this.denom),
      (this.denom * that.denom)
    )
  }
  
  def +(i: Int) : Rational = { 
    new Rational((i * denom) + numer, denom)
  }
  
  def -(that: Rational) : Rational = {
    new Rational(
      (this.numer * that.denom - that.numer * this.denom),
      (this.denom * that.denom)
    )
  }
  
  def -(i: Int) : Rational = {
    new Rational(numer - (i*denom), denom)
  }
  
  def *(that: Rational) : Rational = {
    new Rational(
      this.numer * that.numer,
      this.denom * that.denom
    )
  }
  
  def *(i: Int) : Rational = {
    new Rational(i * numer, denom)
  }
  
  def /(that: Rational) : Rational = {
    this.*(that.invert)
  }
  
  def /(i: Int) : Rational = {
    this./(new Rational(i))
  }
  
  def invert() : Rational = {
    new Rational(this.denom, this.numer)
  }
  
  override def toString = { 
    if(denom == 1) (numer  + "") else (numer + "/" + denom)
  }

  private def gcd(a: Int, b: Int) : Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}

object Rational {
  def playWithRationalNumbers = {
        val r = new Rational(3, 5)
    println("Just created r = " + r)

    val s = new Rational(4)
    println("Just created s = " + s)

    val t = new Rational(1, 2)
    println("Just created t = " + t)
    
    val rAndS = r + s
    println("r + s = " + rAndS)
    
    val gcdTest = new Rational(66, 42)
    println("gcdTest = " + gcdTest)
    
    val rTimesS = r * s
    println("r times s = " + rTimesS)
    
    println("r + (r * s) = " + (r + r * s))
    
    println(r + " + 1 = " + (r + 1))
    println(r + " - 1 = " + (r - 1))
    println(r + " * 2 = " + (r * 2))
    println(r + " / 2 = " + (r / 2))
    println(r + " + " + t + " = " + (r + t))
    println(r + " - " + t + " = " + (r - t))
    println(r + " * " + t + " = " + (r * t))
    println(r + " / " + t + " = " + (r / t))
  }
}