package Modulo;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float salar;
		char cargo;
		System.out.println("Qual cargo você ocupa? Gerente(a), Cal(b), Vendedor(c) ou Ass. Atend.(d):");
		cargo=(char)System.in.read();
		System.out.println("Qual o valor do seu salário?");
		salar=teclado.nextFloat();

	}

}
