package lista_d;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		
		double codigo, salario, salarioAjustado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código: ");
		codigo = sc.nextDouble();
		System.out.println("Digite o salário atual: ");
		salario = sc.nextDouble();
		
		if(codigo == 1){
			salarioAjustado = salario - (salario*0.05);
			System.out.println("O percentual de desconto para a função Operador é de 5%.");
			System.out.println("Logo, o seu salário ajustado será de R$" + salarioAjustado);
		}
		if(codigo == 2){
			salarioAjustado = salario - (salario*0.1);
			System.out.println("O percentual de desconto para a função Programador é de 10%.");
			System.out.println("Logo, o seu salário ajustado será de R$" + salarioAjustado);
		}
		if(codigo == 3){
			salarioAjustado = salario - (salario*0.15);
			System.out.println("O percentual de desconto para a função Analista é de 15%.");
			System.out.println("Logo, o seu salário ajustado será de R$" + salarioAjustado);
		}
		
		sc.close();
	}

}
