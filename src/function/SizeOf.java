package function;

import java.util.function.Function;

public class SizeOf implements Function<String,Integer>{
	    public Integer apply(String s){
	        return s.length();
	    }
	    
	    
	    public static void main(String[] args) { 
	    
	    SizeOf	sizeOf = new SizeOf();
	    	
	    Integer r1 = sizeOf.apply("hola java 8");
	    
	    System.out.println(" Tamaño cadena " + r1.toString());
	 
	    Integer r2 = new SizeOf().apply("hola java 9 10 11 y 12");
	    System.out.println(" TamaÃ±o cadena " + r2.toString());
	    	 
	    }
	    
	}

