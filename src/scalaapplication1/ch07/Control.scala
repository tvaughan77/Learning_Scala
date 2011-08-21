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
  
  def gcdRecursive(x: Long, y: Long): Long = {
    if(y == 0) x else gcdRecursive(y, x % y)
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
    println("Using a big ugly loop, the greatest common denominator between 99 and 22 is " + control.gcdLoop(99, 22))
    println("Using sweet ass recursion, the greatest common denominator of the same nums " + control.gcdRecursive(99, 22))
  }
  
  def doWhileExample() {
    var line = ""
    do {
      print("prompt#> ")
      line = readLine()
      println("Read: " + line)
    } while (line != "")
  }
  
}

