package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3�) Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade 
		 * (M�dio, Superior ou P�s) enquanto a resposta for v�lida, ir� computando 
		 * os totais dos n�veis digitados, no final apresente somente o n�vel que 
		 * foi mais votado.
		 * 
		 */
		String escolaridade ="";
		byte qtdm=0;
		byte qtds=0;
		byte qtdp=0 ;


		do {
			escolaridade=JOptionPane.showInputDialog("Escolaridade: ").toUpperCase();
			if (escolaridade.equals("POS")) {
				qtdp++;
			}else if (escolaridade.equals("MEDIO")) {
				qtdm++;
			}else if (escolaridade.equals("SUPERIOR")) {
				qtds++;
			}

		}while (escolaridade.equals ("POS") ||
				escolaridade.equals ("MEDIO") || escolaridade.equals ("SUPERIOR"));

		if (qtdm>qtds && qtdm>qtdp) {
			System.out.println("M�dio: " + qtdm);
		}else if (qtds>qtdp) {
			System.out.println("Superior: " + qtds);
		}else {
			System.out.println("P�s : " + qtdp);	
		}
	}

}
 