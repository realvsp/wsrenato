package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		/*1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		/ 	A taxa de servi�os � de: 
		/   R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
		/	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
		/	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		/ Monte uma aplica��o que apresente a conta do cliente
		*/

		String cliente = JOptionPane.showInputDialog("Cliente: ");
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qual o numero de diarias "));

		double diaria1 = 5.50;
		double diaria2 = 6.00;
		double diaria3 = 8.00;

		if(diarias <15) {
			System.out.println("O valor de sua conta � R$ " + (diarias*8.00));
		}
		else if(diarias =15) {
			System.out.println("O valor de sua conta � R$ " + (diarias*6.00));
		}
		else {
			System.out.println("O valor de sua conta � R$ " + (diarias*5.50));
		}



		System.out.println(" Nome do Aluno.......: " + aluno);
		System.out.println(" Disciplina   .......: " + disciplina);
		System.out.println(" Media das notas.......: " + media);
	}

}





