package lista_d;

import java.util.Scanner;

public class D9 {

	public static void main(String[] args) {
		
		double codigo, salario, salarioAjustado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo: ");
		codigo = sc.nextDouble();
		System.out.println("Digite o sal�rio atual: ");
		salario = sc.nextDouble();
		
		if(codigo == 1){
			salarioAjustado = salario - (salario*0.05);
			System.out.println("O percentual de desconto para a fun��o Operador � de 5%.");
			System.out.println("Logo, o seu sal�rio ajustado ser� de R$" + salarioAjustado);
		}
		if(codigo == 2){
			salarioAjustado = salario - (salario*0.1);
			System.out.println("O percentual de desconto para a fun��o Programador � de 10%.");
			System.out.println("Logo, o seu sal�rio ajustado ser� de R$" + salarioAjustado);
		}
		if(codigo == 3){
			salarioAjustado = salario - (salario*0.15);
			System.out.println("O percentual de desconto para a fun��o Analista � de 15%.");
			System.out.println("Logo, o seu sal�rio ajustado ser� de R$" + salarioAjustado);
		}
		
		sc.close();
	}

}
