package lista_d;

import java.util.Scanner;

public class D8 {

	public static void main(String[] args) {
		
		double numero1, numero2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		numero2 = sc.nextDouble();
		
		if(numero1 > numero2){
			System.out.println("A divis�o do maior pelo menor � igual a: " + numero1/numero2);
		}
		if(numero2 > numero1){
			System.out.println("A divis�o do maior pelo menor � igual a: " + numero2/numero1);
		}
		
		sc.close();

	}

}
