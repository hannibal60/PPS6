/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author rosal
 */
public class Principal
{

    static int cont = 1;
    static int n = 0;
    static int[] conjunto = null;
    static ArrayList respuesta = new ArrayList();

    public static void main(String[] args)
    {
        do
        {
            String numero = JOptionPane.showInputDialog("Escriba la longitud del conjunto (entero mayor a 2)");
            try
            {
                int temp = Integer.parseInt(numero);
                if (temp > 2)
                {
                    n = temp;
                    System.out.println("Valor de n: " + n + "\n");
                } else
                {
                    System.err.println("Valor incorrecto para n. solicitando nuevamente...");
                }
            } catch (Exception e)
            {
                System.err.println("Valor incorrecto para n. solicitando nuevamente...");
            }
        } while (n == 0);

        conjunto = new int[n];

        for (int i = 0; i < n; i++)
        {
            boolean v = false;
            do
            {
                String numero = JOptionPane.showInputDialog("Escriba el valor de la posicion " + (i + 1) + " del conjunto (entero)");
                try
                {
                    int temp = Integer.parseInt(numero);
                    conjunto[i] = temp;
                    v = true;
                    System.out.println("Valor de conjunto[" + i + "]: " + conjunto[i]);
                } catch (Exception e)
                {
                    System.err.println("Valor incorrecto para conjunto[" + i + "]. Solicitando nuevamente");
                }
            } while (!v);
        }

        System.out.println("\nSerán " + total_subconjuntos(n) + " subconjuntos.");

        for (int r = n; r >= 2; r--)
        {
            suma_subconjuntos(conjunto, r, 0, new int[r]);
        }
        
        if (respuesta.size()>0)
        {
            System.out.print("\nLos subconjuntos ");
            for (int i = 0; i < respuesta.size(); i++)
            {
                System.out.print(respuesta.get(i)+" ");
            }
            System.out.print(" suman 0\n\n");
        } else
        {
            System.err.println("No se encontraron subconjuntos que sumen 0...");
        }

    }

    static void suma_subconjuntos(int[] arr, int r, int posicion_inicio, int[] resultado)
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

    public static int total_subconjuntos(int n)
    {
        int suma = 0;
        for (int r = n; r >= 2; r--)
        {
            suma += factorial(n) / (factorial(n - r) * factorial(r));
        }
        return suma;
    }

    public static int factorial(int f)
    {
        if (f==0)
        {
            return 1;
        } else
        {
            return f * factorial(f-1);
        }
    }
}
