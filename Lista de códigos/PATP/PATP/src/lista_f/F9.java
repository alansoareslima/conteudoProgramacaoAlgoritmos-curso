package lista_f;

import java.util.Scanner;

public class F9 {

	public static void main(String[] args) {

		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		numero=sc.nextInt();
			
		if ((numero % 5 == 0) && (numero % 4 == 0 )){
			System.out.println("Esse numero � divis�vel por 5 e 4.");
		}else{
		System.out.println("Esse numero n�o � divis�vel por 5 e 4.");
	}
		
		sc.close();
		
	}

}
