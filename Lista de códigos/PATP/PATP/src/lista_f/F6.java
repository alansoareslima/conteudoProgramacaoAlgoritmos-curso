package lista_f;

import java.util.Scanner;

public class F6 {

	public static void main(String[] args) {
		/* Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa de 
			desenvolvimento de softwares. O programa deverá solicitar a leitura do código e o salário atual do 
			funcionário e realizar o reajuste salarial de acordo com a tabela abaixo. O programa deverá 
			apresentar o salário antigo, o novo salário, o valor do reajuste e a função do funcionário.
			Código 	Função 	Percentual
			1 		Operador 	5%
			2 		Programador 10%
			3 		Analista 	15%
			4 		Gerente 	25%
		 */
		
		double codigo, salarioAntigo, salarioNovo, reajuste;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o código: ");
		codigo=sc.nextDouble();
		System.out.println("Digite o salário atual: ");
		salarioAntigo = sc.nextDouble();
	
		if(codigo == 1) {
			System.out.println("Função: Operador.");
			reajuste= salarioAntigo*0.05;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Salário antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo==2){
			System.out.println("Função: Programador.");
			reajuste= salarioAntigo*0.10;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Salário antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo==3){
			System.out.println("Função: Analista.");
			reajuste= salarioAntigo*0.15;
			salarioNovo= salarioAntigo+reajuste;
			System.out.println("Salário antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo==4){
			System.out.println("Função: Gerente.");
			reajuste = salarioAntigo*0.25;
			salarioNovo = salarioAntigo+reajuste;
			
			System.out.println("Salário antigo: " + salarioAntigo);
			System.out.println("Reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}

		sc.close();
	
	}

}
