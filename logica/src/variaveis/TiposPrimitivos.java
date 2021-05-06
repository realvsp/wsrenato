package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
	
		/*
		 * TIPOS PRIMITIVOS: são tipos que estão dentro da linguagem
		 * 
		 * boolean = tipo lógico (true/false) utilizar somente em que a resposta será sempre sim ou não ( cliente ativo ??)
		 * char = 1 caracter (usa como separador apóstrofos) 'a' (char) diferente de "a" (String)
		 * byte = -128 / +127
		 * short = 32 mil / + 32 mil
		 * int = - 2 trilhões / + 2 trilhões
		 * long = 9 quintilhões
		 * float 
		 * double = possui o dobro de precisão em relação ao float.
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