package lista_i;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		int sexo, contador, totMasc = 0, totFem = 0;
		Scanner sc = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador ++) {
			System.out.println("Digite 1 para Masculino e 2 para Feminino: ");
			sexo = sc.nextInt();
			
			if(sexo == 1) {
				totMasc = (totMasc + 1);
			}
			if(sexo == 2) {
				totFem = (totFem + 1);
			}
		}
		System.out.println("Total masculino: " + totMasc);
		System.out.println("Total feminino: " + totFem);
		
		sc.close();
		
	}

}
