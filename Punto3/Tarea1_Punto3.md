#Computación Movil y Agentes Moviles

**Carlos Jaramillo**

**Edgar Amezquita**

####3.

#####__*ArrayList*__

La clase *ArrayList* en java (implementacion de la interfaz **List**, que a su ves implementa la interfaz **Collection**), es una clase que permite el almacenamiento que es compatible con los arrays dimanicos,es decir, que pueden crecer segun sea necesario.

Los Arrays de java tienen un tamaño fijo, y este no se puede modifiar, es decir, se debe saber cuantos elementos contendra antes de crearlos.

Los Arraylist son creados con un tamaño inicial, pero cuando se supera este tamaño, la coleccion crece automaticamente, y cuando los elementos se borran, el array puede ser reajustado.

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados -xml) en la carpeta [Static Fields](https://github.com/carlosjara/Moviles1/tree/master/Punto2/Static%20Fields)*

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

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados -xml) en la carpeta [Static Fields](https://github.com/carlosjara/Moviles1/tree/master/Punto2/Static%20Fields)*

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

__Codigo__ *Puede encontrarse este Codigo y sus pruebas (con el archivo de resultados -xml) en la carpeta [Static Fields](https://github.com/carlosjara/Moviles1/tree/master/Punto2/Static%20Fields)*

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