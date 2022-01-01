package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.alert;

public class bhaskaraController {

	@FXML
	private Button btbCalcular;
	
	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnLimpar;
	
	@FXML
	private TextField txtValor_1;
	
	@FXML
	private TextField txtValor_2;
	
	@FXML
	private TextField txtValor_3;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private Label lblResultado1;
	
	public void btnCalcularOnclickAction() {
		try {
			double delta, x1, x2;
			double a = Double.parseDouble(txtValor_1.getText());
			double b = Double.parseDouble(txtValor_2.getText());
			double c = Double.parseDouble(txtValor_3.getText());
			
			
			delta = (b * b) + (-4 * (a * c));
			
			if (delta >=0) {
				x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
	            x2 = ((-(b) - Math.sqrt(delta)) / 2 * a);
	            
	            lblResultado.setText(String.format("%.2f", x1));
	            lblResultado.setText(String.format("%.2f", x2));
			
			}else {
				alert.showAlert("Erro", "Entrada inválida", "O delta não pode ser negativo", AlertType.ERROR);
				
			}
			
		}catch (NumberFormatException e) {
			alert.showAlert("Erro", "Entrada inválida", "Dado incompativel", AlertType.ERROR);
			
		}
		
	}
	
	public void btnSairOnclickAction() {
		System.exit(1);
	}
	
	public void btnLimparOnclickAction() {
		txtValor_1.setText("");
		txtValor_2.setText("");
		txtValor_3.setText("");
		lblResultado.setText("");
	}
	
}