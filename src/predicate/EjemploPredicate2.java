package predicate;

import java.util.function.Predicate;

public class EjemploPredicate2 {
	
	private static boolean EsMayor(Integer edad) {
		
		return edad>18;
	}
	
	
	private static void imprimirSiEsMayorDeEdad(Integer edad, Predicate<Integer> funcionEdad) {
		
		if (funcionEdad.test(edad))
			
			
			System.out.println("La persona es mayor de edad con edad: " + edad);
		 else 
			
			System.out.println("La persona es menor de edad con edad: " + edad);
		
	}
	
	  public static void main(String[] args) {
		  
		  
		  Predicate<Integer> adultoEuropa = (i)-> i>18;
		  Predicate<Integer> adultoUSA = (i)-> i>21;
		  Predicate<String> ejemploNombre = (n)-> n.startsWith("A");
		  Predicate<Integer> adultoEuropa2 = 
				  EjemploPredicate2::EsMayor;
		  
		  if (adultoEuropa.test(20)) 
			  System.out.println("La persona es adulta");
		  
		  if (ejemploNombre.test("Antonio"))			  
			  System.out.println("El nombre de la persona empieza por A");
		  
		  if (adultoEuropa2.test(20)) {
			  
			  System.out.println("La persona es adulta");
		  }
		  
		  
		  imprimirSiEsMayorDeEdad(20,adultoEuropa2);
		  imprimirSiEsMayorDeEdad(20,EjemploPredicate2::EsMayor);
		  imprimirSiEsMayorDeEdad(20,adultoUSA);
		  
		  
		  
		  
		  
		  
	  }

}
