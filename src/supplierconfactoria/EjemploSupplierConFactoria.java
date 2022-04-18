package supplierconfactoria;

public class EjemploSupplierConFactoria {

	
	
		  public static void main(String[] args) {
		    
		    Figura fRectangulo=FactoriaGeometrica.crearFigura("Rectangulo");
		    
		    Figura fCirculo=FactoriaGeometrica.crearFigura("Circulo");
		    
		    System.out.println("Area del rectangulo: " + fRectangulo.area());
		    System.out.println("Area del círculo: " + fCirculo.area());
		    
		    
		  }
		}

