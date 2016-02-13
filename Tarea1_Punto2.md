#Computación Movil y Agentes Moviles

**Carlos Jaramillo**
**Edgar Amezquita**

####2.

*Static Fields*

En muchos casos es necesario usar un atributo (Variable), de la cual se almacene una sola copia para todas las instancias de la clase, esto se conoce como varible globlal, en java se usa la palabra clave *static*. Que no son atributos especificos de un objeto sino más bien son atributos de la clase, esto quiere decir que solo una copia que comparten todos los objetos de la clase.

Igualmetne ocurre con los Metodos, cuando se crea un metodo *static*, este sera un metodo de la clase y no propio de un objeto especifico, este tipo de metodos no se ejecutan para un objeto en particular, sino que se aplican en general donde se necesiten. Una caracteristica particula de un metodo estatico es que estos no pueden acceder a los campos no-static de su clase, pero si pueden acceder a los metodos static.

Como ejemplo para un *static Field* supongamos que queremos acceder a la constante **PI** de la clase math cada vez que calculemos el area de un circulo o la longitud de una circunferencia, igualmente, que queremos conocer el numero de instancias de una clase (en este caso, la clase circulo) creados en cada instante. Para esto es mas eficiente asociar lo valores *PI* y *numCiruclos* con la clase que con cada objeto.

**Ejemplo**
```java
class Punto

{

	private double x, y;

	Punto(double cx, double cy)

	{

		x = cx; y = cy;

	}

}

public class Circulo

{

	//Atributos

	**private static double pi = 3.141592;**

	**public static in numCiruculos;**

	private Punto centro; //Coordenadas del centro

	private double radio; //radio del circulo

//Metodos

   protected void msdEsNegativo()

   {

       	System.out.println("El radio es negativo. Se convierte a Positivo.");

   }

   public Cirulo() // constructor va sin parametros

   {

      this(100.0, 100.0, 100,0);

   }

   public Ciruclo(double cx, double cy, double r) // constructor}

   {

       	centro = new Punto(cx, cy);

       if(r < 0):

       	{

      		msgEsNegativo();
       		r = -r;

       	}

       	radio = r;

       	**numCirculo++;**

   }

   public double longCircunferencia()

   {

       	__return 2 * pi * radio;__

   }

   public double areacirculo()

   {

       	__return pi * radio * radio;__

   }

}	
```
Con esto igualmente cabe mencionar que el metodo *main* es un metodo estatico.


