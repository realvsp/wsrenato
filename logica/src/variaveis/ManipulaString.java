package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		
		String email = "humBeRtOfiap.COM.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase() );
		System.out.println("Maiusculo: " + email.toUpperCase() );
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem Arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Do 3.o at� o 5.o:  " + email.substring(2,5));
		System.out.println("Do 3.o ao fim: " + email.toLowerCase().substring(2));
		System.out.println("Primeira metade :  " + email.substring(0, email.length()/2));
		System.out.println("Usu�rio :  " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Dom�nio :  " + email.toLowerCase().substring(email.indexOf("@")+1));
		System.out.println("Primeiro Caracter Usu�rio :  " + email.charAt(0));
		System.out.println("Primeiro Caracter Dom�nio :  " + email.charAt(email.indexOf("@")+1));
		System.out.println("� igual ?" + email.contentEquals("humBeRtO@fiap.COM.br"));
		
		
		
		/*
		 * churrs => variavel
		 * churros() => fun��o
		 * Abc.churros() => m�todo 
		 * Churros => classe
		 * 
		 */
		
	}
	 
	
	

}
