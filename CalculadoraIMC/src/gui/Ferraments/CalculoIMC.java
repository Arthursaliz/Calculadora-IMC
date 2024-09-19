package gui.Ferraments;

/*public class CalculoIMC {

	public double IMC(double ValorPeso, double ValorAltura) {
		return ValorPeso / (ValorAltura * ValorAltura);
	}

	public double PIMasculino(double ValorAltura) {
		return 52 + (0.75 * (ValorAltura - 152.4));
	}

	public double PIFeminino(double ValorAltura) {
		return 52 + (0.67 * (ValorAltura - 152.4));
	}

	public String Quadro(double ResultIMC) {

		if (ResultIMC <= 17)
			return "Muito abaixo do peso";
		else if (ResultIMC < 18.6)
			return "Abaixo do peso";
		else if (ResultIMC < 25)
			return "Peso normal";
		else if (ResultIMC < 30)
			return "Acima do peso";
		else if (ResultIMC < 35)
			return "Obesidade I";
		else if (ResultIMC < 40)
			return "Obesidade II (severa)";
		else
			return "Obesidade III(mórbida)";
	}

	public String Sintomas(String ResultSituacao) {
		if (ResultSituacao == "Muito abaixo do peso")
			return "Insuficiência cardíaca \n Anemia Grave \n Enfraquecimento do Sist. Imune";
		else if (ResultSituacao == "Abaixo do peso")
			return "Problemas de saúde \n ligados a desnutrição";
		else if (ResultSituacao == "Peso normal")
			return "Saúdavel";
		else if (ResultSituacao == "Acima do peso")
			return "Fadiga \n Varizes \n Má circulação";
		else if (ResultSituacao == "Obesidade I")
			return "Diabéties \n Infarto \n Angina \n Anterosclerose" ;
		else if (ResultSituacao == "Obesidade II (severa)")
			return "Falta de ar \n Apneia do sono" ;
		else
			return "Refluxo \n Infarto \n AVC Dificuldade para locomoção";
	}
}*/

public class CalculoIMC {

	public static double IMC(double ValorPeso, double ValorAltura) {
		return ValorPeso / (ValorAltura * ValorAltura);
	}

	public static double PIMasculino(double ValorAltura) {
		return 52 + (0.75 * (ValorAltura - 152.4));
	}

	public static double PIFeminino(double ValorAltura) {
		return 52 + (0.67 * (ValorAltura - 152.4));
	}

	public static String Quadro(double ResultIMC) {
		if (ResultIMC <= 17)
			return "Muito abaixo do peso";
		else if (ResultIMC < 18.6)
			return "Abaixo do peso";
		else if (ResultIMC < 25)
			return "Peso normal";
		else if (ResultIMC < 30)
			return "Acima do peso";
		else if (ResultIMC < 35)
			return "Obesidade I";
		else if (ResultIMC < 40)
			return "Obesidade II (severa)";
		else
			return "Obesidade III (mórbida)";
	}

	public static String Sintomas(String ResultSituacao) {
		switch (ResultSituacao) {
		case "Muito abaixo do peso":
			return "Insuficiência cardíaca \n Anemia Grave \n Enfraquecimento do Sist. Imune";
		case "Abaixo do peso":
			return "Problemas de saúde \n ligados a desnutrição";
		case "Peso normal":
			return "Saúdavel";
		case "Acima do peso":
			return "Fadiga\nVarizes\nMá circulação";
		case "Obesidade I":
			return "Diabetes \n Infarto \n Angina \n Anterosclerose";
		case "Obesidade II (severa)":
			return "Falta de ar \n Apneia do sono";
		case "Obesidade III (mórbida)":
			return "Refluxo \n Infarto \n AVC \n Dificuldade para locomoção";
		default:
			return "";
		}
	}
}
