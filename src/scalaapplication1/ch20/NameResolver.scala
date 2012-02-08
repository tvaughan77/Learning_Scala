package scalaapplication1.ch20

import scala.actors._
import java.net.{InetAddress, UnknownHostException}

object NameResolver extends Actor {

  def act() {
    react {
      case (name: String, actor: Actor) =>
        actor ! getIp(name)
        act()
      case "EXIT" =>
        println("Name resolver exiting")
        // quit
      case msg =>
        println("Unhandled message: " + msg)
        act()
    }
  }
  
  def getIp(name:String): Option[InetAddress] = {
    try {
      Some(InetAddress.getByName(name))
    } catch {
      case _:UnknownHostException => None
    }
  }
}
