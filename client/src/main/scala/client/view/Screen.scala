package client.view

import java.net.URL
import java.io.InputStream

sealed abstract class Screen(val resource: String) {
  val clazz: Class[Screen] = classOf[Screen]
  val url: URL = clazz.getResource(resource)
  val inputStream: InputStream = clazz.getResourceAsStream(resource)
}

case object Login extends Screen("/fxml/login.fxml")
