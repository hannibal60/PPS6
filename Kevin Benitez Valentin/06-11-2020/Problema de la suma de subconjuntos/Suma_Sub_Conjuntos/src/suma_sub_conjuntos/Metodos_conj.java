/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_sub_conjuntos;

import java.util.StringJoiner;

/**
 *
 * @author Kevin Benitez
 */
public class Metodos_conj
{

    public static int[] conversor(String cad)
    {
        String[] cadnumbers = cad.split(",");
        int arr[] = new int[cadnumbers.length];
        for (int i = 0; i < cadnumbers.length; i++)
        {
            arr[i] = Integer.parseInt(cadnumbers[i]);
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static boolean isNumeric(String cad)
    {
        try
        {
            Integer.parseInt(cad);
            return true;
        } catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static int sub_conjunto_contador = 0;

    /**
     * Metodo por backtracking
     *
     * @param lista arreglo de enteros
     * @param suma suma inicial
     * @param empieza numero a recorrer
     * @param objetivo_suma objetivo a llegar
     */
    public static void met_backtracking(int lista[], int suma, int empieza, int objetivo_suma)
    {
        if (objetivo_suma == suma)
        {
            sub_conjunto_contador++;
            if (empieza < lista.length)
            {
                met_backtracking(lista, suma - lista[empieza - 1], empieza, objetivo_suma);
            }
        } else
        {
            for (int i = empieza; i < lista.length; i++)
            {
                met_backtracking(lista, suma + lista[i], i + 1, objetivo_suma);
            }
        }
    }

    /*
    1.- Recibimos 2 parametros, la lista de numeros y la suma deseada 
    2.- Corroboramos que el subconjunto de la lista de como resultados la suma deseada
        2.1.- Si existe entonces hacemos el subconjunto con los datos que dan la suma deseada
        2.2.- El string Joiner nos da el formato [#,#,#....]
        2.3.- Por cada valor encontrado del subconjunto lo añadimos al string joiner
        2.4.- Por ultimo imprimimos en pantalla el conjunto
    3.- En otro caso desplegamos que no se encontro ningun sub conjunto para la suma deseada
     */
    public static String met_backtraking(int[] lista_num, int suma)
    {
        String s = "";
        int sub_conjunto[] = new int[lista_num.length];
        boolean sub_conjunto_enc = encuentra_sub_c(lista_num, sub_conjunto, suma, 0, 0);
        if (sub_conjunto_enc)
        {
            s += "Sub conjunto para la suma " + suma + ": ";
            StringJoiner cons = new StringJoiner(", ", "[", "]");

            for (int temp = 0, i = 0; temp != suma; temp += sub_conjunto[i], i++)
            {
                cons.add(String.valueOf(sub_conjunto[i]));
            }

            s += cons.toString();
        } else
        {
            s += "No se encontro ningun sub conjunto para la suma: " + suma;
        }
        return s;
    }

    /*
    Algoritmo: 
    1.- Si el inicio que es 0 es igual a la longitud del arreglo entonces esta vacio y devuelve falso
    2.- Si la posicion del arreglo es igual a la suma entonces el subconjunto en  su inicio va a ser igual a a lista en su posicion inicial
    3.- Se recorre la lista de enteros desde 0 hasta la longitud maxima
        3.1.- Si el arreglo en la posicion donde se recorre es mayor a la suma  entonces
            3.1.1.- No se hace nada y se toma el siguiente elemento de la lista
        3.2.- Si el arreglo en la posicion donde se recorre es igual a la suma entonces
            3.2.1.- Se devuelve verdadero 
        3.3.- La recursividad se llama con el valor de inicio + 1 y la suma menos el valor de la lista en posicion [i]
        3.4.- Si la ultima recursion fue exitosa entonces
            3.4.1.- Retornamos verdadero
    4.- En cualquier otro caso retornamos falso
     */
    private static boolean encuentra_sub_c(int lista[], int[] sub_conjunto, int suma, int inicio, int inicio_sub_arr)
    {
        if (inicio == lista.length)
        {
            return false;
        }

        if (lista[inicio] == suma)
        {
            sub_conjunto[inicio_sub_arr] = lista[inicio];
            return true;
        }

        for (int i = inicio; i < lista.length; i++)
        {
            if (lista[i] > suma)
            {
                continue;
            }

            if (lista[i] == suma)
            {
                sub_conjunto[inicio_sub_arr] = lista[i];
                return true;
            }

            sub_conjunto[inicio_sub_arr] = lista[i];
            if (encuentra_sub_c(lista, sub_conjunto, suma - lista[i], i + 1, inicio_sub_arr + 1))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Algoritmo recursivo para resolver el problema de la suma de subconjuntos
     * (sin backtracking)
     */
    public static boolean suma_subc_rec(int lista[], int n, int suma)
    {
        //Casos base
        if (suma == 0)
        {
            return true;
        }
        if (n == 0 && suma != 0)
        {
            return false;
        }

        //Si el ultimo elemento de la lista es mas grande que la suma no se hace nada
        if (lista[n - 1] > suma)
        {
            return suma_subc_rec(lista, n - 1, suma);
        } else
        {
            //Sino checamos si la suma puede ser obtenida por cualquiera de los siguientes casos
            // (1) Incluyendo el ultimo elemento
            // (2) Excluyendo el ultimo elemento
            return suma_subc_rec(lista, n - 1, suma) || suma_subc_rec(lista, n - 1, suma - lista[n - 1]);
        }
    }

    /*
    Algoritmo que usa programacion dinamica para resolver el problema de la suma de subconjuntos
    (Sin recursividad, sin backtracking)
     */
    public static Object[] suma_subc_dyp(int lista[], int n, int suma)
    {
        Object arrob[]= new Object[2];
        String s = "";
        //El valor del subconjunto en [i][j] sera
        //verdadero si hay un subconjunto del conjunto [0....j-1] con una suma equivalente a el iterador "i"
        boolean sub_conjunto[][] = new boolean[suma + 1][n + 1];

        //Ahora, si la suma es 0 entonces significa que es verdadero
        for (int i = 0; i <= n; i++)
        {
            sub_conjunto[0][i] = true;
        }

        //Si la suma no es 0 y el conjunto esta vacio entonces significa que es falso
        for (int i = 1; i <= suma; i++)
        {
            sub_conjunto[i][0] = false;
        }

        //Llenamos la tabla de subconjuntos de manera ascendente
        for (int i = 1; i <= suma; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                sub_conjunto[i][j] = sub_conjunto[i][j - 1];
                if (i >= lista[j - 1])
                {
                    sub_conjunto[i][j] = sub_conjunto[i][j] || sub_conjunto[i - lista[j - 1]][j - 1];
                }
            }
        }

        /*Imprimimos la matriz
        for (int i = 0; i <= suma; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                System.out.println(sub_conjunto[i][j]);;
            }
        }*/
        
        arrob[0]=s;
        arrob[1]=sub_conjunto[suma][n];
        
        return arrob;
    }
}
