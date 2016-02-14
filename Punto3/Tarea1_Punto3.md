#Computación Movil y Agentes Moviles

**Carlos Jaramillo**

**Edgar Amezquita**

####3.

#####__*ArrayList*__

La clase *ArrayList* en java (implementacion de la interfaz **List**, que a su ves implementa la interfaz **Collection**), es una clase que permite el almacenamiento que es compatible con los arrays dimanicos,es decir, que pueden crecer segun sea necesario.

Los Arrays de java tienen un tamaño fijo, y este no se puede modifiar, es decir, se debe saber cuantos elementos contendra antes de crearlos.

Los Arraylist son creados con un tamaño inicial, pero cuando se supera este tamaño, la coleccion crece automaticamente, y cuando los elementos se borran, el array puede ser reajustado.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados .xml) en la carpeta [ArrayList](https://github.com/carlosjara/Moviles1/tree/master/Punto3/ArrayList)*

```java
package Pruebas;

import java.util.ArrayList;

public class arrayList {
	
	public ArrayList<String> alist = new ArrayList<String>();
	
	public arrayList(ArrayList<String> alist) {
		this.alist = alist;
	}

	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			alist.add(i,"A");
			System.out.println("Element is added.");
		}
	}

	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			alist.get(i);
			System.out.println(("Element: "+alist.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			alist.remove(0);
			System.out.println("Element was removed.");
		}
	}

}
```

#####__*LinkedList*__

La clase *LinkedList* en java (implementacion de la interfaz **List**, que a su ves implementa la interfaz **Collection**), es una clase que permite el almacenamiento, es una lista doblemente enlazada.

Una de las caracteristicas mas importantes de *LinkedList* ademas de lo comun entre las clases que implementan la interfaz **List** es. Son costosos los procesos de acceso, insercion y extraccion posicional de elementos, menos para los elementos en la primera y ultima posicion ya que para estos es inmediato.

La clase *LinkedList* puede tener un tamaño ilimitado.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados .xml) en la carpeta [LinkedList](https://github.com/carlosjara/Moviles1/tree/master/Punto3/LinkedList)*

```java
package Pruebas;

import java.util.LinkedList;

public class linkedList {
	public LinkedList<String> linklist = new LinkedList<String>();

	public linkedList(LinkedList<String> linklist) {
		this.linklist = linklist;
	}
	
	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.add(i,"A");
			System.out.println("Element is added.");
		}
	}
	
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.get(i);
			System.out.println(("Element: "+linklist.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.remove(0);
			System.out.println("Element was removed.");
		}
	}
	
}
```

#####__*Vector*__

La clase *Vector* en java es una clase que permite el almacenamiento, que implementa una array de objetos que puede extenderse dinamicamente; al igual que un array se puede acceder a los elementos de un *Vector* usando un indice.

Dentro de las caracteristicas importante de la clase *Vector* estan:

-El tamaño (*size*) de un *Vector* puede crecer o derecer segun sea necesario para poder agregar o borrar elementos.

-Vector implementa la intefaz list.

-A diferencia de las otras clases que implementan la interfaz collection, la clase *Vector* es sincronizado.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados .xml) en la carpeta [Vector](https://github.com/carlosjara/Moviles1/tree/master/Punto3/Vector)*

```java
package Pruebas;

import java.util.Vector;

public class vector {
	public Vector<String> vctr = new Vector<String>();

	public vector(Vector<String> vctr) {
		this.vctr = vctr;
	}
	
	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.add(i,"A");
			System.out.println("Element is added.");
		}
	}
	
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.get(i);
			System.out.println(("Element: "+vctr.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.remove(0);
			System.out.println("Element was removed.");
		}
	}
}

```
* * *

#####__*HashMap*__

La clase *HashMap* es una tabla hash basada en la implementacion de la interfaz _**Map**_.

Dentro de las caracteristicas mas importantes de *HashMap* estan:

-No se garantiza el orden de iteracion dentro del mapa.
-No permite ni valores nulos (Null), ni llaves duplicadas.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados .xml) en la carpeta [HashMap](https://github.com/carlosjara/Moviles1/tree/master/Punto3/HashMap)*

```java
package Pruebas;

import java.util.HashMap;

public class hashMap {
	public HashMap<Integer,String> hMap = new HashMap<Integer,String>();
	
	//CONSTRUCT
	public hashMap(HashMap<Integer, String> hMap) {
		this.hMap = hMap;
	}

	//PUT
	public void putElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.put(i,"Value");
			System.out.println("Put");
		}
	}
	
	//GET
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.get(i);
			System.out.println("Get");
		}
	}
	
	//REMOVE
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.remove(i);
			System.out.println("Remove");
		}
	}
	
}
```
#####__*LinkedHashMap*__

La clase *LinkedHashMap* es una tabla hash y una lista enlazada basada en la implementacion de la interfaz _**Map**_.

*LinkedHashMap*, inserta los elementos en el orden en que van llegando, no tiene una forma de ordenar los elementos, esto hace que la busqueda de los elementos sea mucho mas lenta que otros maps.

Esta clase provee de todos los operadores de la Map, y ademas permite valores nulos.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados .xml) en la carpeta [LinkedHashMap](https://github.com/carlosjara/Moviles1/tree/master/Punto3/LinkedHashMap)*

```java
package Pruebas;

import java.util.LinkedHashMap;

public class linkedHashMap {
	public LinkedHashMap<Integer,String> lhMap = new LinkedHashMap<Integer,String>();
	
	//CONSTRUCT
	public linkedHashMap(LinkedHashMap<Integer, String> hMap) {
		this.lhMap = hMap;
	}

	//PUT
	public void putElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.put(i,"Value");
			System.out.println("Put");
		}
	}
	
	//GET
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.get(i);
			System.out.println("Get");
		}
	}
	
	//REMOVE
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.remove(i);
			System.out.println("Remove");
		}
	}

}

```
