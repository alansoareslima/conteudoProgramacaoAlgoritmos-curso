package lista_d;

import java.util.Scanner;

public class D5 {

	public static void main(String[] args) {
		
		double a, b, c, maior = 0, intermediario = 0, menor = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor C: ");
		c = sc.nextDouble();
		
		if(a > b && a > c){
			maior = a;
			
			if(b > c){
			intermediario = b;
			menor = c;
			}
			
			if(c > b){
			intermediario = c;
			menor = b;
			}
		}
		
		if(b > c && b > a){
			maior = b;
			
			if(a > c){
				intermediario = a;
				menor = c;
			}
			
			if(c > a){
				intermediario = c;
				menor = a;
			}
		}
		
		if(c > b && c > a){
			maior = c;
			
			if(a > b){
				intermediario = a;
				menor = b;
			}
			
			if(b > a){
				intermediario = b;
				menor = a;
			}
		}
		
		System.out.println("Menor = " + menor);
		System.out.println("Intermediário = " + intermediario);
		System.out.println("Maior = " + maior);
		
		sc.close();
		
	}

}
