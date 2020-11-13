/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumasubconjuntos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pProceso.CProcesos;

/**
 *
 * @author leand
 */
public class SumaSubconjuntos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        int vConjunto[] = null;
        /*{
            -7, -3, -2, 5, 8
        };*/
        do
        {
            if ((vConjunto = mDatos(vConjunto)).length > 2)
            {
                CProcesos vProceso = new CProcesos(vConjunto);
                System.out.println("\n====================================\nResultados:\n");
                vProceso.mResultado();
                
            } else
            {
                System.err.println("¡ERROR!, El conjunto no es valido.");
                vConjunto=null;
            }
        } while (vConjunto.length < 3);

    }

    static protected int[] mDatos(int vConjunto[])
    {
        System.out.println("¿Cuantos números tendra tu conjunto?:");
        int vLongitud = mLeerConsola(true);
        vConjunto = new int[vLongitud];
        for (int i = 0; i < vLongitud; i++)
        {
            System.out.println("Dame el numero " + (i + 1) + ":");
            vConjunto[i] = mLeerConsola(true);
        }
        return vConjunto;
    }

    static protected int mLeerConsola(boolean b)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        do
        {
            try
            {
                return Integer.parseInt(br.readLine());
            } catch (IOException ex)
            {
                System.err.println("Error.. provlema de entrada/salida, verifique");

            } catch (NumberFormatException ex)
            {
                System.err.println("Error. se esperaba un entero, Escriba de nuevo:");

            } catch (Exception ex)
            {
                System.err.println("Error..." + ex.toString() + ", verifique");

            }

        } while (b);
        return -1;

    }

}
