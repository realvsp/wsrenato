package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {
	
	public static void main(String[] args) {
		
		/*
		 * Capturar: nome de um produto, o valor de compra, e quantidade.
		 * Sobre o valor de compra considerar um lucro de 20 % para obter o valor de venda
		 * Calcular o total considerando o valor de venda e quantidade
		 * Sobre o valor total calcular 22% de impostos 
		 * No final exibir: 
		 * O nome do Produto
		 * O valor de venda
		 * O total sem impostos
		 *
		 */
		
		
		String nome_do_produto = JOptionPane.showInputDialog("Produto: ");
		double valor_de_compra = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de compra: "));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de itens: "));
		
		double valor_de_venda = (valor_de_compra * 1.20 );
		double total_da_venda = (valor_de_venda * quantidade);
		double imposto_arrecadado = (total_da_venda * 0.22);
		double valor_final_com_impostos = (total_da_venda * 1.22);
		
		System.out.println("Produto ................: "  + nome_do_produto);
		System.out.println("quantidade..............: "  + quantidade);
		System.out.println("Valor da Unidade........: "  + valor_de_venda);
		System.out.println("Total (sem Impostos )...: "  + (valor_final_com_impostos-imposto_arrecadado));
		System.out.println("Imposto Recolhido.......: "  + imposto_arrecadado);
		System.out.println("Valor Total de Venda....: "  + valor_final_com_impostos);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
