import java.util.Scanner;

public class aumento_salario {

	public static void main(String[] args) {
		double salAtual;
		double aumento;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Qual o seu salário atual?");
		salAtual= teclado.nextDouble();
		nvsalario= (salAtual*0.25);
		System.out.println("Seu novo salário será de R$"+ (aumento+salAtual));
	}

}
