package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pedir: Nome e idade
		 * De acordo com as regras para vota??o no Brasil
		 * Oriente o usu?rio se ele pode votar, se ele n?o pode votar
		 * ou se o voto ? facultativo
		 * 
		 * 
		 * 
		 */
		
		
		String eleitor = JOptionPane.showInputDialog("Eleitor: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Qual sua idade: "));
		
		if(idade<16) {
			System.out.println("Voce n?o pode votar  ");}
	
		if (idade >=16 && idade <=17  || idade>=70) {
		System.out.println("Seu voto ? facultativo  ");}
		
		if (idade >=18 && idade <=69 ) {
			System.out.println("Seu voto ? obrigat?rio ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


