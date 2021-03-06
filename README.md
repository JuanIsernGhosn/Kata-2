# Kata_2

## Enunciado:

### Entrada
Dado el siguiente vector:
```
[2,2,11,4,2,6,11,2,3,5,11,5]
```
Se pide realizar una aplicación para el cálculo del histograma, es decir la frecuencia de cada número.

### Resultado
El resultado debe ser:
```
2->4, 3->1, 4->1, 5->2, 6->1, 11->3
```

## Requisitos
Para realizar el ejercicio se debe hacer uso de un array asociativo, Mapas, Diccionarios o Array Asociativos

Los array asociativos son estructuras de datos donde cada elemento del array tiene asociado una clave que usaremos para recuperarlo (en lugar de un índice entero entre0 y n-1).

Para definirlos en java se utiliza la clase HashMap<Key,Value>. En este caso se trabaja con dos clases una que se utiliza como clave (Key) y otra para almacenar losvalores (Value). La idea es que cada elemento se almacena mediante un par de
objetos (Key,Value). Esta estructura de datos nos permite obtener el objeto Value muy rápidamente, a partir de su clave Key.

Por ejemplo, podríamos almacenar objetos de la clase Vehiculo y utilizar como clave su matrícula en un String. De esta forma, a partir de la matrícula un diccionario encontraría el vehículo asociado muy rápidamente.

El siguiente ejemplo muestro como crear un diccionario para almacenar objetos de la clase Car utilizando como clave un String con la matrícula: 
```
HashMap<String,Car> vehicles = new HashMap<String, Car>();
vehicles.put("GC 1245 BPX", new Car());
vehicles.put("3210 HGL", new Car());
vehicles.get("GC 1245 BPX");
```

Para recorrer todos los elementos del array asociativo (HashMap)
```
for (String key : vehicles.keySet())
System.out.println(vehicles.get(key));
```

## Authors
* **Juan Isern** - *Initial work* - [JuanIsernGhosn](https://github.com/JuanIsernGhosn/)
