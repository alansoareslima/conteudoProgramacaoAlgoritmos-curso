package lista_f;

import java.util.Scanner;

public class F4 {

	public static void main(String[] args) {
		/* Desenvolva um programa para ler quatro valores referentes a quatro notas escolares de um 
aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for 
maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com o 
valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma 
mensagem dizendo que o aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma 
mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do 
aluno, para qualquer condição
		 */
		
		double nota1, nota2, nota3, nota4, media, exame, novaMedia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1=sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2=sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3=sc.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		nota4=sc.nextInt();
		
		media = (nota1+nota2+nota3+nota4) / 4;
			
			
		if(media >= 7) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado.");
		}else {
			System.out.println("Média: " + media);
			System.out.println("Média menor do que 7, digite a nota de exame: ");
			exame = sc.nextDouble();
			novaMedia = media + exame;
			System.out.println("A nova media é " + novaMedia);
			if(novaMedia >= 5) {
				System.out.println("Aluno aprovado em exame.");
			}else {
				System.out.println("Aluno reprovado, mesmo utilizando exame.");
			}
		}
				
				
		sc.close();
		
	}

}
