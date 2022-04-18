package interfazfuncion;

import java.util.Scanner;
import java.util.function.Function;

public class Ejemplo1InterfazFuncion {

	
    public static void main(String[] args) {
	Function <String,String> transformaNombre = (name) -> name + " Mis Apellidos";
	Function <String,String> transformaNombreAndThen= transformaNombre.compose((name) -> name + " Mas Apellidos");
	
        Scanner sc = new Scanner(System.in);
        String  nombre;
        System.out.print("Introduzca un nombre: ");
        nombre = sc.nextLine();
        
        
      System.out.println("Transformar nombre:" + transformaNombre.apply(nombre));
      System.out.println("Transformar nombre and then:" + transformaNombreAndThen.apply(nombre));
	
	
	
			
    }
  
}
