package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class saudacaoController {
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtSaudacao;
	
	@FXML
	private Label lbResultado;
	
	@FXML
	private Button BtnSair;
	
	@FXML
	private Button BtnLimpar;
	
	@FXML
	private Button BtnExibir;

	public void BtnExibironclickAction() {
		String nome = txtNome.getText();
		String saudacao = txtSaudacao.getText();
		lbResultado.setText(nome + saudacao);
	}
	
	public void BtLimparonclickAction() {
		txtNome.setText("");
		txtSaudacao.setText("");
	}
	
	public void btnSairOnclickAction() {
		System.exit(1);
	}
}