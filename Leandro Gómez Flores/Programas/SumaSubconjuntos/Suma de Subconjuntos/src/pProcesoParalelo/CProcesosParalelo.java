/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pProcesoParalelo;

import static pClases.CFormatoTiempo.mTiempoFinalPP;
import static pFrame.FParalelo.*;

/**
 *
 * @author leand
 */
public final class CProcesosParalelo extends Thread
{

    static int vTmpContHilos = 1;
    static int vTerminoHilo = 0;

    String vTextSubconjuntoTotal = "";
    String vTextSubconjunto0 = "";

    int i;

    public CProcesosParalelo(int i)
    {
        this.i = i;
    }

    protected void mProcesarInforPP(long[] vSubconjunto, int vLongitud, int vPosInicial)
    {
        if (vLongitud == 0)
        {
            vConteoSubConjTotal++;
            vLabelNumConjunto.setText(vNumCombinaciones + " - " + vConteoSubConjTotal);

            vTextSubconjuntoTotal = ": {";
            for (int i = 0; i < vSubconjunto.length; i++)
            {
                if (i == vSubconjunto.length - 1)
                {
                    vTextSubconjuntoTotal += " " + vSubconjunto[i];
                } else
                {
                    vTextSubconjuntoTotal += vSubconjunto[i] + ", ";
                }
            }
            mTiempoFinalPP();
            vTextSubconjuntoTotal += "}\n";

            vTextAreaTodoSubconjuntoPP.append(vConteoSubConjTotal + vTextSubconjuntoTotal);
            return;
        }
        for (int i = vPosInicial; i <= vConjuntoPP.length - vLongitud; i++)
        {
            //mTiempoFinalPP();
            if (vPausar)
            {
                break;
            }
            vSubconjunto[vSubconjunto.length - vLongitud] = vConjuntoPP[i];
            mProcesarInforPP(vSubconjunto, vLongitud - 1, i + 1);
        }
    }

    protected void mMuestraProceso(long[] vSubconjunto)
    {
        System.out.print("{");
        for (int i = 0; i < vSubconjunto.length; i++)
        {
            if (i == vSubconjunto.length - 1)
            {
                System.out.print(" " + vSubconjunto[i]);
            } else
            {
                System.out.print(vSubconjunto[i] + ", ");
            }
        }
        System.out.print("}\n");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void run()
    {
        mProcesarInforPP(new long[i], i, 0);
        vNumTerminaHilo++;
        if (vNumTerminaHilo == vNumLlegarHilo)
        {
            System.out.println("<<Termine todos los subconjutnos>>");
            System.out.println("<<Total de hilos terminados: " + vNumTerminaHilo + ">>");
            vLabelTotalPP.setText("Total de subconjuntos: " + vConteoSubConjTotal + " | Subconjuntos que suman 0: " + vConteoSubconjSuma0);
            vBotonDetener.setEnabled(false);
            vBotonGenerador.setEnabled(true);
        }
    }

}
