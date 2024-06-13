package Controller;

import java.io.IOException;

import data.Database0;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
* @author Amena Kassim
* @date 06/13/2024
* Controller class for login page info and switch to webview
*/
public class LoginFXController {
	
		@FXML
		public TextField tfUsername;
		@FXML
		public PasswordField pfPassword;
		@FXML
		public Label lblError;
		
		// Instance variable
		private Parent root;
		private Stage stage;
		private Scene scene;
		
		public void loginButtonPressed(ActionEvent event) throws IOException {
			
			//Get registered info from user
			String username = tfUsername.getText();
			String password = pfPassword.getText();
			
			//Ensuring username and password matches the ones inputted on register page
			if (!username.equals(Database0.username) ||
				!password.equals(Database0.password)
				) {
					lblError.setText("Invalid username or password.");
					lblError.setVisible(true);
					return;
				}
		}
		
	//Switching from login to webview page
	public void switchToWebView(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("/view/WebviewFX.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
