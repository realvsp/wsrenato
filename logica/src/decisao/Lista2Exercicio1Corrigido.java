package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1Corrigido {

	public static void main(String[] args) {
		
		/*1. Um hotel cobra R$ 80,00 a di?ria e mais uma taxa de servi?os. 
		/ 	A taxa de servi?os ? de: 
		/   R$ 5,50 por di?ria, se o n?mero de di?rias for maior que 15; 
		/	R$ 6,00 por di?ria, se o n?mero de di?rias for igual a 15; 
		/	R$ 8,00 por di?ria, se o n?mero de di?rias for menor que 15.
		/ Monte uma aplica??o que apresente a conta do cliente
		*/

		short diarias = Short.parseShort(JOptionPane.showInputDialog("Qual o numero de diarias "));
		float taxa = (float) 5.5;
		
		if (diarias==15) {
			taxa = 6;
		} else if (diarias<15) {
			taxa =8 ;
		}
		
		
			System.out.println("Total ? R$ " + ((80 + taxa) * diarias));
		}
	
	
}
	





