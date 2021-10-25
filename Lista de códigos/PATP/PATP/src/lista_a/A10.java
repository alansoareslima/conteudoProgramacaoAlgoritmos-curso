package lista_a;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		
		double A, B, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		
		aux = A;
		A = B;
		B = aux;
		
		System.out.println("Valor de A: " + A);
		System.out.println("Valor de B: " + B);
		
		sc.close();
	}

}
