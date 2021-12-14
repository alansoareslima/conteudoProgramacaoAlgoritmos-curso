package matriz;

import javax.swing.JOptionPane;

public class Vetor1 {

	public static void main(String[] args) {

		float mediaCom = 0, mediaSem = 0, totSemExame = 0, totComExame = 0;
		float totPorApro = 0, totPorRepro = 0, totPorAproExame = 0, totPorReproExame = 0;
		float notas[] = new float[8];
		int totAlunos = 0, totApr = 0, totRep = 0, totAprEx = 0, totRepEx = 0, totExame = 0, resp, totMedia = 0;
		String opcoes[] = {"Novo aluno", "Sair"};
		
		resp = JOptionPane.showOptionDialog(null, "OPÇÕES", "MENU", 0,
			    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		while(resp!=1){
			totAlunos++;
			for (int i = 0; i < 4; i++) {
				notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, (i+1) + "ª nota", "NOTAS", JOptionPane.QUESTION_MESSAGE));
				notas[4] = notas[i] + notas[4];
			}
			
			notas[5] = (notas[4]/4);
			
			if(notas[5]>= 7){
				JOptionPane.showMessageDialog(null, "APROVADO DIRETO.\nMédia do aluno: " + notas[5],
						"RELATÓRIO", JOptionPane.PLAIN_MESSAGE);
				totApr++;
				totMedia++;
				mediaSem = (notas[5] + mediaSem);
			}else if(notas[5]< 5){
				JOptionPane.showMessageDialog(null, "REPROVADO DIRETO.\nMédia do aluno: " + notas[5],
						"RELATÓRIO", JOptionPane.WARNING_MESSAGE);
				totRep++;
				totMedia++;
				mediaSem = (notas[5] + mediaSem);
			}else{
				JOptionPane.showMessageDialog(null, "ALUNO EM EXAME !!!\nMédia: " + notas[5],
						"EXAME", JOptionPane.WARNING_MESSAGE);
				notas[6] = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota EXAME", "EXAME", JOptionPane.QUESTION_MESSAGE));
				notas[7] = (notas[5] + notas[6])/2;
				if(notas[7]>=5){
					JOptionPane.showMessageDialog(null, "Aluno APROVADO em EXAME." +"\nMédia: " + notas[7],
							"RELATÓRIO", JOptionPane.PLAIN_MESSAGE);
					totAprEx++;
					totExame++;
				}else{
					JOptionPane.showMessageDialog(null, "Aluno REPROVADO em EXAME." +"\nMédia: " + notas[7],
							"RELATÓRIO", JOptionPane.WARNING_MESSAGE);
					totRepEx++;
					totExame++;
				}
			}
			mediaCom = (notas[7] + mediaCom);
			
			notas[4] = 0;
			
			System.out.println(mediaSem);
			
			resp = JOptionPane.showOptionDialog(null, "OPÇÕES", "MENU", 0, JOptionPane.QUESTION_MESSAGE, null,
					opcoes, opcoes[0]);
		}
		totPorApro = (totApr * 100)/totAlunos;
		totPorRepro = (totRep * 100)/totAlunos;
		totPorAproExame = (totAprEx * 100)/totAlunos;
		totPorReproExame = (totRepEx * 100)/totAlunos;
		totSemExame = (mediaSem/totMedia);
		totComExame = (mediaCom/totExame);
		
		JOptionPane.showMessageDialog(null, "TOTAL DE ALUNOS: " + totAlunos +
				"\nALUNOS APROVADOS: " + totPorApro + "%" +
				"\nALUNOS REPROVADOS: " + totPorRepro + "%" +
				"\nALUNOS APROVADOS em EXAME: " + totPorAproExame + "%" +
				"\nALUNOS REPROVADOS em EXAME: " + totPorReproExame + "%" +
				"\nMÉDIA GERAL SEM EXAME: " + totSemExame +
				"\nMÉDIA GERAL COM EXAME: " + totComExame);
	}
		

}
