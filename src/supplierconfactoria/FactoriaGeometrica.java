package supplierconfactoria;

import java.util.HashMap;

import java.util.function.Supplier;
public class FactoriaGeometrica {
  
  private static HashMap<String,Supplier<Figura>> mapa= new HashMap<>();
  
  static {
    
    mapa.put("Rectangulo", Rectangulo::new);
    mapa.put("Circulo", Circulo::new);
    
  }
  
  public static Figura crearFigura(String tipo) {
    
      if (mapa.get(tipo)!=null) {
        
        return mapa.get(tipo).get();
      }else {
        return null;
      }
    
  }
}
