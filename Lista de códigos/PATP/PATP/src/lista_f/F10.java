package lista_f;

import java.util.Scanner;

public class F10 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5, maior=0, menor=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");
		num1=sc.nextInt();
		System.out.println("Digite o segundo número:");
		num2=sc.nextInt();
		System.out.println("Digite o terceiro número:");
		num3=sc.nextInt();
		System.out.println("Digite o quarto número:");
		num4=sc.nextInt();
		System.out.println("Digite o quinto número:");
		num5=sc.nextInt();
		
		if(num1 > num2 && num2 > num3 && num3 > num4 && num4 > num5){
			maior= num1;
			if(num2< num3 && num2< num4 && num2<num5){
				menor= num2;
			}else if(num3< num2 && num3< num4 && num3<num5){
				menor=num3;
			}else if(num4< num2 && num4< num3 && num4<num5){
				menor=num4;
			}else if(num5< num3 && num5< num4 && num5<num2){
				menor=num5;
			}
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			
		}
		
		if(num2>num1 && num2>num3 && num2>num4 && num2>num5){
			maior= num2;
			if(num1< num3 && num1< num4 && num1<num5){
				menor= num1;
			}else if(num3< num2 && num3< num4 && num3<num5){
				menor=num3;
			}else if(num4< num2 && num4< num3 && num4<num5){
				menor=num4;
			}else if(num5< num3 && num5< num4 && num5<num2){
				menor=num5;
			}
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			
		}
		
		if(num3>num2 && num3>num1 && num3>num4 && num3>num5){
			maior= num3;
			if(num2< num1 && num2< num4 && num2<num5){
				menor= num2;
			}else if(num1< num2 && num1< num4 && num1<num5){
				menor=num1;
			}else if(num4< num2 && num4< num1 && num4<num5){
				menor=num4;
			}else if(num5< num1 && num5< num4 && num5<num2){
				menor=num5;
			}
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			
		}
		if(num4>num2 && num4>num3 && num4>num1 && num4>num5){
			maior= num4;
			if(num2< num3 && num2< num1 && num2<num5){
				menor= num2;
			}else if(num3< num2 && num3< num1 && num3<num5){
				menor=num3;
			}else if(num1< num2 && num1< num3 && num1<num5){
				menor=num1;
			}else if(num5< num3 && num5< num1 && num5<num2){
				menor=num5;
			}
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			
		}
		if(num5>num2 && num5>num3 && num5>num4 && num5>num1){
			maior= num5;
			if(num2< num3 && num2< num4 && num2<num1){
				menor= num2;
			}else if(num3< num2 && num3< num4 && num3<num1){
				menor=num3;
			}else if(num4< num2 && num4< num3 && num4<num1){
				menor=num4;
			}else if(num1< num3 && num1< num4 && num1<num2){
				menor=num1;
			}
			System.out.println("Maior: "+ maior);
			System.out.println("Menor: "+ menor);
			
		}
		
     sc.close();
     
	}

}
