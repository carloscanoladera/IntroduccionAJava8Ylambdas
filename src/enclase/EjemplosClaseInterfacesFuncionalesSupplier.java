package enclase;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EjemplosClaseInterfacesFuncionalesSupplier {
	
	
	
	
		public static Integer getValor() {
			return  new Random().nextInt(3)+4;
			
			
			
		}
	
	
	
	  public static void main(String[] args) {
		  
		  
		 
		 Supplier<Integer> supplier = () -> new Random().nextInt(3);
		  
		 Supplier<Integer> supplier2 = EjemplosClaseInterfacesFuncionalesSupplier::getValor;
		  
		 
		  
		  
		  
	  }

}
