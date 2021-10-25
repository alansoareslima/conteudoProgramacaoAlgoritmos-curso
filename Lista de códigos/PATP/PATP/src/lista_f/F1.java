package lista_f;

import java.util.Scanner;

public class F1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int codigo;
		
		System.out.println("Digie o código do departamento: ");
		codigo= sc.nextInt();
		
		if(codigo == 10){
			 System.out.println("Departamento de Contabilidade");
		}else if(codigo == 12){
			System.out.println("Departamento de Almoxarifado");
		} else if (codigo == 14){
			System.out.println("Departamento de Informática");
		}
		
		sc.close();	
	}

}
