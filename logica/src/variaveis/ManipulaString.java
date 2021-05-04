package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		
		String email = "humBeRtOfiap.COM.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase() );
		System.out.println("Maiusculo: " + email.toUpperCase() );
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem Arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Do 3.o até o 5.o:  " + email.substring(2,5));
		System.out.println("Do 3.o ao fim: " + email.toLowerCase().substring(2));
		System.out.println("Primeira metade :  " + email.substring(0, email.length()/2));
		System.out.println("Usuário :  " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Domínio :  " + email.toLowerCase().substring(email.indexOf("@")+1));
		System.out.println("Primeiro Caracter Usuário :  " + email.charAt(0));
		System.out.println("Primeiro Caracter Domínio :  " + email.charAt(email.indexOf("@")+1));
		System.out.println("É igual ?" + email.contentEquals("humBeRtO@fiap.COM.br"));
		
		
		
		/*
		 * churrs => variavel
		 * churros() => função
		 * Abc.churros() => método 
		 * Churros => classe
		 * 
		 */
		
	}
	 
	
	

}
