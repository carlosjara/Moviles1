#Computación Movil y Agentes Moviles

**Carlos Jaramillo**

**Edgar Amezquita**

####2.

#####__*Static Fields*__

En muchos casos es necesario usar un atributo (Variable), de la cual se almacene una sola copia para todas las instancias de la clase, esto se conoce como varible globlal, en java se usa la palabra clave *static*. Que no son atributos especificos de un objeto sino más bien son atributos de la clase, esto quiere decir que solo una copia que comparten todos los objetos de la clase.

Igualmetne ocurre con los Metodos, cuando se crea un metodo *static*, este sera un metodo de la clase y no propio de un objeto especifico, este tipo de metodos no se ejecutan para un objeto en particular, sino que se aplican en general donde se necesiten. Una caracteristica particula de un metodo estatico es que estos no pueden acceder a los campos no-static de su clase, pero si pueden acceder a los metodos static.

Como ejemplo para un *static Field* supongamos que queremos acceder a la constante **PI** de la clase math cada vez que calculemos el area de un circulo o la longitud de una circunferencia, igualmente, que queremos conocer el numero de instancias de una clase (en este caso, la clase circulo) creados en cada instante. Para esto es mas eficiente asociar lo valores *PI* y *numCiruclos* con la clase que con cada objeto.

**Ejemplo** (*Static Fields*)
```java
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
   public static in numCiruculos;

   private Punto centro; //Coordenadas del centro
   private double radio; //radio del circulo

   //Metodos
   protected void msdEsNegativo(){
       	System.out.println("El radio es negativo. Se convierte a Positivo.");
   }

   public Cirulo() // constructor va sin parametros{
      this(100.0, 100.0, 100,0);
   }

   public Ciruclo(double cx, double cy, double r){ // constructor
        	centro = new Punto(cx, cy);
        	if(r < 0):
       	{
      		msgEsNegativo();
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
}	
```
Con esto igualmente cabe mencionar que el metodo *main* es un metodo estatico.

* * *


#####__*Abstract Class*__

Viendo la jerarquia que puede ocurrir entre clases, podemos decir que una clase es mas especializada si esta mas lejos de la clase raiz, pero es mas generica si esta cerca a la raiz. (Ej. clase **Object**).

Una clase Abstracta, es una clase generica que tan solo define los atributos y el comportamiento mas comun de las clases que le hereden, haciendo que estos los declaren.

De una clase Abstracta es casi seguro que no se creen instancias, su razon de existencia es proporcionar atributos y comportamiento que seran compartidos por sus subclases.

Una clase Abstracta puede contener los mismos tipos de miembros que una clase No Abstracta y ademas puede contener metodos abstractos, que una clase No Abstracta no puede contener, pero no se permite crear instancias de ella.

En el caso de los metodos Abstractos no poseen cuerpo puesto que la idea es que sean redefinidos por las subclases de la clase abstracta, para que estos se adapten a las particularidades de los mas especificos.

__Ejemplo__ (*Abstract Class*)

```java
abstract class vehicle{
    vehicle(){
        System.out.println("--Vehicle is created--");
    }
    abstract void run();    
}

class Bike extends vehicle{
    void run(){
        System.out.println("--BIKE-- Running Safely...");
    }
}

class Car extends vehicle{
    void run(){
        System.out.println("--CAR-- Running Safely...");
    }
}

class TestAbstraction1{
    public static void main(String args[]){
        Car car1 = new Car();
        Bike bike1 = new Bike();
        
        car1.run();
        bike1.run();  
    }  
} 

```

```java
Output:
    --Vehicle is created--
    --Vehicle is created--
    
    --CAR-- Running Safely...
    --BIKE-- Running Safely...
```
* * *
####__*Interface*__

Para sistemas que contienen objetos  inconexos se definen las interfaces en donde este sirve de conexion entre estas objetos. Las interfaces definen un conjunto de mensajes que se pueden aplicar a muchas clases de objetos, a lo qeu cada una de ellas debe responder de forma adecuada. 

Las clases tambien pueden recibir el nombre de **Protocolo**, todos los metodos declarados en una interfaz son *public* y *abstract* (implicitamente), y todos su constantes son *public*, *final* y *static*.

Cualquier clase puede acceder a las constantes de una interfaz, a traves del nombre de la misma. Pero si una clase la implementa puede acceder a las constantes, como si las hubiese heredado, es decir, directamente con su nombre.

Si una `clase implementa (*implements*) una interfaz debe declarar **TODOS** los metodos definidos` en la ultima. Al implementar una interfaz, todas las subclases heredan los metodos y constantes de la interfaz.

En otras palablas, una interfaz puede utilizarse para:
- Capturar similitudes entre clases no relacionadas sin forzar a una relacion artificial entre ellas.

- Declarar metodos que una o mas clases deben implementar en determinadas situaciones.

__Ejemplo__ (*interface*)

```java
/* File name: Animal.java */
interface Animal {
	public void eat();
	public void travel();
}
```
```java
/* File name: mammal.java */

public class Mammal implements Animal{
	
	public Mammal{ // Construct
		System.out.println("Mammal is created.");
	}
	
	public void eat(){ // Interface method is necessarily implemented by the class.
		System.out.println("Mammal eats.");
	}
	
	public void travel(){ //Interface method is necessarily implemented by the class.
		System.out.println("Mammal travels.");
	}
	
	public int numOfLegs(){ // the class could may have others methods.
		return 0;
	}

}

public class Bird implements Animal{
        
        public Bird{ // Construct
                System.out.println("Bird is created.");
        }

        public void eat(){ // Interface method is necessarily implemented by the class.
                System.out.println("Bird eats.");
        }

        public void travel(){ // Interface method is necessarily implemented by the class.
                System.out.println("Bird travels.");
        }

        public int hoursFlight(){ //the clase could may have others methods. 
                return 0;
        }
}

class TestAbstraction2{
    public static void main(String args[]){
        Mammal m1 = new Mammal();
        Bird b1 = new Bird();
        
        b1.eat();
        m1.travel;

	m1.eat();
	b1.travel();
	m1.numOfLegs();  
    }
}

```
```java
Output:
	Mammal is created.
	Bird is created.	

	Bird eats.
	Mammal travel.

	Mammal eats.
	Bird travels.
	0
```

