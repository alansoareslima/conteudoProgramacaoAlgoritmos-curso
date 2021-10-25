package lista_d;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int numeroInteiro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numeroInteiro = sc.nextInt();
		
		if (numeroInteiro < 0){
			System.out.println("Número negativo.");
		}
		
		if (numeroInteiro > 0){
			System.out.println("Número positivo.");
			
		sc.close();
		}

	}

}
