package lista_a;

import java.util.Scanner;

public class ExExtra {

	public static void main(String[] args) {
		
		double sb, previdencia, imposto, sl;
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Digite o sal�rio bruto: ");
		sb = sc.nextDouble();
		
		previdencia = sb * 0.1;
		imposto = (sb - previdencia) * 0.05;
		sl = (sb - previdencia) - imposto;
		
		System.out.println("Previd�ncia: R$" + previdencia);
		System.out.println("Imposto: R$" + imposto);
		System.out.println("Sal�rio l�quido: R$" + sl);
		
		sc.close();
				
	}

}
