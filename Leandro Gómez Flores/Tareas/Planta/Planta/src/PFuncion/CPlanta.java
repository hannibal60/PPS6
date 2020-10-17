/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFuncion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author leand
 */
public class CPlanta
{

////////////////////////////////////////////////
    public static String vClima = "";
    public static float vAgua = 0;
    public static float vHumedad = 50;
    public static String vCrecimiento[] =
    {
        "Bebe", "Niño", "Joven", "Adulto", "Viejo"
    };
    static int vSalud = 100;
    static int vGradosDia;
    static String vEstado[] =
    {
        "Germinación", "Crecimiento", "Floración", "Cosechar"
    };

    public static int vTiempoEspera = 1500;
////////////////////////////////////////////////
    static int vMes = 1;
    static int vDiaM = 1;

    static java.awt.Frame vFrame;
    static javax.swing.JButton vBotonCosechaH;

    /**
     * @param args the command line arguments
     */
    static private javax.swing.JTextArea vTextArea;

    public CPlanta(javax.swing.JTextArea vTextArea, int vMes, int vDia)
    {
        this.vTextArea = vTextArea;
        this.vMes = vMes;
        this.vDiaM = vDia;
    }

    static boolean vCosecha = false;
    static boolean vGerminacionLenta = false;
    static boolean vCambioClima = false;
    static int vClimaNum; //0 es helado, 1 frio, 2 fresca, 3 comoda, 4 caliente
    static int vConteoGerminacion = 0;
    static int vConteoCrecimiento = 0;
    static int vConteoMes = 0;
    static boolean vMuerta = false;
    static int vNumDiasGermina = 0;

    public void mIniciar()
    {
        do
        {
            for (int i = vMes; i <= 12; i++)
            {

                if (!vMuerta)
                {
                    System.out.println("Holas");
                    switch (i)
                    {
                        case 4:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Comoda | 18° a 24°";
                                vGradosDia = (int) (Math.random() * (24 - 18 + 1) + 18);
                            }
                        case 6:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Comoda | 18° a 24°";
                                vGradosDia = (int) (Math.random() * (24 - 18 + 1) + 18);
                            }
                        case 9:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Comoda | 18° a 24°";
                                vGradosDia = (int) (Math.random() * (24 - 18 + 1) + 18);
                            }
                            vClimaNum = 3;
                        case 11:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Fria | 7° a 13°";
                                vGradosDia = (int) (Math.random() * (13 - 7 + 1) + 7);
                                vGerminacionLenta = true;
                                vClimaNum = 1;
                            }
                            for (int j = vDiaM; j < 30; j++)
                            {
                                mPlantaFrijol(i, j);
                                if (vMuerta)
                                {
                                    break;
                                }
                            }
                            break;
                        case 1:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Helado | -9°";
                                vGradosDia = -(int) (Math.random() * (9 - 0 + 1) + 0);
                                vGerminacionLenta = true;
                                vClimaNum = 0;
                            }
                        case 3:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Fria | 7° a 13°";
                                vGradosDia = (int) (Math.random() * (13 - 7 + 1) + 7);
                                vGerminacionLenta = true;
                                vClimaNum = 1;
                            }
                        case 5:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Caliente | 24° a 29°";
                                vGradosDia = (int) (Math.random() * (24 - 18 + 1) + 18);
                                vClimaNum = 4;
                            }
                        case 7:
                        case 8:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Comoda | 18° a 24°";
                                vGradosDia = (int) (Math.random() * (24 - 18 + 1) + 18);
                                vClimaNum = 3;
                            }
                        case 10:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Fresca | 13° a 18°";
                                vGradosDia = (int) (Math.random() * (18 - 13 + 1) + 13);
                                vClimaNum = 2;
                            }
                        case 12:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Helado | -9°";
                                vGradosDia = -(int) (Math.random() * (9 - 0 + 1) + 0);
                                vGerminacionLenta = true;
                                vClimaNum = 0;
                            }
                            for (int j = vDiaM; j < 31; j++)
                            {
                                mPlantaFrijol(i, j);
                                if (vMuerta)
                                {
                                    break;
                                }
                            }
                            break;
                        case 2:
                            if (!vCambioClima)
                            {
                                vCambioClima = true;
                                vClima = "Muy fria | 0° a 7°";
                                vGradosDia = (int) (Math.random() * (7 - 0 + 1) + 0);
                                vGerminacionLenta = true;
                                vClimaNum = 5;
                            }
                            for (int j = vDiaM; j < 28; j++)
                            {
                                mPlantaFrijol(i, j);
                                if (vMuerta)
                                {
                                    break;
                                }
                            }
                            break;
                        default:
                            System.out.println("Error de dia");
                    }
                    vDiaM = 1;
                    vCambioClima = false;
                } else
                {
                    new CMuerta(vFrame, true).setVisible(true);
                    break;
                }
                if (vConteoGerminacion >= vNumDiasGermina)
                {
                    vConteoMes++;

                }
            }
            if (vMuerta)
            {
                vTextArea.setText("	        Game over\n"
                        + "\n"
                        + "\n"
                        + "                   Tú planta sirve para composta");
                break;
            }
            vMes = 1;
        } while (true);

    }

    static boolean vGer = false;

    static String vTexto = "";

    private void mPlantaFrijol(int vMes, int vDia)
    {
        if (!vGer)
        {
            if (vGerminacionLenta)
            {
                vNumDiasGermina = (int) (Math.random() * (30 - 15 + 1) + 15);
            } else
            {
                vNumDiasGermina = (int) (Math.random() * (14 - 4 + 1) + 4);
            }
            vGer = true;
        }

        if (vSalud <= 0)
        {
            vSalud = 0;
            vMuerta = true;
        }
        vHumedad += vAgua * 10;
        vAgua = 0;

        CHumedad.mHumedad();

        CCrecimiento.mCrecimiento();

        CHumedad.mHumedadC();

        CTexto.mMostrarTexto(vMes, vDia);

        vTextArea.setText(vTexto);

        vConteoCrecimiento++;
        try
        {
            Thread.sleep(vTiempoEspera);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(CPlanta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
