package Modulo;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		float salar,aumento;
		char cargo;
		System.out.println("Qual cargo você ocupa? Gerente(a), Cal(b), Vendedor(c) ou Ass. Atend.(d):");
		cargo=(char)System.in.read();
		System.out.println("Qual o valor do seu salário?");
		salar=teclado.nextFloat();
		if (cargo==a) {aumento=(salar*0.10)
		System.out.println("Seu salário será reajustado em R$"+ aumento +", e será de R$"(salar+aumento)" mensais.");
		if (cargo==b)aumento=(salar*0,15);
		if (cargo==c)aumento=(salar*0,17);
		if (cargo==d)aumento=(salar*0,20);
		}

	}

}
