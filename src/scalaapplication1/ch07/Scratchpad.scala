package scalaapplication1.ch07

object Scratchpad {

  def scratch() = {
    Control.ifExample
    Control.whileExample
    Control.doWhileExample
    Control.forLoopOverTmpExample
    Control.forLoopRangeExample
    Control.forLoopRangeNoUpperBoundExample
    Control.forLoopWithFilter
    Control.grep(".*gcd.*")
    Control.grepWithMidStreamVariableBinding(".*gcd.*")
    val counts = Control.yieldingForLoop
    println("Counts from my yieldingForLoop is " + counts.mkString(" "))
    val fr = MyFileReader.readFile("foobar.txt")
    println("A good food pairing with salt is " + Control.matchExample("salt"));
    println("My multiplication table is \n" + MultiplicationTable.multiTable)
   
    Matches.foodTaste("bacon")
    Matches.foodTaste("pork")
  }
}
