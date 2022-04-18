package function;
import java.util.Scanner;

import java.util.function.Function;


public class EjemploInterfazFuncion {
	
	public static String aMayusculas(String nombre) {
		
		return nombre.toUpperCase();
	}
	


	
    public static void main(String[] args) {
	Function <String,String> transformaNombre = (name) -> name + " Mis Apellidos";
	Function <String,String> transformaNombreCompose= transformaNombre.compose((name) -> name + " Mas Apellidos");
	
        Scanner sc = new Scanner(System.in);
        String  nombre;
        System.out.print("Introduzca un nombre: ");
        nombre = sc.nextLine();
        
        
      System.out.println("Transformar nombre:" + transformaNombre.apply(nombre));
      System.out.println("Transformar nombre and then:" + transformaNombreCompose.apply(nombre));
	
	  Function <String,String> transformaAMayusculas = EjemploInterfazFuncion::aMayusculas;
	
	  
	  Function <String,String> todoAMayusculas = 	transformaAMayusculas.compose(transformaNombreCompose);
			  
			  
	  System.out.println("Transformar todo a mayusculas: " + todoAMayusculas.apply(nombre));
    }
    
}