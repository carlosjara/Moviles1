##Computación Movil y Agente Moviles
###Carlos Jaramillo
###Cristian Carabali
###Edgar Amezquita

####1.

*Maps*,*List* y *Sets*, son objetos de "Collection Framework", que implementan la interfaz "Colletion interface", que pueden ser usados como `Interface` o como `Class`.

En este punto, mostraremos algunas de las caracteristicas/diferencias entre estos objetos.

-`Duplicidad`, 

>Dado que los *Maps* pueden almacenar parejas de Llaves y Valores, para estos objetos NO se permiten Llaves duplicadas, pero SI se permiten Valores duplicados.
>
>Las *lists* permiten elementos duplicados,es decir, cualquier cantidad de elementos dupiclados pueden ser agregados a una lista, sin que esto afecte en algo la composición de la misma (sus valores, o sus indices).
>
>Los *Sets* no permiten elementos duplicados, es decir, los Conjuntos y todas las clases que implementen *Sets* deben tener elementos unicos.
>

-`Valores Nulos` *(Null)*,

>Los *Maps* si permite una Unica Llave *Null* ( *No*, puede tener Llaves duplicadas), y tambien puede tener `Valores` *Null* ( *SI* permite Valores duplicados).
>
>Las *Lists* permiten cualquier cantidad de valores *Null*.
>
>Los *Sets* a lo mas un valor *Null*.
>

-`Orden`

>Los *Maps* no almacenan los elementos en un orden, pero algunas de sus subclases si lo hacen, subclases como *TreeMap* ordena los mapas en orden ascendente de las llaves y los *LinkedHashMap* ordena los elementos en orden de insercion, el orden en que los elementos son agregados al *LinkedHashMap*.
>
>Las *Lists* y todas sus clases mantienen su orden de insercion.
>
>Los *Sets* al igual que los *Maps* no tienen un orden para sus elementos, algunas de sus clases mantiene un orden, clases como LinkedHashSet.


#####Ejemplos.

>Los ejemplos se encuentran en la carpeta.
