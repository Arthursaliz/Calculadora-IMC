/*package gui;

import gui.Ferraments.CalculoIMC;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class ViewControlle {

	@FXML
	private Button btCalcular;
	@FXML
	private RadioButton rMasculino;
	@FXML
	private RadioButton rFeminino;
	@FXML
	private Hyperlink linkLimpar;
	@FXML
	private TextField textNome;
	@FXML
	private TextField textPeso;
	@FXML
	private TextField textAltura;
	@FXML
	private Label labelNome;
	@FXML
	private Label labelIMC;
	@FXML
	private Label labelSexo;
	@FXML
	private Label labelQuadro;
	@FXML
	private Label labelSintomas;
	@FXML
	private Label labelPesoIdeal;

	private CalculoIMC calculo = new CalculoIMC();

	@FXML
	public void onBtActionCalcular() {

		double RIMC;
		RIMC = calculo.IMC(Double.parseDouble(textPeso.getText()), Double.parseDouble(textAltura.getText()));

		labelNome.setText(textNome.getText());
		labelIMC.setText(String.format("%.2F", RIMC));
		labelQuadro.setText(calculo.Quadro(RIMC));
		labelSintomas.setText(calculo.Quadro(RIMC));

		if (rMasculino.isSelected()) {
			labelSexo.setText("Mas");
			labelPesoIdeal
					.setText(String.format("%.2f", calculo.PIMasculino(Double.parseDouble(textAltura.getText()))));
		} else if (rFeminino.isSelected()) {
			labelSexo.setText("Fem");
			labelPesoIdeal.setText(String.format("%.2f", calculo.PIFeminino(Double.parseDouble(textAltura.getText()))));
		}
	}

	@FXML
	public void onHyperLinkActionLimpar() {
		textNome.clear();
		textPeso.clear();
		textAltura.clear();
		rMasculino.setSelected(false);
		rFeminino.setSelected(false);
		
	}

}*/
package gui;

import gui.Ferraments.CalculoIMC;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ViewControlle {

	@FXML
	private Button btCalcular;
	@FXML
	private RadioButton rMasculino;
	@FXML
	private RadioButton rFeminino;

	private ToggleGroup toggleGroupSexo;
	
	@FXML
	private Label labelInformacao;

	@FXML
	private Hyperlink linkLimpar;
	@FXML
	private TextField textNome;
	@FXML
	private TextField textPeso;
	@FXML
	private TextField textAltura;
	@FXML
	private Label labelNome;

	@FXML
	private Label labelIMC;
	@FXML
	private Label labelSexo;
	@FXML
	private Label labelQuadro;
	@FXML
	private Label labelSintomas;
	@FXML
	private Label labelPesoIdeal;

	@FXML
	public void initialize() {
		// Inicializa o ToggleGroup e adiciona os RadioButtons ao grupo
		toggleGroupSexo = new ToggleGroup();
		rMasculino.setToggleGroup(toggleGroupSexo);
		rFeminino.setToggleGroup(toggleGroupSexo);
	}

	@FXML
	public void onBtActionCalcular() {

		double RIMC = CalculoIMC.IMC(Double.parseDouble(textPeso.getText()), Double.parseDouble(textAltura.getText()));
		String quadro = CalculoIMC.Quadro(RIMC);
		labelNome.setText(textNome.getText());
		labelIMC.setText(String.format("%.2f", RIMC));
		labelQuadro.setText(quadro);
		labelSintomas.setText(CalculoIMC.Sintomas(quadro));
		labelSintomas.setWrapText(true); // para quebrar linhas da label

		RadioButton selectedRadioButton = (RadioButton) toggleGroupSexo.getSelectedToggle();
		if (selectedRadioButton != null) {
			String sexo = selectedRadioButton.getText();
			if (sexo == "Masculino") {
				labelSexo.setText("Masculino");
				labelPesoIdeal.setText(
						String.format("%.2f", CalculoIMC.PIMasculino(Double.parseDouble(textAltura.getText()))));
			} else {
				labelSexo.setText("Feminino");
				labelPesoIdeal.setText(
						String.format("%.2f", CalculoIMC.PIFeminino(Double.parseDouble(textAltura.getText()))));
			}
		} else {
			labelInformacao.setText("Nenhum sexo selecionado.");
		}
		
		/*
		 * if (rMasculino.isSelected()) { labelSexo.setText("Masculino");
		 * labelPesoIdeal.setText(String.format("%.2f",CalculoIMC.PIMasculino(Double.
		 * parseDouble(textAltura.getText())))); } else if (rFeminino.isSelected()) {
		 * labelSexo.setText("Feminino");
		 * labelPesoIdeal.setText(String.format("%.2f",CalculoIMC.PIFeminino(Double.
		 * parseDouble(textAltura.getText())))); }
		 */
	}

	@FXML
	public void onHyperLinkActionLimpar() {
		textNome.clear();
		textPeso.clear();
		textAltura.clear();
		rMasculino.setSelected(false);
		rFeminino.setSelected(false);
		labelNome.setText("");
		labelIMC.setText("");
		labelSexo.setText("");
		labelQuadro.setText("");
		labelSintomas.setText("");
		labelPesoIdeal.setText("");
	}
}
