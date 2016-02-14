#Computación Movil y Agentes Moviles

**Carlos Jaramillo**

**Edgar Amezquita**

####3.

#####__*ArrayList*__

La clase *ArrayList* en java (implementacion de la interfaz **List**, que a su ves implementa la interfaz **Collection**), es una clase que permite el almacenamito que es compatible con los arrays dimanicos,es decir, que pueden crecer segun sea necesario.

Los Arrays de java tienen un tamaño fijo, y este no se puede modifiar, es decir, se debe saber cuantos elementos contendra antes de crearlos.

Los Arraylist son creados con un tamaño inicial, pero cuando se supera este tamaño, la coleccion crece automaticamente, y cuando los elementos se borran, el array puede ser reajustado.

__Codigo__

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