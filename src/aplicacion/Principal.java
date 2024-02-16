package aplicacion;

import java.util.ArrayList;
import mates.Funciones;


public class Principal {
    public static void main(String[] args) {
    // Ejercicio 1. La suma.
    System.out.println("La suma de los 10 primeros números naturales es: " + Funciones.suma(10));
    // Ejercicio 2. El factorial de un número.
    System.out.println("El factorial de 5 es: " + Funciones.factorial(5));
    // Ejercicio 3. La potencia n-ésima de un número natural.
    System.out.println("La potencia de 2 elevado a 3 es: " + Funciones.potencia(2, 3));
    // Ejercicio 4. La suma de los elementos de una lista de números.
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);
    System.out.println("La suma de los elementos de la lista es: " + Funciones.sumaLista(lista));
    // Ejercicio 5. La media aritmética de una lista de números.
    System.out.println("La media aritmética de los elementos de la lista es: " + Funciones.mediaAritm(lista));
    // Ejercicio 6. La desviación típica de una lista de números.
    System.out.println("La desviación típica de los elementos de la lista es: " + Funciones.desviacionTipica(lista));
    // Ejercicio 7.  La suma de los primeros números pares hasta n asumiendo n ≥ 2.
    System.out.println("La suma de los primeros números pares hasta 10 es: " + Funciones.sumaPares(10));
    // Ejercicio 8. La suma de los elementos pares de una lista de enteros.
    System.out.println("La suma de los elementos pares de la lista es: " + Funciones.sumaParesLista(lista));
    // Ejercicio 9. Dada una lista de números naturales mayores o iguales que 2 obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos.
    System.out.println("La lista de números pares de la lista inicial es: " + Funciones.listaPares(lista));
    // Ejercicio 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
    System.out.println("La lista de los primeros números pares hasta 10 es: " + Funciones.listaParesHasta(10));
    // Ejercicio 11. Producto escalar de dos listas de números no vacías y del mismo tamaño.
    System.out.println("El producto escalar de las listas es: " + Funciones.productoEscalar(lista, lista));
    }
}