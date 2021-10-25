package lista_a;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		
		double raio, altura, volume;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		raio = sc.nextDouble();
		System.out.println("Digite o volume: ");
		altura = sc.nextDouble();
		
		volume = 3.14159 * raio * raio * altura;
		
		System.out.println("O volume é: " + volume);
		
		sc.close();
	}

}
