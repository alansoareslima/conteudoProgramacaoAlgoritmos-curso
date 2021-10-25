package lista_d;

import java.util.Scanner;

public class D7 {

	public static void main(String[] args) {

		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		
		if(numero < 5){
			System.out.println("O número digitado é menor do que 5.");
		}
		if(numero > 10){
			System.out.println("O número digitado é maior do que 10.");
		}
		if(numero >= 5 && numero <= 10){
			System.out.println("O número digitado está entre 5 e 10.");
		}
		
		sc.close();
	}

}
