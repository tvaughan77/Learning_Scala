package scalaapplication1

import scala.io.Source

class CountChars {

  def imperativeCountLines(args: Array[String]) : Int = {
    var lines = 0
    if(args.length > 0) {
      for(line <- Source.fromFile(args(0)).getLines)
          lines += 1
    }
    return lines
  }
}
