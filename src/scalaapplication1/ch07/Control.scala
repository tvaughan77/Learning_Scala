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
  
  def fileLines(file: java.io.File) = 
    scala.io.Source.fromFile(file).getLines.toList
  
  /**
   * This will return 2 because it explicitly specifies an overriding return value
   */
  def f(): Int = try { return 1 } finally { return 2 }
  
  /**
   * If no exception is thrown the value computed in the finally clause (if there is one) is dropped
   */
  def g(): Int = try { 1 } finally { 2 }
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
  
  def forLoopOverTmpExample() {
    val filesHere = (new java.io.File("/tmp")).listFiles
    for(file <- filesHere)
      println(file)
  }
  
  def forLoopRangeExample() {
    for(i <- 1 to 4)
      println("Iteration " + i)
  }
  
  def forLoopRangeNoUpperBoundExample() {
    for(i <- 1 until 4)
      println("No upper bound Iteration " + i)
  }
  
  def forLoopWithFilter() {
    val filesHere = (new java.io.File("/tmp")).listFiles
    for(
      file <- filesHere
      if file.isFile;                   // note the semicolon to chain filter-ifs
      if file.getName.endsWith(".args")
    ) println(file)
  }
  
  def grep(pattern: String) = {
    val filesHere = (new java.io.File("src/scalaapplication1/ch07")).listFiles

    for(
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- (new Control).fileLines(file)
      if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)
  }

  /*
   * Notice how the original "grep" method invokes line.trim twice...avoid that
   */
  def grepWithMidStreamVariableBinding(pattern: String) = {
    val filesHere = (new java.io.File("src/scalaapplication1/ch07")).listFiles
    for(
      file <- filesHere
      if file.getName.endsWith(".scala");
      line <- (new Control).fileLines(file);
      trimmed = line.trim
      if trimmed.matches(pattern)
    ) println(file + ": " + trimmed)
  }
  
  def yieldingForLoop() : Array[Int] = {
    val filesHere = (new java.io.File("src/scalaapplication1/ch07")).listFiles
    
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- (new Control).fileLines(file);
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length
  }
  
  def matchExample(food : String) : String = {
    food match {
      case "salt" => "pepper"
      case "chips" => "salsa"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
  }
}

