package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * @author AmenaKassim
 * @date 06/13/2024
 * A webview controller that accesses github
 */
public class WebViewController implements Initializable {

	@FXML
	private WebView webView;
	
	@FXML
	private TextField textFeild;
	
	private WebEngine engine;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = webView.getEngine();
		loadPage();
	}
	
	public void loadPage() {
		
		engine.load("https://github.com/AK2576");
	}
}
