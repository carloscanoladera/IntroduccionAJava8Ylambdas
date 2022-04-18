package enclase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicate.Persona;

public class EjemplosClaseInterfacesFuncionalesPredicate {
	
	private static boolean EsMayor(Integer edad) {
		
		return edad>18;
	}
	
	
	private static void imprimirSiEsMayorDeEdad(Integer edad, Predicate<Integer> funcionEdad) {
		
		if (funcionEdad.test(edad))
			
			
			System.out.println("La persona es mayor de edad con edad: " + edad);
		 else 
			
			System.out.println("La persona es menor de edad con edad: " + edad);
		
	}
	
	private static void imprimirSiEmpiezaPorA(String nombre, Predicate<String> funcionNombre) {
		
		
	}
	
	
	private static void imprimirSiPuedeTrabajar(Persona persona, Predicate<Persona> funcionEdad) {
	
		if (funcionEdad.test(persona)) 
			
			System.out.println("La persona puede trabajar: " + persona);
			
			else 
				
				System.out.println("La persona no puede trabajar: " + persona);
			
		}
		

	
	  public static void main(String[] args) {
		  
		  List<Persona> listaPersonas = new ArrayList<Persona>();
		  Predicate<Integer> adultoEuropa = (i)-> i>18;
		  Predicate<Integer> adultoUSA = (i)-> i>21;
		  Predicate<String> ejemploNombre = (n)-> n.startsWith("A");
		  Predicate<Integer> adultoEuropa2 = 
				  EjemplosClaseInterfacesFuncionalesPredicate::EsMayor;
		  
		  if (adultoEuropa.test(20)) 
			  System.out.println("La persona es adulta");
		  
		  if (ejemploNombre.test("Antonio"))			  
			  System.out.println("El nombre de la persona empieza por A");
		  
		  if (adultoEuropa2.test(20)) {
			  
			  System.out.println("La persona es adulta");
		  }
		  
		  
		  imprimirSiEsMayorDeEdad(20,adultoEuropa2);
		  imprimirSiEsMayorDeEdad(20,EjemplosClaseInterfacesFuncionalesPredicate::EsMayor);
		  imprimirSiEsMayorDeEdad(20,adultoUSA);
		  
		  
			listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
			listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1981, 2, 3)));
			listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1972, 3, 4)));
			listaPersonas.add(new Persona("45678901D", "Mar�a", "López", LocalDate.of(1993, 4, 5)));

		  Persona Ana = new Persona("34567890C", "Ana", "Ramirez", LocalDate.of(1972, 3, 4));
		  
		  Predicate<Persona> adultoPersonaEuropa = (p)->p.getEdad()>18;
		  Predicate<Persona> personaEdadTrabajar = adultoPersonaEuropa.and((p)->p.getEdad()<65);
		  
		  imprimirSiPuedeTrabajar(Ana,personaEdadTrabajar);
		  
		  listaPersonas.parallelStream().filter(personaEdadTrabajar).forEach(System.out::println);
		  
		  
	  }

}
