package variaveis;

import javax.swing.JOptionPane;

/*
 * Caracter�sticas do Java
 * - OO
 * - M�dio n�vel
 * - Arquitetuta h�brida * 
 */
public class TiposDados {

	// main � o m�todo start point de uma aplic Java
	// todo m�todo vem seguido de parenteses, e sempre dentro de classes

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
		 * - num�rico: � o dado que PODE ser usado em express�es matem�ticas
		 * e/ou for um dado cr�tico para o cen�rio ao qual se prop�e.
		 * CEP (diante do contexto do Correios) : 00010-009 => 1
		 * Telefone (do cliente delivery da pizzaria)
		 * 
		 * Em Javanes
		 * - int	=> somente para numeros inteiros (tipos primitivos, por isso come�am com min�sculo)
		 * - double => para numeros com casas decimais (numeros reais)
		 * 
		 * 
		 * - Alfanum�rico: � o dado que n�o est� envolvido em express�es matem�ticas
		 * CEP (do colaborador do Itau para o RH) : 00010-009 => 00010-009
		 * Telefone (do cliente Itau)
		 * 
		 * Javanes
		 * - String ( � uma classe tamb�m, por isso come�a com letra mai�scula )
		 * 
		 * 
		 * Sobre Identificadores (nomes que utilizamos dentro da programa��o)
		 * 
		 * Regras:
		 * 1-) N�o come�ar� com N�meros. 1berto (errado) h1berto (certo)
		 * 2-) N�o utilizar� palavras reservadas (string double, int)
		 * 3-) N�o far�s uso de caracteres especiais: N@me, d@t@, tr#a. Somente _ e $ em algumas ocasi�es, mas preferencialmente n�o usar
		 * 
		 * 
		 * Padr�es
		 *  - UML : Padr�o para OO
		 *  	- Classes: come�am com letras mai�sculas
		 *  	- Vari�veis: come�am com letas min�sculas (substantivos)
		 *  	- M�todos : Come�am com letras min�sculas (verbos) e s�o seguidos de parenteses
		 *  
		 *  - CamelCase: mai�sculas e min�sculas 
		 *  	- da segunda palavra em diante todas as palavras devem iniciar com mai�sculas
		 *  - utilize nomes significativos
		 *  
		 *  
		 *  
		 *  
		 *  
		 *  
		 * 
		 */










	} // fechando o m�todo

} // fechando a classe
