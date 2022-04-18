/**
 * 
 */
package supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 
 *
 */
public class EjemploSupplier {

	/**
	 * 
	 */
	public static void main(String[] args) {

		Supplier<Item> supplier = Item::new;
		Item item = supplier.get();
		System.out.println(item.getMsg());

		Supplier<String> supplier2 = Item::getStaticVal;
		String valor = supplier2.get();
		System.out.println("Llamada a método estático: " + valor);

		Supplier<String> supplier3 = () -> { return new String("Hola Mundo!"); };
		
		valor = supplier3.get();
		System.out.println("Obtencion de un valor nuevo: " + valor);
		
		
		  Supplier<Date> supplierFecha= () -> { return new Date(); };
		  Date fechaActual = supplierFecha.get();
		  System.out.println("fechaActual->" + fechaActual);

		

	}

}
