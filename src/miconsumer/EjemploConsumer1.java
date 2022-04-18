package miconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjemploConsumer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		Consumer<Integer> consumer = i -> System.out.println("Consumer normal "+i*i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.println("Consumer With and Then: (hemos imprimido el cuadrado de:" + i + ")"));
		consumer.accept(6);
		//Usando expresiones lambda
		consumerWithAndThen.accept(7);
		
		
		Consumer<Integer> consumer3 = new Consumer<Integer> () {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
				System.out.println("Consumer normal "+t*t);
				
			}
			
			
			
		};

	}

}

