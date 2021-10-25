package lista_a;

import java.util.Scanner;

public class A1 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		double v1, v2, v3, v4, média;
		sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		v1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		v2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		v3 = sc.nextDouble();
		System.out.println("Digite a quarta nota: ");
		v4 = sc.nextDouble();
		
		média=(v1 + v2 + v3 + v4) / 4;
		
		System.out.println("A média do aluno é " + média);
	}

}
