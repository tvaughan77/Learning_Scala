package scalaapplication1.ch07

object Matches {

  def foodTaste(food : String) {
    food match {
      case "bacon" => println("salty")
      case "snickers" => println("sweet")
      case "steak" => println("savory")
      case _ => println("no idea")        
    }
  }
}
