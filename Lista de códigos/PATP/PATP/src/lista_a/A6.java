package lista_a;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
	
		double ht, vh, pd, sb, td, sl;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Horas trabalhadas: ");
		ht = sc.nextDouble();
		
		System.out.println("Valor da hora (R$): ");
		vh = sc.nextDouble();
		
		System.out.println("Percentual de desconto (%): ");
		pd = sc.nextDouble();
		
		sb = ht * vh;
		td = (pd/100) * sb;
		sl = sb - td;
		
		System.out.println("O salário bruto é: R$" + sb);
		System.out.println("O salário líquido é: R$" + sl);
		System.out.println("Desconto total: R$" + td);
		
		sc.close();
	}

}
