package matriz;

import java.util.Scanner;

public class MatrizBi {

	public static void main(String[] args) {

		int qtd, aprovados = 0, reprovados = 0, somaNota = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos: ");
		qtd = sc.nextInt();
		
		int matriz[][] = new int[qtd][4];
		
		for (int aluno=0; aluno<qtd; aluno++ ){
			for ( int nota = 0;  nota<4; nota++){
				System.out.print("Digite o valor da "+ (nota+1)+ "º nota do " + (aluno+1)+ "º aluno: ");
				matriz [aluno] [nota]= sc.nextInt();
				somaNota = somaNota + matriz [aluno] [nota];
				
			}
			 media = somaNota/4;
			 
			 if(media>=6){
				 System.out.println("Aprovado!");
				 somaNota = 0;
				 aprovados = aprovados + 1;
			 } else{
				 System.out.println("Reprovado!");
				 somaNota = 0;
				 reprovados = reprovados + 1;
			 }
		}
		
		System.out.println("Quantidade de alunos aprovados: " + aprovados);
		System.out.println("Quantidade de alunos reprovados: " + reprovados);
			
			 sc.close();
	
		

	}

}
