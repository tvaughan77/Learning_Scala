package scalaapplication1.ch07

class Control {
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
}

object Control {

  def ifExample {
    /*
     * imperitive style:
     * var filename = "default.txt"
     * if(!args.isEmpty)
     *    filename = args(0)
     */
    
    // scala style:
    val args = List(1, 2, 3)
    val filename = if(!args.isEmpty) args(0) else "default.txt"
    
    println("Filename is " + filename)
    
  }
  
  def whileExample {
    val control = new Control
    val gcd = control.gcdLoop(99, 22)
    println("Greatest common denominator between 99 and 22 is " + gcd)
  
  }
  
  
}

