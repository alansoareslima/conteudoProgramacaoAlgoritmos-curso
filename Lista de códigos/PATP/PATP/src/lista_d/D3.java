package lista_d;

import java.util.Scanner;

public class D3 {

	public static void main(String[] args) {
	
		int cod;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do departamento: ");
		cod = sc.nextInt();
		
		if(cod == 1){
			System.out.println("Departamento de Expedi��o.");
		}

		if(cod == 2){
			System.out.println("Departamento de Recursos Humanos.");
		}
		
		if(cod == 3){
			System.out.println("Departamento de Log�stica.");
		}
		
		if(cod == 4){
			System.out.println("Departamento de Contabilidade.");
		}
		
		sc.close();
	}

}
