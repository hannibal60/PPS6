/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelo;

import java.util.Arrays;

/**
 *
 * @author rosal
 */
public class sumar_subconjuntos extends Thread
{

    javax.swing.JTextArea rs = null;
    javax.swing.JTextArea sc = null;
    int c[] = null;
    int r = -1;

    public sumar_subconjuntos(javax.swing.JTextArea resultados, javax.swing.JTextArea subconjuntos, int conjunto[], int r)
    {
        this.rs = resultados;
        this.sc = subconjuntos;
        this.c = conjunto;
        this.r = r;
    }

    @Override
    public void run()
    {
        suma_subconjuntos(c, r, 0, new int[r]);
        if (r==Principal.limite)
        {
            long fin_tiempo = System.nanoTime();
            Principal.TextField_Tiempo.setText(String.valueOf(Principal.tiempo(Principal.inicio_tiempo, fin_tiempo)));
            Principal.Button_Reset.setEnabled(true);
        }
    }

    private void suma_subconjuntos(int[] arr, int r, int posicion_inicio, int[] resultado)
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
                rs.append(Arrays.toString(resultado)+"\n");
            }
            sc.append(Arrays.toString(resultado) +" = "+suma+"\n");
            return;
        }
        for (int i = posicion_inicio; i <= arr.length - r; i++)
        {
            resultado[resultado.length - r] = arr[i];
            suma_subconjuntos(arr, r - 1, i + 1, resultado);
        }
    }

}
