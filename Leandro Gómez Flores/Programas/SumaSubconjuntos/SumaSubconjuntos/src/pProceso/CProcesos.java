/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pProceso;

import java.util.Arrays;

/**
 *
 * @author leand
 */
public final class CProcesos
{

    int vConteo = 1;
    int[] vConjunto = null;
    int[][] vSubconjuntos = new int[0][];

    public CProcesos(int vConjunto[])
    {
        this.vConjunto = vConjunto;
        for (int i = 2; i < vConjunto.length; i++)
        {
            mProcesarInfor(vConjunto, i, 0, new int[i]);
        }
    }

    public void mResultado()
    {
        for (int i = 0; i < vSubconjuntos.length; i++)
        {
            System.out.print("Subconjunto:");
            for (int j = 0; j < vSubconjuntos[i].length; j++)
            {
                System.out.print(" " + vSubconjuntos[i][j]);
            }
            System.out.println("\n");
        }
    }

   /* protected void mAgregarResultado(int vNumNuevo)
    {
        if (vTmpSubconjunto == null)
        {
            vTmpSubconjunto = new int[1];
            vTmpSubconjunto[0] = vNumNuevo;
        } else
        {
            int vTmp[] = new int[vTmpSubconjunto.length + 1];
            System.arraycopy(vTmpSubconjunto, 0, vTmp, 0, vTmpSubconjunto.length + 1);
            vTmp[vTmp.length] = vNumNuevo;
            vTmpSubconjunto = vTmp;
        }
    }*/

    protected void mAgregarSubConjunto(int vNuevoSubconjunto[])
    {
        int vTmp[][] = new int[vSubconjuntos.length + 1][vNuevoSubconjunto.length];
        System.arraycopy(vSubconjuntos, 0, vTmp, 0, vSubconjuntos.length + 1);
        vTmp[vTmp.length] = vNuevoSubconjunto;
        vSubconjuntos = vTmp;
    }

    protected void mProcesarInfor(int[] arr, int len, int posicion_inicio, int[] vResultado)
    {
        if (len == 0)
        {
            int suma = 0;

            for (int j = 0; j < vResultado.length; j++)
            {
                suma += vResultado[j];
            }

            if (suma == 0)
            {
                mAgregarSubConjunto(vResultado);
            }
            vConteo++;
            return;
        }
        for (int i = posicion_inicio; i <= arr.length - len; i++)
        {
            vResultado[vResultado.length - len] = arr[i];
            mProcesarInfor(arr, len - 1, i + 1, vResultado);
        }
    }
}
