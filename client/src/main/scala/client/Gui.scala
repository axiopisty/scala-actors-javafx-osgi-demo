package client

import _root_.client.view.Login
import _root_.client.view.Screen
import javafx.application.Application
import javafx.stage.Stage
import javafx.fxml.FXMLLoader
import javafx.scene.{Scene, Parent}

class Gui extends Application {
  def start(stage: Stage) {
    val initialScreen: Screen = Login
    stage.setTitle("GUI")
    try {
      val loader = new FXMLLoader
//      loader.setClassLoader(getClass.getClassLoader)
      loader.setLocation(initialScreen.url)
      val root: Parent = loader.load(initialScreen.inputStream).asInstanceOf[Parent]
      val scene: Scene = new Scene(root, 800, 600)
      stage.setScene(scene)
      stage.show()
    } catch {
      case t: Throwable => t.printStackTrace()
    }
  }

  override def stop() {
    Container.shutdown()
  }
}
