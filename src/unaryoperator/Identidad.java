package unaryoperator;

import java.util.function.UnaryOperator; 

public class Identidad { 
    public static void main(String args[]) 
    { 
          
        UnaryOperator<Boolean> 
            op = UnaryOperator.identity(); 
 
        System.out.println("devuelvo lo recibido como parámetro:" + op.apply(true)); 
        
        
        
    } 
}
