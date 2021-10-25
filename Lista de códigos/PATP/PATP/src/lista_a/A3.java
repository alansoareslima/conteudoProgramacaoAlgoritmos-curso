package lista_a;

import java.util.Scanner;
	
public class A3 {

	public static void main(String[] args) {

		double c, f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		c = sc.nextDouble();
		
		f = (9*c+160) / 5;
		
		System.out.println("Essa temperatura é equivalente a " + f + "°F");
		
		sc.close();
	}

}