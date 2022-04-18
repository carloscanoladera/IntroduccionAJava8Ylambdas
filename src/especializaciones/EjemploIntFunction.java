package especializaciones;

import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class EjemploIntFunction {
	
	
	
	
	public static void main(String[] args) {
	
		
		 
		  Scanner miScanner = new Scanner(System.in);  
		  System.out.println("Escriba un número entero");
		  int numero1 = miScanner.nextInt();
		
		IntFunction<String> convertimosIntString = (i)-> String.valueOf(i);
		
		ToIntFunction<String> convertimosStringInt = (s -> Integer.valueOf(s));
		
		IntToDoubleFunction convertimosIntADouble = (i -> Double.valueOf(i));
		
		String cadena = convertimosIntString.apply(numero1);
	
		System.out.println("Convertimos " + numero1 + " a cadena " + cadena);
		
		int numero2 = convertimosStringInt.applyAsInt(cadena);
		
		System.out.println("Convertimos cadena " + cadena + " a numero " + numero2);
		
		Double numerodecimal = convertimosIntADouble.applyAsDouble(numero1);
		
		
		System.out.println("Convertimos numero entero" + numero1 + " a numero decimal " + numerodecimal);
		
	}

}



