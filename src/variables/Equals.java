package variables;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena1="hola ";
		String cadena2="hola";
		String cadena3="Hola";
		
		boolean resultado = cadena2.equals(cadena1);
		
		System.out.println(resultado);
		
		boolean resultado2 = cadena2.equals(cadena1.trim());
		
		System.out.println(resultado2);
        
		
		boolean resultado3 = cadena2.toUpperCase().equals(cadena3.toUpperCase());
		
		System.out.println(resultado3);
	}

}
