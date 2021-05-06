package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3º) Crie um programa que pergunte ao usuário o seu nível de escolaridade 
		 * (Médio, Superior ou Pós) enquanto a resposta for válida, irá computando 
		 * os totais dos níveis digitados, no final apresente somente o nível que 
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
			System.out.println("Médio: " + qtdm);
		}else if (qtds>qtdp) {
			System.out.println("Superior: " + qtds);
		}else {
			System.out.println("Pós : " + qtdp);	
		}
	}

}
 