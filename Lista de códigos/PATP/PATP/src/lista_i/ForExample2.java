package lista_i;

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		
		int numero, i, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		numero = sc.nextInt();
		
		for(i = 0; i <= 10; i ++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
		
		sc.close();

	}

}
