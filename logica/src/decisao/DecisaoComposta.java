package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		/*
		 * 
		 */

		String aluno = JOptionPane.showInputDialog("Aluno: ");
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota um: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota dois: "));
		float media = (nota1+nota2)/2;
		
		if(media>=6) {
			System.out.println("Voce foi aprovado na discplina :  " + disciplina);
		}
		
		else if(media<4) {
				System.out.println("Voce foi reprovado na disciplina:  " + disciplina);
		}
		
		else {
			System.out.println("Voce foi tem chance no exame em:  " + disciplina);
		}
	
	
			
		System.out.println(" Nome do Aluno.......: " + aluno);
		System.out.println(" Disciplina   .......: " + disciplina);
		System.out.println(" Media das notas.......: " + media);
		}
	
}





