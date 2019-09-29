package variables;

public class Operacion {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1=10;
		int numero2=330;
		int numero3=190;
		
		int suma=numero1 + numero2;
		
		System.out.println(suma);
		
		int resta=numero1 + numero2 - numero3;
		
		System.out.println(resta);
		resta++;
		System.out.println(resta);
		resta-= 100;
		System.out.println(resta);
		
		int num1=50;
		int num2=40;
		double divi =  (double)num1/(double)num2;
		System.out.println(divi);
		
		boolean a=num1 < num2 && num2 < num1;
		System.out.println(a);
		
		//OPERADOR TERNARIO
		// expresion1 ? expresion2 : expresion3
		//si expresion 1 = true entonces expresion 2
		//si expresion 1 = false entonces expresion 3
		
		String mensaje = 55>10 ? "es mayor" : "es menor";
		
		System.out.println(mensaje);
			
		
		String mensaje2= new String("Textooo");
				
				int cantidadCaracteres= mensaje2.length();
				System.out.println(cantidadCaracteres);
				
				boolean contiene= mensaje2.contains("oo");
				System.out.println(contiene);
				
				boolean empieza= mensaje2.startsWith("T");
				System.out.println(empieza);
				
				boolean finaliza= mensaje2.endsWith("ox");
				System.out.println(finaliza);
				
				String nuevoString= mensaje.concat("estamos en el curso de java");
				System.out.println(nuevoString);

				
				System.out.println(nuevoString.toUpperCase());
				System.out.println(nuevoString.toLowerCase());
				
				System.out.println(nuevoString.trim());
				
				 float valor = 100.8f;
				
				//String mensaje3= String.format("%.2f", valor, null)	
				 //System.out.printf("%.2f", valor);
				
				
				
				
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
