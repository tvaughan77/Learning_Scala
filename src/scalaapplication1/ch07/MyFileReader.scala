package scalaapplication1.ch07

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

object MyFileReader {

  def readFile(filename : String) {
    try {
      val f = new FileReader(filename)
    } catch {
      case ex: FileNotFoundException => println("File not found")
      case ex: IOException => println("IO Exception!")
    } finally {
      println("Inside a finally")
    }
  }
}
