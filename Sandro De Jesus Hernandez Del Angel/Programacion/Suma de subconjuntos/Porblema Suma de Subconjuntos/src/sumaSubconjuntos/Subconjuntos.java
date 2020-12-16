/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saipr
 */
public class Subconjuntos
{

    String s = "";
    String ns = "";
    private int set[];

    /**
     * Requiere que se manden los tiempos en NANOSEGUNDOS para que la conversion
     * funcione.
     *
     * @param bT Beginning Time (Tiempo de inicio)
     * @param eT End Time (Tiempo de finalizacion)
     * @return Retorna el tiempo en Minutos
     */
    public static double timeNanoToMin(double bT, double eT)
    {
        return (timeNanoToSeconds(bT, eT)) / 60;
    }

    /**
     * Requiere que se manden los tiempos en NANOSEGUNDOS para que la conversion
     * funcione.
     *
     * @param bT Beginning Time (Tiempo de inicio)
     * @param eT End Time (Tiempo de finalizacion)
     * @return Retorna el tiempo en Milisegundos
     */
    public static double timeNanoToMili(double bT, double eT)
    {
        return (eT - bT) / 1000000;
    }

    /**
     * Requiere que se manden los tiempos en NANOSEGUNDOS para que la conversion
     * funcione.
     *
     * @param bT Beginning Time (Tiempo de inicio)
     * @param eT End Time (Tiempo de finalizacion)
     * @return Retorna el tiempo en SEGUNDOS
     */
    public static double timeNanoToSeconds(double bT, double eT)
    {
        return (eT - bT) / 1000000000;
    }

    public static int[] llenarArray(int tam)
    {

        int[] numeros = new int[tam];
        int desde = (tam / 2) - tam;
        if (!(tam % 2 == 0))
        {
            desde += 1;
        }
        System.out.println("desde= " + desde);
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = desde;
            desde++;
        }
        return numeros;
    }

    /**
     * Realiza la suma de subconjuntos e imprime las recurrencias
     *
     * @param conjunto Arreglo con los elementos con los cuales se va a realizar
     * el calculo
     * @param sumD Suma Deseada que se desea encontrar con los subconjuntos,
     * aqui pondriamos el 0
     */
    public void iniSumSubconjuntos(int[] conjunto, int sumD)
    {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        String ns = "";
        int sum = 0;
        int nSum = 1;
        System.out.println("Subconjunto que suman " + sumD);
        for (int x : conjunto)
        {
            int n = subsets.size();
            for (int i = 0; i < n; i++)
            {
                ArrayList<Integer> aux = new ArrayList(subsets.get(i));
                aux.add(x);
                subsets.add(aux);
                if (aux.size() >= 2)
                {
                    //Ejecucion del hilo mientras hace las combinaciones
                    //-->>Implementado en hilo
                    int add = 0;
                    String ssAux = "";
                    ssAux += "{ ";
                    for (int j = 0; j < aux.size(); j++)
                    {
                        if (j == aux.size() - 1)
                        {
                            ssAux += aux.get(j);
                        } else
                        {
                            ssAux += aux.get(j) + ", ";
                        }
                        add += aux.get(j);
                    }
                    ssAux += " }\n";
                    if (add == sumD)
                    {
                        //--> Aqui imprime el resultado
                        //System.out.println("" + ssAux);
                        sum++;
                        System.out.println(sum + ".-" + ssAux + "\n");
                        s += ssAux;
                    } else
                    {
                        ns += nSum + ".- " + ssAux + "\n";
                        nSum++;
                    }
                }
            }
        }
        //System.out.println("Subconjuntos que suman " + sumD + "\n" + s + " Total de resultados: " + sum + "");
        System.out.println("\n----------------------------------------------------------------------------------------");
        System.out.println("Subconjuntos que NO suman " + sumD + "\n" + ns + "Total de resultados: " + nSum);
        //System.out.println("PPSubconjuntos");
        /*subsets.forEach(System.out::println);*/
    }

    public Subconjuntos(int[] arr)
    {
        this.set = arr;
    }

    /**
     * @param set the set to set
     */
    public void setSet(int[] set)
    {
        this.set = set;
    }

}
