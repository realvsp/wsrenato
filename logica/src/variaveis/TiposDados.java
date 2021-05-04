package variaveis;

import javax.swing.JOptionPane;

/*
 * Características do Java
 * - OO
 * - Médio nível
 * - Arquitetuta híbrida * 
 */
public class TiposDados {

	// main é o método start point de uma aplic Java
	// todo método vem seguido de parenteses, e sempre dentro de classes

	public static void main(String[] args) {
		// <Tipo de dado> <nome/identificador> = <valor>;
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome.. : "  + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura.: " + altura);
		System.out.println("IMC....: " + imc);
		
		



		/*
		 * Tipos de Dados:
		 * - numérico: é o dado que PODE ser usado em expressões matemáticas
		 * e/ou for um dado crítico para o cenário ao qual se propõe.
		 * CEP (diante do contexto do Correios) : 00010-009 => 1
		 * Telefone (do cliente delivery da pizzaria)
		 * 
		 * Em Javanes
		 * - int	=> somente para numeros inteiros (tipos primitivos, por isso começam com minúsculo)
		 * - double => para numeros com casas decimais (numeros reais)
		 * 
		 * 
		 * - Alfanumérico: é o dado que não está envolvido em expressões matemáticas
		 * CEP (do colaborador do Itau para o RH) : 00010-009 => 00010-009
		 * Telefone (do cliente Itau)
		 * 
		 * Javanes
		 * - String ( é uma classe também, por isso começa com letra maiúscula )
		 * 
		 * 
		 * Sobre Identificadores (nomes que utilizamos dentro da programação)
		 * 
		 * Regras:
		 * 1-) Não começará com Números. 1berto (errado) h1berto (certo)
		 * 2-) Não utilizará palavras reservadas (string double, int)
		 * 3-) Não farás uso de caracteres especiais: N@me, d@t@, tr#a. Somente _ e $ em algumas ocasiões, mas preferencialmente não usar
		 * 
		 * 
		 * Padrões
		 *  - UML : Padrão para OO
		 *  	- Classes: começam com letras maiúsculas
		 *  	- Variáveis: começam com letas minúsculas (substantivos)
		 *  	- Métodos : Começam com letras minúsculas (verbos) e são seguidos de parenteses
		 *  
		 *  - CamelCase: maiúsculas e minúsculas 
		 *  	- da segunda palavra em diante todas as palavras devem iniciar com maiúsculas
		 *  - utilize nomes significativos
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 * 
		 */










	} // fechando o método

} // fechando a classe
