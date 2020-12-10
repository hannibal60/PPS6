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

    public static final int vProcesos = Runtime.getRuntime().availableProcessors();
    static int vNumProcesosDisponibles = ((vProcesos / 2) + ((vProcesos / 2) / 2));
    static int vTmpContHilos = 1;
    static int vTerminoHilo = 0;

    String vTextSubconjuntoTotal = "";
    String vTextSubconjunto0 = "";
    String vTextoTamañoConuuntoNumeroCombinacionesTmp;

    long[] vConjunto;
    int i;

    public CProcesosParalelo(long[] vConjunto, int i)
    {
        System.out.println("Para");
        this.vConjunto = vConjunto;
        this.i = i;
    }

    protected void mProcesarInfor(long[] vConjunto, long[] vSubconjunto, int vLongitud, int vPosInicial)
    {
        if (vLongitud == 0)
        {
            //mMuestraProceso(vSubconjunto);
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
                mTiempoFinalPP();
            }
            vTextSubconjuntoTotal += "}\n";

            vTextAreaTodoSubconjunto.append(vConteoSubConjTotal + vTextSubconjuntoTotal);

            int vSumar = 0;

            for (int i = 0; i < vSubconjunto.length; i++)
            {
                vSumar += vSubconjunto[i];
                mTiempoFinalPP();
            }

            if (vSumar == 0)
            {
                vConteoSubconjSuma0++;
                vTextSubconjunto0 = ": {";
                for (int i = 0; i < vSubconjunto.length; i++)
                {
                    if (i == vSubconjunto.length - 1)
                    {
                        vTextSubconjunto0 += " " + vSubconjunto[i];
                    } else
                    {
                        vTextSubconjunto0 += vSubconjunto[i] + ", ";
                    }
                    mTiempoFinalPP();
                }
                vTextSubconjunto0 += "}\n";
                vTextAreaSubconjuntos0.append(vConteoSubconjSuma0 + vTextSubconjunto0);
            }
            return;
        }
        for (int i = vPosInicial; i <= vConjunto.length - vLongitud; i++)
        {
            mTiempoFinalPP();
            if (vPausar)
            {
                break;
            }
            vSubconjunto[vSubconjunto.length - vLongitud] = vConjunto[i];
            mProcesarInfor(vConjunto, vSubconjunto, vLongitud - 1, i + 1);
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

    ////////////////////////// ^ PARTE LOCAL ^ ////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void run()
    {
        System.out.println(i);
        mProcesarInfor(vConjunto, new long[i], i, 0);
        vNumTerminaHilo++;
        if (vNumTerminaHilo == vNumLlegarHilo)
        {
            vBotonDetener.setEnabled(false);
            vBotonGenerador.setEnabled(true);
        }
    }

}
