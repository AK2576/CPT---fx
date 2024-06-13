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
 * @author AmenaKassim
 * @date 06/13/2024
 * A register controller that switches from register page to login
 */
public class RegisterController {

	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;
	@FXML
	public Label lblError;
	
	public void registerButtonPressed(ActionEvent event) throws IOException {
		// Get the user name and password
		Database0.username = tfUsername.getText();
		Database0.password = pfPassword.getText();
	}

	// Switches from register to login
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToRegister(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/RegisterFX.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/LoginFX.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
