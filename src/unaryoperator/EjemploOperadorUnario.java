package unaryoperator;

import java.util.function.UnaryOperator;
import java.util.Scanner;
import java.util.function.Function;

public class EjemploOperadorUnario {

	
		   public static void main(String[] args) {
			   
			   Double numero1;
				Scanner miScanner = new Scanner(System.in);  
				
				
			    System.out.println("Escriba un número decimal");
			    numero1 = miScanner.nextDouble(); 
			   
		      UnaryOperator<Double> operator1 = i -> Math.sqrt(i)+7;
		      UnaryOperator<Double> operator2 = i -> i*7 +2;		      
		      UnaryOperator<String> doblar = i -> i + " " + i;
		      
		      // Using andThen() method
		      Double a = operator1.andThen(operator2).apply(5.2);
		      System.out.println(a);
		      Double b = operator1.compose(operator2).apply(5.3);
		      
		      	      
		      System.out.println(b);
		      
		      
		      String s = doblar.apply("Doblo la cadena");
		       System.out.println(s);	  
		    		  
		   }
	
	
}
