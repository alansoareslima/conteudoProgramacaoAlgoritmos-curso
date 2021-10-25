package lista_a;

import java.util.Scanner;

public class ExExtra {

	public static void main(String[] args) {
		
		double sb, previdencia, imposto, sl;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Digite o salário bruto: ");
		sb = sc.nextDouble();
		
		previdencia = sb * 0.1;
		imposto = (sb - previdencia) * 0.05;
		sl = (sb - previdencia) - imposto;
		
		System.out.println("Previdência: R$" + previdencia);
		System.out.println("Imposto: R$" + imposto);
		System.out.println("Salário líquido: R$" + sl);
		
		sc.close();
				
	}

}
