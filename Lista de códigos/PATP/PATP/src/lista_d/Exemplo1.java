package lista_d;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		int numeroInteiro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numeroInteiro = sc.nextInt();
		
		if (numeroInteiro < 0){
			System.out.println("N�mero negativo.");
		}
		
		if (numeroInteiro > 0){
			System.out.println("N�mero positivo.");
			
		sc.close();
		}

	}

}
