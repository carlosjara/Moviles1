package punto2.tarea;

/**
 * Ejemplo Tomado de : (MIEMBROS ESTATICOS DE UNA CLASE,Java 2 Curso de Programacion,Fco. Ceballos J.)
*/
class Punto{

	private double x, y;
	Punto(double cx, double cy)
	{
		x = cx; y = cy;
	}
}

public class Circulo{
   //Atributos
   private static double pi = 3.141592;
   public static int numCirculo;

   private Punto centro; //Coordenadas del centro
   private double radio; //radio del circulo

   //Metodos
   protected void msdEsNegativo(){
       	System.out.println("El radio es negativo. Se convierte a Positivo.");
   }
   
   
   public Circulo() {
	   this(1,1,5);
   }


   public Circulo(double cx, double cy, double r){ // constructor
	   centro = new Punto(cx, cy);
       if(r < 0)
       {
    	   msdEsNegativo();
    	   r = -r;
       }
       	radio = r;
       	numCirculo++;
   }

   public double longCircunferencia(){
       	return 2 * pi * radio;
   }

   public double areacirculo(){
       	return pi * radio * radio;
   }
   
   public static void main(String [] args){
	   Circulo obj1 = new Circulo();
	   System.out.println(obj1.longCircunferencia());
	   System.out.println(obj1.areacirculo());
	   
	   Circulo obj2 = new Circulo();
	   System.out.println(obj2.longCircunferencia());
	   System.out.println(obj2.areacirculo());
	   
	   System.out.println(Circulo.numCirculo);
	   
   }
   
}	
//Ejemplo Tomado de : (MIEMBROS ESTATICOS DE UNA CLASE,Java 2 Curso de Programacion,Fco. Ceballos J.)