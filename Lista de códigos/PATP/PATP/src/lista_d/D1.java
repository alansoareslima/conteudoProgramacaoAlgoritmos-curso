package lista_d;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		
		double numeroUm, numeroDois;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Digite o primeiro número: ");
		numeroUm = sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numeroDois = sc.nextDouble();
		
		if (numeroUm > numeroDois){
			System.out.println("O primeiro número é maior.");
		}
		
		if (numeroUm < numeroDois){
			System.out.println("O segundo número é maior.");
		}
		
		if (numeroUm == numeroDois){
			System.out.println("Os números são iguais..");
		}
		
		sc.close();	
	}

}
