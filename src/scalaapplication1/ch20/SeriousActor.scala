package scalaapplication1.ch20

import scala.actors._

object SeriousActor extends Actor {

  def act() {
    for(i <- 1 to 5) {
      println("To be or not to be.")
      Thread.sleep(450)
    }
  }
}
