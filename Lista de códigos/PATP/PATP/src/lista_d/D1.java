package lista_d;

import java.util.Scanner;

public class D1 {

	public static void main(String[] args) {
		
		double numeroUm, numeroDois;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Digite o primeiro n�mero: ");
		numeroUm = sc.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		numeroDois = sc.nextDouble();
		
		if (numeroUm > numeroDois){
			System.out.println("O primeiro n�mero � maior.");
		}
		
		if (numeroUm < numeroDois){
			System.out.println("O segundo n�mero � maior.");
		}
		
		if (numeroUm == numeroDois){
			System.out.println("Os n�meros s�o iguais..");
		}
		
		sc.close();	
	}

}
