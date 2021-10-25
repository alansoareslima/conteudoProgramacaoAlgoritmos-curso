package lista_d;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
	
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: ");
		num = sc.nextDouble();
		
		if(num > 100){
			System.out.println("O valor inserido é maior do que 100.");
		}
		
		if(num < 100){
			System.out.println("O valor inserido é menor do que 100.");
		}
		
		if(num == 100){
			System.out.println("O valor inserido é igual a 100.");
		}
		
		sc.close();
		
	}

}
