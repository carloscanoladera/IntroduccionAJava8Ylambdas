package predicate;

import java.util.List;
import java.util.function.Predicate;

 class MayorQueCinco<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {

        Integer five = 5;

        return v > five;
    }
}




public class EjemploPredicate1 {
   


  
  public static void main(String[] args) {

    	        List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

    	        MayorQueCinco<Integer> mqc = new MayorQueCinco<>();
    	        nums.stream().filter(mqc).forEach (System.out::println);
    	        
    	        
    	        System.out.println("Mayor que cinco");
		Predicate <Integer> mqn = (i) -> i<9;
		
		Predicate <Integer> mAnd= mqn.and(mqc);
		System.out.println("Mayor que 5 y menor que nueve");
		nums.stream().filter(mAnd).forEach (System.out::println);
		
	    }
	    	    
    	    
    	    
    	
}
