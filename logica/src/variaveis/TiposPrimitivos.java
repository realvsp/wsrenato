package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
	
		/*
		 * TIPOS PRIMITIVOS: s�o tipos que est�o dentro da linguagem
		 * 
		 * boolean = tipo l�gico (true/false) utilizar somente em que a resposta ser� sempre sim ou n�o ( cliente ativo ??)
		 * char = 1 caracter (usa como separador ap�strofos) 'a' (char) diferente de "a" (String)
		 * byte = -128 / +127
		 * short = 32 mil / + 32 mil
		 * int = - 2 trilh�es / + 2 trilh�es
		 * long = 9 quintilh�es
		 * float 
		 * double = possui o dobro de precis�o em rela��o ao float.
		 *  
		 *  
		 *  Classes Wrapers ( classes que servem para apoiar os tipos primitivos
		 *  
		 *  int => Integer
		 *  float - > Float
		 *  boolean -> Boolean
		 *  double -> Double
		 *  
		 *  
		 */
		
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = (float) (salario * 0.08); // ocorre o casting
		int numero = 5;
		byte result = (byte) (numero +2) ; // ocorre o casting
		
		
		
		
	}
	
}