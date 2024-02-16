package mates;
import java.util.ArrayList;
 
public class Funciones {
 
// Ejercicio 1. La suma.
 
    public static int suma(int n)
    {
        int acumulado = 0;
        for(int i = 1; i<=n; i++)
        {
            acumulado += i;
        }
        return acumulado;
    }
 
// Ejercicio 2. El factorial de un número.
 
    public static int factorial(int n)
    {
       int acumulado = 1;
         for(int i = 1; i<=n; i++)
        {
            acumulado *= i;
        }
        return acumulado;
    }

// Ejercicio 3. La potencia n-ésima de un número natural.

public static int potencia(int base, int exponente) {
    int acumulado = 1;
    for (int i = 1; i <= exponente; i++) {
        acumulado *= base;
    }
    return acumulado;
}
 
// Ejercicio 4. La suma de los elementos de una lista de números.
 
    public static int sumaLista(ArrayList<Integer> lista)
    {
        int acumulado = 0;
        for (int num : lista)
        {
            acumulado += num;
        }
        return acumulado;
    }
 
//Ejercicio 5. La media aritmética de una lista de números.
     
    public static double mediaAritm(ArrayList<Integer> lista) {
        return (double) sumaLista(lista) / lista.size();
    }
    

// Ejercicio 6. La desviación típica de una lista de números.
 
    public static double desviacionTipica(ArrayList<Integer> lista)
    {
        double media = mediaAritm(lista);
        double acumulado = 0;
        for (int num : lista)
        {
            acumulado += Math.pow(num - media, 2);
        }
        return Math.sqrt(acumulado / lista.size());
    }
 
// Ejercicio 7. La suma de los primeros números pares hasta n asumiendo n ≥ 2.
 
    public static int sumaPares(int n)
    {
        int acumulado = 0;
        for (int i = 2; i <= n; i ++)
        {
            if(i % 2 == 0)
            {
                acumulado += i;
            }
        }
        return acumulado;
    }
 
// Ejercicio 8. La suma de los elementos pares de una lista de enteros.
 
    public static int sumaParesLista(ArrayList<Integer> lista)
    {
        int acumulado = 0;
        for (int num : lista)
        {
            if (num % 2 == 0)
            {
                acumulado += num;
            }
        }
        return acumulado;
    }
 
// Ejercicio 9. Dada una lista de números naturales mayores o iguales que 2 obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos.
     
        public static ArrayList<Integer> listaPares(ArrayList<Integer> lista)
        {
            ArrayList<Integer> pares = new ArrayList<>();
            for (int num : lista)
            {
                if (num % 2 == 0)
                {
                    pares.add(num);
                }
            }
            return pares;
        }

// Ejercicio 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2.
     
        public static ArrayList<Integer> listaParesHasta(int n)
        {
            ArrayList<Integer> pares = new ArrayList<>();
            for (int i = 2; i <= n; i ++)
            {
                if(i % 2 == 0)
                {
                    pares.add(i);
                }
            }
            return pares;
        }
 
// Ejercicio 11. Producto escalar de dos listas de números no vacías y del mismo tamaño.

    public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2)
    {
        int acumulado = 0;
        for (int i = 0; i < lista1.size(); i++)
        {
            acumulado += lista1.get(i) * lista2.get(i);
        }
        return acumulado;
    }
}
