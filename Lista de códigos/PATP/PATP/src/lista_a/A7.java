package lista_a;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		
		double tempo_gasto, vm, distancia, litros_usados;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo gasto na viagem (horas): ");
		tempo_gasto = sc.nextDouble();
		System.out.println("Digite a velocidade média: ");
		vm = sc.nextDouble();
		
		
		distancia = tempo_gasto * vm;
		litros_usados = distancia / 12;
		
		System.out.println("Velocidade média: " + vm + "km/h.");
		System.out.println("Tempo gasto: " + tempo_gasto + "h.");
		System.out.println("Distância percorrida: " + distancia + "km.");
		System.out.println("Litros de combústivel usados: " + litros_usados + "L.");
		
		sc.close();
	}

}
