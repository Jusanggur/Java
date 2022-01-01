package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculadoraController {

	@FXML
	private TextField txtValor_1;
	
	@FXML
	private TextField txtValor_2;
	
	@FXML
	private Label lblResultado;
	
	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnLimpar;
	
	@FXML
	private Button btnSomar;
	
	@FXML
	private Button btnSubtrair;
	
	@FXML
	private Button btnMultiplicar;
	
	@FXML
	private Button btnDividir;
	
	public void btnSairOnclickAction() {
		System.exit(1);
	}
	
	public void btnLimparOnclickAction() {
		txtValor_1.setText("");
		txtValor_2.setText("");
		lblResultado.setText("");
	}
	
	public void btnSomarOnclickAction() {
		double valor1 = Double.parseDouble(txtValor_1.getText());
		double valor2 = Double.parseDouble(txtValor_2.getText());
		double resultado = valor1 + valor2;
		lblResultado.setText(String.format("%.2f", resultado));
	}
	
	public void btnSubtrairOnclickAction() {
		double valor1 = Double.parseDouble(txtValor_1.getText());
		double valor2 = Double.parseDouble(txtValor_2.getText());
		double resultado = valor1 - valor2;
		lblResultado.setText(String.format("%.2f", resultado));
	}
	
	public void btnMultiplicarOnclickAction() {
		double valor1 = Double.parseDouble(txtValor_1.getText());
		double valor2 = Double.parseDouble(txtValor_2.getText());
		double resultado = valor1 * valor2;
		lblResultado.setText(String.format("%.2f", resultado));
	}
	
	public void btnDividirOnclickAction() {
		double valor1 = Double.parseDouble(txtValor_1.getText());
		double valor2 = Double.parseDouble(txtValor_2.getText());
		double resultado = valor1 / valor2;
		lblResultado.setText(String.format("%.2f", resultado));
	}
}
