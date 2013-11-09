package client.controller

import akka.actor.{Actor, ActorLogging}
import client.message.LaunchGui
import _root_.javafx.application.Application
import client.Gui

class GuiActor extends Actor with ActorLogging {
  override def receive: Actor.Receive = {
    case LaunchGui => Application.launch(classOf[Gui])
    case unknown => println(s"Unhandled message, '$unknown'")
  }
}
