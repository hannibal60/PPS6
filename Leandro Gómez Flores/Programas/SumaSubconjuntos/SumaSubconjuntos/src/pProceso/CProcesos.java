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
            mProcesarInfor(vConjunto, new int[i], i, 0);
        }
    }

    public void mResultado()
    {
        for (int i = 0; i < vSubconjuntos.length; i++)
        {
            System.out.print("Subconjunto: {");
            for (int j = 0; j < vSubconjuntos[i].length; j++)
            {
                if (j == vSubconjuntos[i].length-1)
                {
                    System.out.print(" " + vSubconjuntos[i][j]); 
                }else
                {
                     System.out.print(" " + vSubconjuntos[i][j]+",");
                }
            }
            System.out.println("} = 0\n");
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
        System.arraycopy(vSubconjuntos, 0, vTmp, 0, vSubconjuntos.length);
        vTmp[vTmp.length-1] = vNuevoSubconjunto;
        vSubconjuntos = vTmp;
    }

    protected void mProcesarInfor(int[] vConjunto, int[] vSubconjunto, int vLongitud, int vPosInicial)
    {
        if (vLongitud == 0)
        {
            int vSumar = 0;

            for (int i = 0; i < vSubconjunto.length; i++)
            {
                vSumar += vSubconjunto[i];
            }

            if (vSumar == 0)
            {
                mAgregarSubConjunto(vSubconjunto);
            }
            vConteo++;
            return;
        }
        for (int i = vPosInicial; i <= vConjunto.length - vLongitud; i++)
        {
            vSubconjunto[vSubconjunto.length - vLongitud] = vConjunto[i];
            mProcesarInfor(vConjunto, vSubconjunto, vLongitud - 1, i + 1);
        }
    }
}
