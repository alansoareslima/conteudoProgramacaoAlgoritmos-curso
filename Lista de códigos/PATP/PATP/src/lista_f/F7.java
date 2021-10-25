package lista_f;

import java.util.Scanner;

public class F7 {

	public static void main(String[] args) {
		
		double x, y, z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor de Y: ");
		y = sc.nextDouble();
		System.out.println("Digite o valor de Z: ");
		z = sc.nextDouble();
		
		if(x < y + z || y < x + z || z < x + y){
			System.out.println("Podem ser comprimentos dos lados de um tri�ngulo.");
			if(x == y && y == z){
				System.out.println("Possui 3 lados iguais, portanto um tri�ngulo equil�tero e tamb�m is�sceles.");
			}else if(x == y || y == z){
				System.out.println("Possui 2 lados iguais, portanto um ti�ngulo is�sceles.");
			}else if(x != y && y != z){
				System.out.println("Possui 3 lados diferentes, portanto um tri�ngulo escaleno.");
			}
		}else {
			System.out.println("N�o podem ser comprimentos dos lados de um tri�ngulo.");
		}
		
		sc.close();
		
	}

}
