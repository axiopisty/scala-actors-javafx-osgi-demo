package client.view

import javafx.fxml.{Initializable, FXML}
import scala.beans.BeanProperty
import javafx.scene.control.{Button, PasswordField, TextField}
import java.net.URL
import java.util.ResourceBundle

class LoginView extends Initializable {

  @FXML @BeanProperty var usernameField: TextField = _
  @FXML @BeanProperty var passwordField: PasswordField = _
  @FXML @BeanProperty var loginButton: Button = _

  override def initialize(p1: URL, p2: ResourceBundle) {
    usernameField.setPromptText("Username")
    passwordField.setPromptText("Password")
  }

  def login() {
    System.out.println(s"Attempt login for ${usernameField.getText}")
  }

}
