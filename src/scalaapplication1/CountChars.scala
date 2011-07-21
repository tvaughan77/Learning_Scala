package scalaapplication1

import scala.io.Source

class CountChars {

  def imperativeCountLines(args: Array[String]) : Int = {
    var lines = 0
    if(args.length > 0) {
      val listOfLines = Source.fromFile(args(0)).getLines.toList
      
      // Here's an imperative way of finding the max width of any line
      var maxWidth = 0
      for(line <- listOfLines) 
        maxWidth = maxWidth.max(widthOfLength(line))
      println("Finding maxWidth in an iterative way yields = " + maxWidth)
      
      // Here's a mappy way of doing the same thing
      val maxLine = listOfLines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      maxWidth = widthOfLength(maxLine)
      println("Finding maxWidth in a mappy way yields = " + maxWidth)
        
      
      for(line <- listOfLines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        print(padding + line.length + " | " + line + "\n")
        lines += 1
      }
    }
    lines
  }
  
  def widthOfLength(line : String) : Int = {
    line.length.toString.length
  }
}
