/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFuncion;

import static PFuncion.CPlanta.*;
import java.awt.Color;

/**
 *
 * @author leand
 */
public class CTexto
{

    public static void mMostrarTexto(int vMes, int vDia)
    {
        if (vConteoGerminacion <= vNumDiasGermina)
        {
            vTexto = ""
                    + "                    Salud de la planta: " + vSalud + "%\n"
                    + "\n                    Mes: " + vMes + "    =====    Dia: " + vDia
                    + "\n>Clima: " + vClima
                    + "\n>Grados del dia: " + vGradosDia + "°"
                    + "\n>Humedad: " + vHumedad
                    + "\n>Crecimiento: " + vCrecimiento[vConteoMes]
                    + "\n>Estado: " + vEstado[0];
            vConteoGerminacion++;
        } else
        {

            if (vConteoMes >= 0 && vConteoMes <= 2)
            {
                vTexto = ""
                        + "                    Salud de la planta: " + vSalud + "%\n"
                        + "\n                    Mes: " + vMes + "    =====    Dia: " + vDia
                        + "\n>Clima: " + vClima
                        + "\n>Grados del dia: " + vGradosDia + "°"
                        + "\n>Humedad: " + vHumedad
                        + "\n>Crecimiento: " + vCrecimiento[vConteoMes]
                        + "\n>Estado: " + vEstado[1];
            } else
            {
                if (vConteoMes == 3)
                {
                    vCosecha = true;
                    vTexto = ""
                            + "                    Salud de la planta: " + vSalud + "%\n"
                            + "\n                    Mes: " + vMes + "    =====    Dia: " + vDia
                            + "\n>Clima: " + vClima
                            + "\n>Grados de el dia: " + vGradosDia + "°"
                            + "\n>Humedad: " + vHumedad
                            + "\n>Crecimiento: " + vCrecimiento[vConteoMes]
                            + "\n>Estado: " + vEstado[2]
                            + "\n>La planta esta en estado de floración";

                } else
                {
                    if (vConteoMes == 4)
                    {
                        vDiaM++;
                        if (vDiaM == 24)
                        {
                            vCosecha = true;
                            vTiempoEspera = 4000;
                            vTexto = ""
                                    + "                    Salud de la planta: " + vSalud + "%\n"
                                    + "\n                    Mes: " + vMes + "    =====    Dia: " + vDia
                                    + "\n>Clima: " + vClima
                                    + "\n>Grados de el dia: " + vGradosDia + "°"
                                    + "\n>Humedad: " + vHumedad
                                    + "\n>Crecimiento: " + vCrecimiento[vConteoMes]
                                    + "\n>Estado: " + vEstado[3]
                                    + "\n>La planta contiene vainas de frijol";
                            vBotonCosechaH.setVisible(true);
                        }
                    } else
                    {
                        if (vConteoMes >= 5)
                        {
                            vSalud -= (int) (Math.random() * 3 + 1);
                            vTexto = ""
                                    + "                    Salud de la planta: " + vSalud + "%\n"
                                    + "\n                    Mes: " + vMes + "    =====    Dia: " + vDia
                                    + "\n>Clima: " + vClima
                                    + "\n>Grados de el dia: " + vGradosDia + "°"
                                    + "\n>Humedad: " + vHumedad
                                    + "\n>Crecimiento: " + vCrecimiento[4]
                                    + "\n>Estado: " + vEstado[3]
                                    + "\n>La planta contiene vainas de frijol"
                                    + "\n>La planta muere por vieja"
                                    + "\n>RECOGE TUS FRIJOLES.";
                            vBotonCosechaH.setBackground(new Color(255, 153, 153));
                        }
                    }
                }
            }
        }
    }
}
