/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurado;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author rosal
 */
public class Principal
{

    static int cont = 0;
    static int n = 0, min = 0, max = 0;
    static int[] conjunto = null;

    static ArrayList respuesta = new ArrayList();

    public static void main(String[] args)
    {
        long inicio = System.nanoTime();

        n = lectura_MayorA("n", "Escriba la longitud del conjunto \n(entero mayor a 2 y menor a 21*)", 2);
        conjunto = new int[n];

        min = lectura_MenorA("min", "Determinar rango para llenar el conjunto\nDesde: (entero negativo)", 0);
        max = lectura_MayorA("max", "Determinar rango para llenar el conjunto\nHasta: (entero positivo)", 0);
        for (int i = 0; i < n; i++)
        {
            conjunto[i] = numero_entre(min, max);
            System.out.println("Valor de conjunto[" + i + "]: " + conjunto[i]);
        }

        System.out.println("\nSerán " + total_subconjuntos(n) + " subconjuntos.");

        for (int r = n; r >= 2; r--)
        {
            suma_subconjuntos(conjunto, r, 0, new int[r]);
        }

        if (respuesta.size() > 0)
        {
            System.out.println("\n\nLos siguientes subconjuntos suman 0:");
            for (int i = 0; i < respuesta.size(); i++)
            {
                System.out.println(respuesta.get(i));
            }
        } else
        {
            System.err.println("No se encontraron subconjuntos que sumen 0...");
        }

        long fin = System.nanoTime();
        System.out.println("\nTiempo total de ejecucion: " + tiempo(inicio, fin) + " segundos.");
    }

    private static void suma_subconjuntos(int[] arr, int r, int posicion_inicio, int[] resultado)
    {
        if (r == 0)
        {
            int suma = 0;

            for (int j = 0; j < resultado.length; j++)
            {
                suma += resultado[j];
            }

            if (suma == 0)
            {
                respuesta.add(cont);
            }

            System.out.println("Subconjunto " + cont + ": " + Arrays.toString(resultado) + " = " + suma);
            cont++;
            return;
        }
        for (int i = posicion_inicio; i <= arr.length - r; i++)
        {
            resultado[resultado.length - r] = arr[i];
            suma_subconjuntos(arr, r - 1, i + 1, resultado);
        }
    }

    private static long total_subconjuntos(long n)
    {
        long suma = 0;
        for (long r = n; r >= 2; r--)
        {
            suma += factorial(n) / (factorial(n - r) * factorial(r));
        }
        return suma;
    }

    private static long factorial(long f)
    {
        if (f == 0)
        {
            return 1;
        } else
        {
            return f * factorial(f - 1);
        }
    }

    private static int lectura_MayorA(String variable, String mensaje, int valor)
    {
        int num = 0;
        do
        {
            String numero = JOptionPane.showInputDialog(mensaje);
            try
            {
                int temp = Integer.parseInt(numero);
                if (temp > valor)
                {
                    num = temp;
                    System.out.println("Valor de " + variable + ": " + num + "\n");
                } else
                {
                    System.err.println("Valor incorrecto para " + variable + ". solicitando nuevamente...");
                }
            } catch (Exception e)
            {
                System.err.println("Valor incorrecto para " + variable + ". solicitando nuevamente...");
            }
        } while (num == 0);
        return num;
    }

    private static int lectura_MenorA(String variable, String mensaje, int valor)
    {
        int num = 0;
        do
        {
            String numero = JOptionPane.showInputDialog(mensaje);
            try
            {
                int temp = Integer.parseInt(numero);
                if (temp < valor)
                {
                    num = temp;
                    System.out.println("Valor de " + variable + ": " + num + "\n");
                } else
                {
                    System.err.println("Valor incorrecto para " + variable + ". solicitando nuevamente...");
                }
            } catch (Exception e)
            {
                System.err.println("Valor incorrecto para " + variable + ". solicitando nuevamente...");
            }
        } while (num == 0);
        return num;
    }

    private static int numero_entre(int desde, int hasta)
    {
        return (int) Math.floor(Math.random() * (hasta - desde + 1) + desde);
    }

    private static double tiempo(long inicio, long fin)
    {
        return (double) ((((double) fin) - ((double) inicio)) / 1000000000);
    }
}
