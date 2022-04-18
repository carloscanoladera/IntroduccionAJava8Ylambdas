package consumer;

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 
import java.util.function.Consumer; 
  
public class EjemploConsumer2 { 
    public static void main(String args[]) 
    { 
        
        Consumer<Integer> mostrar = a -> System.out.println(a); 
  
       
        mostrar.accept(10); 
  
      
        Consumer<List<Integer> > modificarLista = list -> 
        { 
            for (int i = 0; i < list.size(); i++) 
                list.set(i, 2 * list.get(i)); 
        }; 
  
    
        Consumer<List<Integer> > 
            mostrarLista = lista -> lista.stream().forEach(a -> System.out.print(a + " ")); 
  
        List<Integer> lista = new ArrayList<Integer>(); 
        lista.add(2); 
        lista.add(1); 
        lista.add(3); 
  
      
        modificarLista.accept(lista); 
  
        mostrarLista.accept(lista); 
    } 
} 
