package supplier;
import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;


public class SupplierString2 { 
	
    public static void main(String args[]) 
    { 
  
	        // This function returns a random value. 
	    	Supplier<String> supplier3 = () -> { return new String("Hola Mundo!"); };
			
			String valor = supplier3.get();
			System.out.println("Obtención de un valor nuevo: " + valor);
		
		
		  Supplier<Date> supplierFecha= () -> { return new Date(); };
		  Date fechaActual = supplierFecha.get();
		  System.out.println("fechaActual->" + fechaActual);




    } 
 

}