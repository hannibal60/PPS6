/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;

import javax.swing.JLabel;
import static pFrame.FEstructurado.vLabelTiempoEjec;
import static pFrame.FParalelo.vLabelTiempoEjecPP;

/**
 *
 * @author leand
 */
public class CFormatoTiempo
{

    public static long vInicioTiempo;
    public static long vFinTiempo;

    public static void mTiempoFinalE()
    {
        mCalcularTiempo(vLabelTiempoEjec);
    }

    public static void mTiempoFinalPP()
    {
        mCalcularTiempo(vLabelTiempoEjecPP);
    }

    public static void mCalcularTiempo(JLabel vLabel)
    {
        vFinTiempo = System.nanoTime();
        double vResultado = (double) ((((double) vFinTiempo) - ((double) vInicioTiempo)) / 1000000000);
        vLabel.setText("Tiempo de ejecución: " + formatTime(vFinTiempo-vInicioTiempo));
//        vLabel.setText("Tiempo de ejecución: " + vResultado + " Segundos");
    }

    private static String formatTime(long nanoSeconds)
    {
        int vHora, vMinutos, vTmp, vTotalSegNoFrac;
        double vSegunTot, vSegundos;

        // Calculating hours, minutes and seconds 
        vSegunTot = (double) nanoSeconds / 1000000000.0;
        String s = Double.toString(vSegunTot);
        String[] arr = s.split("\\.");
        vTotalSegNoFrac = Integer.parseInt(arr[0]);
        vHora = vTotalSegNoFrac / 3600;
        vTmp = vTotalSegNoFrac % 3600;
        vMinutos = vTmp / 60;
        vSegundos = vTmp % 60;
        if (arr[1].contains("E"))
        {
            vSegundos = Double.parseDouble("." + arr[1]);
        } else
        {
            vSegundos += Double.parseDouble("." + arr[1]);
        }

        // Formatting the string that conatins hours, minutes and seconds 
        StringBuilder vResultado = new StringBuilder(".");
        String vSep = "", vSigSep = " y ";
        if (vSegundos > 0)
        {
            vResultado.insert(0, " segundos").insert(0, vSegundos);
            vSep = vSigSep;
            vSigSep = ", ";
        }
        if (vMinutos > 0)
        {
            if (vMinutos > 1)
            {
                vResultado.insert(0, vSep).insert(0, " min").insert(0, vMinutos);
            } else
            {
                vResultado.insert(0, vSep).insert(0, " min").insert(0, vMinutos);
            }
            vSep = vSigSep;
            vSigSep = ", ";
        }
        if (vHora > 0)
        {
            if (vHora > 1)
            {
                vResultado.insert(0, vSep).insert(0, " hora").insert(0, vHora);
            } else
            {
                vResultado.insert(0, vSep).insert(0, " hora").insert(0, vHora);
            }
        }
        return vResultado.toString();
    }
}
