
## 1. Dada la siguiente estructura de clases:

``` java
public class Cache {}

public class DiskCache extends Cache {}

public class MemoryCache extends Cache {}

public class OptimizedDiskCache extends DiskCache {}
```


Marca, de las siguientes respuestas, aquellas que al ejecutarlas provocarían una `RuntimeException`.


a. 
``` java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
Cache cache = (Cache) optimizedDiskCache;
```

b. 
``` java
MemoryCache memoryCache = new MemoryCache();
Cache cache = (Cache) memoryCache;
DiskCache diskCache = (DiskCache) cache;
```

c.
``` java
DiskCache diskCache = new DiskCache();
OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
```

d.
``` java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
DiskCache diskCache = (DiskCache) optimizedDiskCache;
```

e.
``` java
Cache cache = new Cache();
MemoryCache memoryCache = (MemoryCache) cache;
```

f.
``` java
OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
Cache cache = (Cache) optimizedDiskCache;
DiskCache diskCache = (DiskCache) cache;
```



## 2. Implementa la función `countNumbers` para que:
- Acepte una lista ordenada de números únicos 
- cuente cuantos elementos de la lista son menores que el parámetro recibido.


Ejemplo: 

*Ejemplo, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) debería devolver 2 ya que solo hay dos elementos que sean menores que 4.*

Estructura de la clase:

``` java
public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        //resolver aqui
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}

```



# 3. Supongamos una clase Producto con dos atributos:
- String nombre
- int cantidad

Implementa esta clase con un constructor (con parámetros) además de los getters y setters de sus dos atributos. No es necesario comprobar los datos introducidos.

A continuación, crea un programa (main) que haga lo siguiente:
1. Crea 5 instancias de la Clase Producto.
2. Crea un ArrayList.
3. Añade las 5 instancias de Producto al ArrayList.
4. Visualiza el contenido de ArrayList utilizando Iterator.
5. Elimina dos elemento del ArrayList.
6. Inserta un nuevo objeto producto en medio de la lista.
7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
8. Elimina todos los valores del ArrayList.




# 4. Jerarquía de clases: ASTROS
Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas) que forman parte del sistema solar.
Algunos atributos que necesitaremos almacenar son:
-  Masa del cuerpo.
-  Diámetro medio.
-  Período de rotación sobre su propio eje.
-  Período de traslación alrededor del cuerpo que orbitan.
-  Distancia media a ese cuerpo.
-  etc.

Define las clases necesarias conteniendo:
-  Constructores.
-  Métodos para recuperar y almacenas atributos.
-  Método para mostrar la información del objeto.

Define un método, que dado un objeto del sistema solar (planeta o satélite), imprima toda la información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).

![uml](./programacion04-uml.png)

Una posible solución sería crear una lista de objetos, insertar los planetas y satélites (directamente mediante código) y luego mostrar un pequeño menú que permita al
usuario imprimir la información del astro que elija.




