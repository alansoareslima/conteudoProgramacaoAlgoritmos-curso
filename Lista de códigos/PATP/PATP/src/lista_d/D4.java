package lista_d;

import java.util.Scanner;

public class D4 {

	public static void main(String[] args) {
		
		double v1, v2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		v1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = sc.nextDouble();
		
		if(v1 > v2){
			System.out.println("A diferen�a entre o primeiro e o segundo valor � " + (v1-v2));
		}
		
		if(v1 < v2){
			System.out.println("A diferen�a entre o segundo e o primeiro valor � " + (v2-v1));
		}
		
		sc.close();

	}

}
