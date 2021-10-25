package lista_d;

import java.util.Scanner;

public class D6 {

	public static void main(String[] args) {
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 10: ");
		numero = sc.nextInt();
		
		if(numero == 0){
			System.out.println("O numéro é o 0 - Zero.");
		}
		if(numero == 1){
			System.out.println("O numéro é o 1 - Um.");
		}
		if(numero == 2){
			System.out.println("O numéro é o 2 - Dois.");
		}
		if(numero == 3){
			System.out.println("O numéro é o 3 - Três.");
		}
		if(numero == 4){
			System.out.println("O numéro é o 4 - Quatro.");
		}
		if(numero == 5){
			System.out.println("O numéro é o 5 - Cinco.");
		}
		if(numero == 6){
			System.out.println("O numéro é o 6 - Seis.");
		}
		if(numero == 7){
			System.out.println("O numéro é o 7 - Sete.");
		}
		if(numero == 8){
			System.out.println("O numéro é o 8 - Oito.");
		}
		if(numero == 9){
			System.out.println("O numéro é o 9 - Nove.");
		}
		if(numero == 10){
			System.out.println("O numéro é o 10 - Dez.");
		}
		
		sc.close();

	}

}
