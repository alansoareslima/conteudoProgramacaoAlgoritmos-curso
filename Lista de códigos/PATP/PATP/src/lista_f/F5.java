package lista_f;

import java.util.Scanner;

public class F5 {

	public static void main(String[] args) {
		/*) Desenvolva um programa para calcular o reajuste salarial dos funcionários de um empresa. 
			O programa deverá solicitar a leitura do código e o salário atual do funcionário e realizar o reajuste 
			salarial de acordo com a tabela abaixo. O programa deverá apresentar os seguintes valores: salário 
			antigo, salário novo e reajuste.
			Código Percentual
				1 	5%
				2 	10%
				3 	15%
				4 	20%
				5 	25%
				6 	30%1
			Lembrete: Fórmulas para o cálculo do reajuste salarial
			REAJUSTE:= (SALARIO_ATUAL / 100) * PERCENTUAL;
			SALARIO_NOVO:= SALARIO_ATUAL + REAJUSTE;

		 */
		
		double salario, codigo, salarioNovo, reajuste;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		salario=sc.nextDouble();
		
		System.out.println("Digite o código: ");
		codigo=sc.nextDouble();
		
		if(codigo == 1) {
			reajuste= salario * 0.05;
			salarioNovo= salario + reajuste;
			
			System.out.println("Salário antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário::" + salarioNovo);
			
		}else if(codigo == 2) {
			reajuste = salario * 0.1;
			salarioNovo = salario + reajuste;
			
			System.out.println("Salário antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo == 3) {
			reajuste = salario * 0.15;
			salarioNovo = salario + reajuste;
			
			System.out.println("Salario antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo == 4) {
			reajuste= salario * 0.2;
			salarioNovo= salario+ reajuste;
			
			System.out.println("Salário antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo == 5) {
			reajuste = salario * 0.25;
			salarioNovo = salario+ reajuste;
			
			System.out.println("Salário antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}else if(codigo == 6) {
			reajuste = salario * 0.3;
			salarioNovo = salario + reajuste;
			
			System.out.println("Salário antigo: " + salario);
			System.out.println("Valor do reajuste: " + reajuste);
			System.out.println("Novo salário: " + salarioNovo);
			
		}

              sc.close();

	}

}
