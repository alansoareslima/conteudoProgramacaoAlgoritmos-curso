package lista_a;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		double PRECO, DESCONTO, PRECO_VISTA;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		PRECO = sc.nextDouble();
		
		DESCONTO = PRECO * 0.1;
		PRECO_VISTA = PRECO - DESCONTO;
		
		System.out.println("Valor do produto: R$" + PRECO);
		System.out.println("Valor do produto à vista: R$" + PRECO_VISTA);
		System.out.println("Valor do desconto: R$" + DESCONTO);
		
		sc.close();
	}

}
