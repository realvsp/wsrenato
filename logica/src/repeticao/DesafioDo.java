package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * O jogador ir� digitar um numero
		 * Caber� ao jogador 2 descobrir qual foi o numero digitado pelo jogador 1
		 * 
		 * Primeira miss�o:
		 * 	fazer com que a aplica��o pergunte o numero para o jogador 2 enquanto 
		 * 	ele n�o acertar o numero, e quando acertar exibir a mensagem de parab�ns
		 * 
		 * segunda miss�o 
		 * 	- ap�s o jogador 2 chutar o numero, vc deve exibir para ele uma dica, informando
		 * 	se o numero digiado pelo jogador 1 � maior ou menor que o numero que ele digitou
		 * 
		 * 
		 * terceira missao
		 * 	- quando o jogador 2 acertar, junto a mensagem de parabens dever� exibir
		 * 	quantas tentativas ele utilizou para acertar o numero
		 * 	dica ( ter� que utilizar uma vari�vel para contar)
		 * 
		 *  
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero maior");
			}
		}while(numero!=chute);

		JOptionPane.showMessageDialog
		(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)");



	}

}
