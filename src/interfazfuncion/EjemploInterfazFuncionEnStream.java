package interfazfuncion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploInterfazFuncionEnStream {
	 
    public static void main(String[] args) {
         
        List<Persona> lista=Stream.generate(Persona::new)
                .limit(100)
                .peek((p)->p.setNombre("Asisea"))
                .collect(Collectors.toList());
 
         
        for (Persona p: lista) {
             
            System.out.println(p.getNombre());
        }
         
    }
}
