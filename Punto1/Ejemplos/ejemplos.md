##Computación Movil y Agente Moviles
###Carlos Jaramillo
###Cristian Carabali
###Edgar Amezquita

####Ejemplos.
-Maps
>Si queremos modelar un inventario de cuantos objetos de un tipo tenemos, esta estructura nos permite no tener duplicados en cuanto al tipo del objeto
 por ejemplo si queremos saber cuantos modelo de un carro tenemos, la llave seria el modelo del carro y el valor seria la cantidad que hay. 
>Asi se podria implementar en java(sacado de:*http://examples.javacodegeeks.com/java-basics/java-map-example/*):
```java
import java.util.HashMap;
import java.util.Map;
 
public class HashMapExample {
     
    public static void main(String[] args) {
        Map vehicles = new HashMap();
         
        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);
         
        System.out.println("Total vehicles: " + vehicles.size());
         
        // Iterate over all vehicles, using the keySet method.
        for(String key: vehicles.keySet())
            System.out.println(key + " - " + vehicles.get(key));
        System.out.println();
         
        String searchKey = "Audi";
        if(vehicles.containsKey(searchKey))
            System.out.println("Found total " + vehicles.get(searchKey) + " "
                    + searchKey + " cars!\n");
         
        // Clear all values.
        vehicles.clear();
         
        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}
```
-Sets
>Si queremos saber si hay elementos repetidos podemos usar un set y luego comparar la logitud del array con la del set para
poder saber si hay repetidos, o en el caso de que necesitemos guardar valores que no se puedan repartir.
>Asi se podria implementar en java(sacado de:*http://examples.javacodegeeks.com/java-basics/java-set-example/*):
```java
import java.util.*;

public class SetExample {
 
    public static void main(String args[]) {
 
        // We create a new, empty set
        Set mySet1 = new HashSet();
        // We add a few elements
        mySet1.add("A");
        mySet1.add("C");
        mySet1.add("A");
        mySet1.add("B");
        // Print the elements of the Set
        System.out.println("mySet1: " + mySet1);
 
        // Create a list and add some elements
        List list = new ArrayList();
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        // Now create the set using the appropriate constructor
        Set mySet2 = new HashSet(list);
        // Print the elements of the list an the the set
        System.out.println("list: " + list);
        System.out.println("mySet2: " + mySet2);
 
        // Compare the two sets
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));
 
        // Now we will remove one element from mySet2 and compare again
        mySet2.remove("A");
        System.out.println("mySet2: " + mySet2);
        System.out.println("MySet1 matches mySet2: " + mySet1.equals(mySet2));
 
        // Lets check if our sets contain all the elements of the list
        System.out.println("MySet1 contains all the elements: " + mySet1.containsAll(list));
        System.out.println("MySet2 contains all the elements: " + mySet2.containsAll(list));
 
        // Use of Iterator in Set
        Iterator iterator = mySet1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator loop: " + iterator.next());
        }
 
        // Use of for-each in Set
        for (String str : mySet1) {
            System.out.println("for-each loop: " + str);
        }
 
        // Clearing all the elements
        mySet1.clear();
        System.out.println("mySet1 is Empty: " + mySet1.isEmpty());
 
        // Checking the number of elements
        System.out.println("mySet1 has: " + mySet1.size() + " Elements");
        System.out.println("mySet2 has: " + mySet2.size() + " Elements");
 
        // Creating an Array with the contents of the set
        String[] array = mySet2.toArray(new String[mySet2.size()]);
        System.out.println("The array:" + Arrays.toString(array));
    }
}

```
-List
> Si queremos guardar varios elementos y estos pueden repetirse, hacer una lista es una muy buena idea ya que esta conserva indices para indicar la posición de los elementos,
con las listas podemos hacer un inventario mas sencillo, donde solo estarian los productos que hay, o tambien podria ser una lista de estudiantes/ 
