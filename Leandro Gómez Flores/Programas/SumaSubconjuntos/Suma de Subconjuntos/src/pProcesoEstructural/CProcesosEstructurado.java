/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pProcesoEstructural;

import java.math.BigInteger;
import pGenerarConjunto.CGenerar;
import static pFrame.FEstructurado.*;
import static pClases.CFormatoTiempo.*;
import static pGenerarConjunto.CCalcularConvinaciones.mCalcularSubconjuntos;

/**
 *
 * @author leand
 */
public final class CProcesosEstructurado implements Runnable
{

    int vConteoSubConjTotal = 0;
    int vConteoSubconjSuma0 = 0;
    long[] vConjunto = null;

    String vTextSubconjuntoTotal = "";
    String vTextSubconjunto0 = "";
    String vTextoTamañoConuuntoNumeroCombinaciones = "";

    public CProcesosEstructurado()
    {
        System.out.println("Es");
    }

    /**
     * Metodo para poder iniciar con la divición del conjunto, tambien escribe
     * en algunos label que se muestran en pantalla.
     *
     * @param vConjunto Conjunto generado automaticamente.
     */
    protected void mComenzar(long vConjunto[])//Hilo
    {

        System.out.println("Longitud del conjunto: " + vConjunto.length);
        vLabelNumConjunto.setText("Longitud del conjunto: " + vConjunto.length);
        this.vConjunto = vConjunto;

        String vTexto = "{";
        for (int i = 0; i < vConjunto.length; i++)
        {
            if (i == vConjunto.length - 1)
            {
                vTexto += " " + vConjunto[i];
            } else
            {
                vTexto += vConjunto[i] + ", ";
            }
            mTiempoFinal();
        }
        vTexto += "}";
        vTextAreaConjunto.setText(vTexto);
        BigInteger vNumSubconjuntos=mCalcularSubconjuntos(vConjunto.length);
        vLabelNumConjuntoInfo.setText("Longitud del conjunto: " + vConjunto.length
                + ", Número de combinaciones por hacer: " + vNumSubconjuntos);

        vLabelNumConjunto.setText(""+vNumSubconjuntos);
        vTextoTamañoConuuntoNumeroCombinaciones = vLabelNumConjunto.getText();

        for (int i = vConjunto.length; i >= 2; i--)
        {
            mProcesarInfor(vConjunto, new long[i], i, 0);
        }
    }

    protected void mProcesarInfor(long[] vConjunto, long[] vSubconjunto, int vLongitud, int vPosInicial)
    {
        if (vLongitud == 0)
        {
            //mMuestraProceso(vSubconjunto);
            vConteoSubConjTotal++;
            vLabelNumConjunto.setText(vTextoTamañoConuuntoNumeroCombinaciones + " - " + vConteoSubConjTotal);

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
                mTiempoFinal();
            }
            vTextSubconjuntoTotal += "}\n";

            vTextAreaTodoSubconjunto.append(vConteoSubConjTotal + vTextSubconjuntoTotal);

            int vSumar = 0;

            for (int i = 0; i < vSubconjunto.length; i++)
            {
                vSumar += vSubconjunto[i];
                mTiempoFinal();
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
                    mTiempoFinal();
                }
                vTextSubconjunto0 += "}\n";
                vTextAreaSubconjuntos0.append(vConteoSubconjSuma0 + vTextSubconjunto0);
            }
            return;
        }
        for (int i = vPosInicial; i <= vConjunto.length - vLongitud; i++)
        {
            mTiempoFinal();
            if (vPausar)
            {
                break;
            }
            vSubconjunto[vSubconjunto.length - vLongitud] = vConjunto[i];
            mProcesarInfor(vConjunto, vSubconjunto, vLongitud - 1, i + 1);
        }
    }

    

    ////////////////////////// ^ PARTE LOCAL ^ ////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void run()
    {
        vInicioTiempo = System.nanoTime();
        mComenzar(new CGenerar().mGenerarNoRepe(vNumMax));
        mTiempoFinal();
        vBotonDetener.setEnabled(false);
        vBotonGenerador.setEnabled(true);

    }

}
