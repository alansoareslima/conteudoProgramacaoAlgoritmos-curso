package lista_f;

import java.util.Scanner;

public class F3 {

	public static void main(String[] args) {

		double valor1, valor2, valor3, valor4,media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		valor1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		valor2 = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		valor3 = sc.nextInt();
		System.out.println("Digite a quarta nota: ");
		valor4 = sc.nextInt();
		
		media = (valor1+valor2+valor3+valor4)/4;
		
		if(media >= 5) {
			System.out.println("Média igual ou maior a 5, aprovado!");
		}else if(media < 5) {
			System.out.println("Média menor do que 5, reprovado.");
		}
		
		sc.close();
		
	}
	

}
