package lista_a;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
	
		double lado1, lado2, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do lado 1:");
		lado1 = sc.nextDouble();
		System.out.println("Valor do lado 2:");
		lado2 = sc.nextDouble();
		
		area = lado1 * lado2;
		
		System.out.println("A área do retângulo é " + area);
		sc.close();
		
	}

}
