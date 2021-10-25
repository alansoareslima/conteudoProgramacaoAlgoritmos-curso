package lista_f;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		/* Desenvolva um programa para calcular o reajuste salarial dos funcion�rios de um empresa de 
			desenvolvimento de softwares. O programa dever� solicitar a leitura do c�digo e o sal�rio atual do 
			funcion�rio e realizar o reajuste salarial de acordo com a tabela abaixo. O programa dever� 
			apresentar o sal�rio antigo, o novo sal�rio, o valor do reajuste e a fun��o do funcion�rio.
			C�digo 	Fun��o 	Percentual
			1 		Operador 	5%
			2 		Programador 10%
			3 		Analista 	15%
			4 		Gerente 	25%
		 */
		
		double codigo, salarioAntigo, salarioNovo, reajuste;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o c�digo: ");
		codigo=sc.nextDouble();
		System.out.println("Digite o sal�rio atual: ");
		salarioAntigo = sc.nextDouble();
	
		if(codigo == 1) {
			System.out.println("Fun��o: Operador.");
			reajuste= salarioAntigo*0.05;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Sal�rio antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo sal�rio: " + salarioNovo);
			
		}else if(codigo==2){
			System.out.println("Fun��o: Programador.");
			reajuste= salarioAntigo*0.10;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Sal�rio antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo sal�rio: " + salarioNovo);
			
		}else if(codigo==3){
			System.out.println("Fun��o: Analista.");
			reajuste= salarioAntigo*0.15;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Sal�rio antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo sal�rio: " + salarioNovo);
			
		}else if(codigo==4){
			System.out.println("Fun��o: Gerente.");
			reajuste = salarioAntigo*0.25;
			salarioNovo = salarioAntigo+reajuste;
			
			System.out.println("Sal�rio antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo sal�rio: " + salarioNovo);
			
		}

		sc.close();
	
	}

}
