package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		/*
		 * O jogador irá digitar um numero
		 * Caberá ao jogador 2 descobrir qual foi o numero digitado pelo jogador 1
		 * 
		 * Primeira missão:
		 * 	fazer com que a aplicação pergunte o numero para o jogador 2 enquanto 
		 * 	ele não acertar o numero, e quando acertar exibir a mensagem de parabéns
		 * 
		 * segunda missão 
		 * 	- após o jogador 2 chutar o numero, vc deve exibir para ele uma dica, informando
		 * 	se o numero digiado pelo jogador 1 é maior ou menor que o numero que ele digitou
		 * 
		 * 
		 * terceira missao
		 * 	- quando o jogador 2 acertar, junto a mensagem de parabens deverá exibir
		 * 	quantas tentativas ele utilizou para acertar o numero
		 * 	dica ( terá que utilizar uma variável para contar)
		 * 
		 *  
		 */
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um número menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um número maior");
			}
		}while(numero!=chute);

		JOptionPane.showMessageDialog
		(null, "Parabéns você acertou com " + contador + " tentativa(s)");



	}

}
