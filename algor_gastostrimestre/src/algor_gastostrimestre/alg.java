package algor_gastostrimestre;

public class alg {

	public static void main(String[] args) {
		// Testando algorítmo proposto
		int gastosJaneiro=15000;
		int gastosFevereiro=23000;
		int gastosMarco=17000;

	int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	System.out.println("Gastos do trimestre: R$" + gastosTrimestre);
	
	int mediaGastos = gastosTrimestre / 3;
	System.out.println("Média mensal: R$" + mediaGastos);

	}

}
