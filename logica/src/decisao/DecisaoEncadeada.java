package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Solicitar as faltas
		 * Para que o aluno esteja aprovado, a qtde de faltas menor que 20 e a nota >= 6
		 * (Vale para o exame tb)
		 */

		String aluno = JOptionPane.showInputDialog("Aluno: ");
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Qual a quantidade de faltas: "));
		if (faltas<20) {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota um: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota dois: "));
			float media = (nota1+nota2)/2;
			
			if(media>=6) {
				System.out.println("Voce foi aprovado na discplina :  " + disciplina);
			}

			else if (media<4 ) {
				System.out.println("Voce foi reprovado na disciplina:  " + disciplina);
			}

			else {
				System.out.println("Voce est� de exame na disciplina :" + disciplina);
			}
		}
		
		else {
			System.out.println("Voce foi reprovado por faltas:  " + faltas);}
		
	

			System.out.println(" Nome do Aluno.......: " + aluno);
			System.out.println(" Disciplina   .......: " + disciplina);
			System.out.println(" Numero de faltas......:" + faltas);
		}

	} 





