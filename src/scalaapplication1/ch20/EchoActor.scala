package scalaapplication1.ch20

import scala.actors._

class EchoActor extends Actor {

  def act() {
    while(true) {
      receive {
        case msg =>
          println("Received message: " + msg)
      }
    }
  }
}

class IntOnlyEchoActor extends Actor {
  def act() {
    while(true) {
      receive {
        case x: Int =>    // I only want Ints
          println("Got an Int: " + x)
      }
    }
  }
}
