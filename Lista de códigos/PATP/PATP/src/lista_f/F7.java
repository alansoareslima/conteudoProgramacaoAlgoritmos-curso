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
			System.out.println("Podem ser comprimentos dos lados de um triângulo.");
			if(x == y && y == z){
				System.out.println("Possui 3 lados iguais, portanto um triângulo equilátero e também isósceles.");
			}else if(x == y || y == z){
				System.out.println("Possui 2 lados iguais, portanto um tiângulo isósceles.");
			}else if(x != y && y != z){
				System.out.println("Possui 3 lados diferentes, portanto um triângulo escaleno.");
			}
		}else {
			System.out.println("Não podem ser comprimentos dos lados de um triângulo.");
		}
		
		sc.close();
		
	}

}
