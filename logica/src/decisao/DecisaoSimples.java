package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		/*
		 * Capturar 
		 * - Nome da disciplina
		 * - primeira nota
		 * - segunda nota
		 * - calcular media
		 * - exibir media
		 * 	
		 * && => and 
		 * || => or
		 * 
		 * 
		 * "Voce foi reprovado => media menor que 4
		 * "Voce tem chance no exame => media entre 5.9 e 4 
		 */

		String aluno = JOptionPane.showInputDialog("Aluno: ");
		String disciplina = JOptionPane.showInputDialog("Disciplina: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota um: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Qual o nota dois: "));
		float media = (nota1+nota2)/2;
		
		if(media<4) {
				System.out.println("Voce foi reprovado na disciplina:  " + disciplina);}
		
		if (media <6 && media>4) {
			System.out.println("Voce foi tem chance no exame em:  " + disciplina);}
	
	
			
		System.out.println(" Nome do Aluno.......: " + aluno);
		System.out.println(" Disciplina   .......: " + disciplina);
		System.out.println(" Media das notas.......: " + media);
		}
	
}





