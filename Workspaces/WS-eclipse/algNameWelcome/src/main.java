import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1, n2,soma;
		System.out.println("Digite dois números: ");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		soma=n1+n2;
		System.out.println("A soma de "+ n1+" + "+n2+" é: "+soma);


	}

}
