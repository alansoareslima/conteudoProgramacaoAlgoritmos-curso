package lista_d;

import java.util.Scanner;

public class D2 {

	public static void main(String[] args) {
	
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer: ");
		num = sc.nextDouble();
		
		if(num > 100){
			System.out.println("O valor inserido � maior do que 100.");
		}
		
		if(num < 100){
			System.out.println("O valor inserido � menor do que 100.");
		}
		
		if(num == 100){
			System.out.println("O valor inserido � igual a 100.");
		}
		
		sc.close();
		
	}

}
