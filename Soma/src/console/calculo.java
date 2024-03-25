package console;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		int ano_nasc;
		int ano_idade;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Informe o ano do seu nascimento:");
		ano_nasc=teclado.nextInt();
		System.out.println("Qual o ano você deseja saber sua idade?");
		ano_idade=teclado.nextInt();
		System.out.println("Em "+ ano_idade +" você terá " + (ano_idade-ano_nasc)+" anos de idade.");
		

	}

}
