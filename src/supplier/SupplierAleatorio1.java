package supplier;
import java.util.Random;
import java.util.function.Supplier;


public class SupplierAleatorio1 { 
	
    public static void main(String args[]) 
    { 
  
        // This function returns a random value. 
        Supplier<Double> valorAleatorio = () ->Math.random(); 
        //Supplier<Double> valorAleatorioAndThen = 
                

        System.out.println(valorAleatorio.get()); 

        Supplier<Integer> supplier = () -> new Random().nextInt(3);
        
        // Print the random value using get() 
        System.out.println(supplier.get()); 



    } 
 

}