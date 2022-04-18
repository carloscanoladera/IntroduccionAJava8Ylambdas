package composition;

import java.util.Scanner;
import java.util.function.Function;

public class EjemploComposicionAndThen {

	
	public static void main(String[] args) {
		
		Integer numero1;
		Scanner miScanner = new Scanner(System.in);  
		
		
	    System.out.println("Escriba un número entero");
	    numero1 = miScanner.nextInt();
	    
	 
		
		Function<Integer, Integer> multiplicar = (value) -> value * 2;
		Function<Integer, Integer> sumar      = (value) -> value + 3;
	
		Function<Integer, Integer> MultiplicarYSumar = multiplicar.andThen(sumar);
	
		Integer result1 = MultiplicarYSumar.apply(numero1);
		
		
		System.out.println("El resultado de multiplicar 3 y sumar 2 a " + numero1.toString() + " es " + result1);

	}
	
	
}
