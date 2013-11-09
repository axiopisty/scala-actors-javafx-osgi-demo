package client

import _root_.client.message.LaunchGui
import akka.actor.{ Props, ActorSystem }
import org.osgi.framework.BundleContext
import akka.osgi.ActorSystemActivator
import client.controller.GuiActor

class ClientActivator extends ActorSystemActivator {
  def configure(context: BundleContext, system: ActorSystem) {
    // optionally register the ActorSystem in the OSGi Service Registry
    registerService(context, system)
    Container.bundleContext = context

    val guiActor = system.actorOf(Props[GuiActor], name = "guiActor")
    guiActor ! LaunchGui // send a message through the actor system to show the gui

  }
}
