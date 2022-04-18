package bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class EjemploBifunctionPura {
	
	
	
	
	public Supplier<Double> FuncionPuraBifunction(Supplier<Integer> num1, Supplier<Integer> num2, BiFunction<Integer, Integer, Double> funcion) {
		
		
		
		
		return (()-> funcion.apply(num1.get(),num2.get()));
	
	

    
	}
	
	public static void main(String[] args) {
	
	Integer numero1, numero2;
	
	EjemploBifunctionPura ejemplo=  new EjemploBifunctionPura();
	Scanner miScanner = new Scanner(System.in);  
	
	
    System.out.println("Escriba un número entero");
    numero1 = miScanner.nextInt();
    
    System.out.println("Escriba otro número entero");
    numero2 = miScanner.nextInt();
    
    Supplier<Double> resultado = 
    		
    		ejemplo.FuncionPuraBifunction(()->numero1, ()->numero2, (num1,num2)->Double.valueOf(num1)/Double.valueOf(num2));
    
    System.out.println("El resultado es un decimal" + resultado.get());
    
    
	}

}
