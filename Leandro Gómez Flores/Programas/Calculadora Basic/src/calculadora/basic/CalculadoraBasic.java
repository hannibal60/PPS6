/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import lecturas.*;

/**
 *
 * @author leand
 */
public class CalculadoraBasic
{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static float vResultado;
    private static float vNumeros[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        mOpciones();
    }

    private static void mOpciones()
    {
        System.out.println("Eliga una opción a realizar:\n");
        String vOpciones[] =
        {
            "1. Sumar",
            "2. Resatar",
            "3. Multiplicar",
            "4. Dividir"
        };
        for (String vOpcione : vOpciones)
        {
            System.out.println(vOpcione);
        }

        int vNumOpcion;
        do
        {
            System.out.println("\nEscriba el número de la opción:");
            vNumOpcion = Lecturas.entero(true);
            if (vNumOpcion >= 1 && vNumOpcion <= 4)
            {
                if (vNumOpcion == 4)
                {
                    vNumeros = new float[2];
                } else
                {
                    System.out.println("Cuántos números ocuparas?:");
                    int vCuentosNumeros = Lecturas.entero(true);
                    vNumeros = new float[vCuentosNumeros];
                }
                System.out.println("\n--------------------------------\n");
                for (int i = 0; i < vNumeros.length; i++)
                {

                    do
                    {
                        System.out.println("Dame el número " + (i + 1) + ":");
                        vNumeros[i] = Lecturas.floting();
                    } while (vNumeros[i] == -1);

                }
                switch (vNumOpcion)
                {
                    case 1:
                        mSumar();
                        break;
                    case 2:
                        mRestar();
                        break;
                    case 3:
                        mMultiplicar();
                        break;
                    case 4:
                        mDividir();
                        break;
                    default:
                        System.err.println("ERROR...\n");
                }
            } else
            {
                System.err.println("----------------------------------------\nPor favor elija una opción que este en el menú.");
            }
        } while (!(vNumOpcion >= 1 && vNumOpcion <= 4));
        System.out.println("\nFin de los cálculos.");
    }

    public static void mPulsarTeclas(java.awt.event.KeyEvent evt)
    {
        System.out.println(evt.getKeyChar());
    }

    private static float mSumar()
    {
        vResultado = vNumeros[0];
        System.out.println("\nEstructura de tú suma:");
        for (int i = 0; i < vNumeros.length; i++)
        {
            if (i < vNumeros.length - 1)
            {
                System.out.print(vNumeros[i] + " + ");
            } else
            {
                System.out.print(vNumeros[i]);
            }
            if (i != 0)
            {
                vResultado += vNumeros[i];
            }
        }
        return vResultado;
    }

    private static float mRestar()
    {
        vResultado = vNumeros[0];
        System.out.println("\nEstructura de tú resta:");
        for (int i = 0; i < vNumeros.length; i++)
        {
            if (i < vNumeros.length - 1)
            {
                System.out.print(vNumeros[i] + " - ");
            } else
            {
                System.out.print(vNumeros[i]);
            }
            if (i != 0)
            {
                vResultado -= vNumeros[i];
            }
        }
        System.out.println("\nResultado: " + vResultado);
        return vResultado;
    }

    private static float mMultiplicar()
    {
        vResultado = vNumeros[0];
        System.out.println("\nEstructura de tú multiplicación:");
        for (int i = 0; i < vNumeros.length; i++)
        {
            if (i < vNumeros.length - 1)
            {
                System.out.print(vNumeros[i] + " x ");
            } else
            {
                System.out.print(vNumeros[i]);
            }
            if (i != 0)
            {
                vResultado *= vNumeros[i];
            }
        }
        System.out.println("\nResultado: " + vResultado);
        return vResultado;
    }

    private static float mDividir()
    {
        System.out.println("\nEstructura de tú divición:");
        System.out.println(vNumeros[0] + " / " + vNumeros[1] + "\n");
        vResultado = vNumeros[0] / vNumeros[1];
        System.out.println("Resultado: " + vResultado);
        return vResultado;
    }

}
