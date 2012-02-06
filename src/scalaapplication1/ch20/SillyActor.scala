package scalaapplication1.ch20

import scala.actors._

object SillyActor extends Actor {

  def act() {
    for(i <- 1 to 5) {
      println("I'm acting")
      Thread.sleep(500)
    }
  }
}
