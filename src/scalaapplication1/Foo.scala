package scalaapplication1

class Foo {
  class Foo {
    
    def playWithImmutableMaps() {
      // no need to fully qualify the object as immutable Maps are the default
      var romanNumeral = Map(1->"I", 2->"II", 3->"III", 4->"IV", 5->"V")
      println(romanNumeral(4))
      
      val someOtherMap = Map(1->"A", 2->"B")
      // immutable doesn't mean non-re-assignable, it just means that modifiers return new Maps leaving the original alone
      romanNumeral = someOtherMap
    }
    
    def playWithMutableMaps() {
      var treasureMap = scala.collection.mutable.Map[Int, String]()
      treasureMap += (1 -> "Go to island")
      treasureMap += (2 -> "Find big X on ground")
      treasureMap += (3 -> "Dig")
      
      println("The entire treasureMap is " + treasureMap)
      treasureMap(2) = "foo"
      println("treasureMap(2) is " + treasureMap(2))
      
      // interesting....you can invoke the "->" operator on any object in scala to make a tuple
      val tupleA = (1).->("Blah")
      println("tuple A is " + tupleA)
      
      treasureMap.+=((4).->("Bar"), (5).->("Baz"))
      println("Here's my treasureMap now " + treasureMap)
    }
    
    def playWithImmutableSets() {
      var jetSet = scala.collection.immutable.Set("Boeing", "Airbus")
      // this is shorthand for jetSet = jetSet + "Lear", which is how this object can be called "immutable"
      jetSet += "Lear"                       
      println(jetSet.contains("Cessna"))
      println("Contents of jetSet are " + jetSet)
    }
    
    def playWithMutableSets() {
      val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
      movieSet += "Shrek"
      println("Contents of movieSet are " + movieSet)
    }
    
    def playWithTuples() {
      val pair = (99, "Luftbaloons")
      println("the pair._1 value is " + pair._1)
      println("the pair._2 value is " + pair._2)
    }
    
    def playWithLists() {
      // This is a scala.List and it is immutable
      val oneTwoThree = List(1, 2, 3)
  
      val oneTwo = List(1, 2)
      val threeFour = List(3, 4)
      val oneTwoThreeFour = oneTwo ::: threeFour
  
      println("" + oneTwo + " and " + threeFour + " were not mutated.")
      println("Thus, " + oneTwoThreeFour + " is a new list.")
  
      // cons operator works on the right hand side because the operator ends in ":"
      val myList = List(1, 2)
      val consdList = 3 :: myList
      println("ConsdList is " + consdList)

      val thrill = "Will" :: "fill" :: "until" :: Nil
      val combo = List("a", "b") ::: List("c", "d")
    
      println("The element at thrill[2] is " + thrill(2))
      println("the number of string lements in thrill that have length 4 is " + thrill.count(s => s.length == 4))
      val thrillAfterDrop2 = thrill.drop(2)
      println("The list after a call to thrill.drop(2) is " + thrillAfterDrop2 + " while thrill is " + thrill)
      val thrillWithoutRightMost2Elements = thrill.dropRight(2)
      println("The list after a call to thrill.dropRight(2) is " + thrillWithoutRightMost2Elements + " while thrill is " + thrill)
    
      println("Result of thrill.exists(s => s == \"until\") + is " + thrill.exists(s => s == "until"))

      println("Result of thrill.filter(s => s.length == 4) is " + thrill.filter(s => s.length == 4))
    
      println("Indicates whether all elements in the thrill list " + thrill + " end in the letter 'l' is done via " + 
              "thrill.forall(s => s.endsWith(\"l\") = " + thrill.forall(s => s.endsWith("l")))
    
      println("Executes the print statement on each of the strings in the thrill list ")
      thrill.foreach(s => print(s))
      println()
      println("More concise version of the foreach(s => print(s) is just foreach(print) which I " +
              "get away with because print takes a single argument, I think")
      thrill.foreach(print)
      println()
    
      println("Result of thrill.head is " + thrill.head)
      println("Result of thrill.tail is " + thrill.tail)
      println("Result of thrill.last is " + thrill.last)

      println("Mapping the letter \"y\" on to the list is " + thrill.map(s => s + "y"))
    
      val mkstring = thrill.mkString(", ")
      println("Makes a string with the elements of the list " + mkstring)
    
      val afterRemove = thrill.remove(s => s.length() == 4)
      println("After calling the deprecated .remove with s.length==4 predicate " + afterRemove)
    
      // The documentation of the Scala Standard Library recommends the usage of the filterNot instead of the remove method 
      // and sortWith instead of the sort method.
      val sorted = thrill.sort((s, t) => s.charAt(0).toLowerCase < t.charAt(0).toLowerCase)
      println("List containing all elements of the thrill list in alphabetical order of the first character lower-cased " +sorted)
    }
  }
}
