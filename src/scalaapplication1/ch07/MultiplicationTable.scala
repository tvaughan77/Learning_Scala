package scalaapplication1.ch07

object MultiplicationTable {

  def makeRowSeq(row : Int) = 
    // N.B. = for (clauses) yield { body }
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (4 - prod.length)
      padding + prod
    }
  
  def makeRow(row : Int) =
    makeRowSeq(row).mkString
  
  def multiTable() = {
    val tableSeq = 
      for (row <- 1 to 10) 
        yield makeRow(row)
    
    tableSeq.mkString("\n")
  }
}
