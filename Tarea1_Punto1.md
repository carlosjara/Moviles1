##Computación Movil y Agente Moviles
###Carlos Jaramillo
###Cristian Carabali

####1.

*Maps*,*List* y *Sets*, son objetos de "Colletion Framework", que implementan la interfaz "Colletion interface", que pueden ser usados como `Inteface` o como `Class`.

En este punto, mostraremos algunas de las caracteristicas/diferencias entre estos objetos.

-`Duplicidad`, 

>Dado que los *Maps* pueden almacenar parejas de `Llaves` y `Valores`, para estos objetos NO se permiten `Llaves` duplicadas, pero SI se permiten `Valores` duplicados.
>
>Las *lists* permiten elementos duplicados,es decir, cualquier cantidad de elementos dupiclados pueden ser agregados a una lista, sin que esto afecte en algo la composición de la misma (sus valores, o sus indices).
>
>Los *Sets* no permiten elementos duplicados, es decir, los Conjuntos y todas las clases que implementen *Sets* deben tener elementos unicos.
>

-`Valores Nulos` *(Null)*,

>Los *Maps* si permite una `Unica Llave` *Null* ( *No*, puede tener `Llaves] duplicadas), y tambien puede tener `Valores` *Null* ( *SI* permite `Valores` duplicados).
>
>Las *Lists* permiten cualquier cantidad de valores *Null*.
>
>Los *Sets* a lo mas un valor *Null*.
