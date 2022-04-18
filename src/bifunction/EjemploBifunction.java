package bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class EjemploBifunction {
	
	
	public static void main(String[] args) {
		
	String cadena1, cadena2;
	
	
	Scanner miScanner = new Scanner(System.in);  
	
	
    System.out.println("Escriba una cadena");
    cadena1 = miScanner.nextLine();
    
    System.out.println("Escriba otra cadena");
    cadena2 = miScanner.nextLine();
    
    

    BiFunction<String,String,String> bifuncion = (cad1,cad2)-> cad1+cad2;
    
    
    System.out.println("Concatenamos las dos cadenas con una bifuncion: " + bifuncion.apply(cadena1, cadena2));
    
    
}

	
}