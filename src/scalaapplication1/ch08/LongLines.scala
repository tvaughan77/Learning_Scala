package scalaapplication1.ch08

import scala.io.Source

object LongLines {

  /*
   * prints any line in {@code filename} longer than {@code width} characters
   */
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for(line <- source.getLines) 
      processLine(filename, width, line)
  }
  
  def processLine(filename: String, width: Int, line: String) {
    if(line.length > width) 
      println(filename + ": " + line.trim)
  }
}
