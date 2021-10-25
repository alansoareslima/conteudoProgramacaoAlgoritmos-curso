package lista_f;

import java.util.Scanner;

public class F8 {

	public static void main(String[] args) {
		/*  Desenvolva um programa para efetuar a leitura de três valores (A, B e C) e apresentar os 
			valores dispostos em ordem crescente.
		*/
		
		double a, b, c, maior, intermediario=0, menor=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor do a:");
		a=sc.nextDouble();
		System.out.println("digite o valor de b:");
		b=sc.nextDouble();
		System.out.println("digite o valor de c:");
		c=sc.nextDouble();
		
		if(a > b && a > c) {
		     maior = a;
		     if(b > c) {
		    	 intermediario=b;
		    	 menor=c;
		     }else if(c>b) {
		    	 intermediario=c;
		    	 menor=b;
		     }
		     System.out.println("Menor: " + menor);
		     System.out.println("Intermediário: " + intermediario);
		     System.out.println("Maior: " + maior);
		}
		
		if(b > a && b > c) {
			maior=b;
			if(a > c) {
				intermediario=a;
				menor=c;
			}else if(c>a){
				intermediario=c;
				menor=a;
			}
			 System.out.println("Menor: " + menor);
		     System.out.println("Intermediário: " + intermediario);
		     System.out.println("Maior: " + maior);
		}
		
		if(c > a && c > b) {
			maior=c;
			if(a > b) {
				intermediario=a;
				menor=b;
			}else if(b > a) {
				intermediario=b;
				menor=a;
			}
			 System.out.println("Menor: " + menor);
		     System.out.println("Intermediário: " + intermediario);
		     System.out.println("Maior: " + maior);
		}

		sc.close();
		
	}

}
