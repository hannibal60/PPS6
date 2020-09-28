/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMetodos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author leand
 */
public class CalculadoraBasic extends Thread
{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    float vNumPrimero;
    float vNumSegundo;
    javax.swing.JTextArea vTextArea;

    public void Calcular(float vNumPrimero, float vNumSegundo, javax.swing.JTextArea vTextArea)
    {
        this.vNumPrimero = vNumPrimero;
        this.vNumSegundo = vNumSegundo;
        this.vTextArea = vTextArea;
        mProceso();
    }

    private void mProceso()
    {
        vTextArea.setText("");
        Thread vHilo1 = new Thread(new Runnable()
        {
            String v;

            @Override
            public void run()
            {
                mSumar(vTextArea);

            }
        });
        vHilo1.start();
        Thread vHilo2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                mRestar(vTextArea);

            }
        });
        vHilo2.start();
        Thread vHilo3 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                mMultiplicar(vTextArea);

            }
        });
        vHilo3.start();
        Thread vHilo4 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                mDividir(vTextArea);

            }
        });
        vHilo4.start();

        vTextArea.setText(vTextArea.getText() + "\n\nFin de los cálculos.");
    }

    private synchronized void mSumar(javax.swing.JTextArea vTextAreaH)
    {

        vTextAreaH.setText(vTextAreaH.getText() + "\n" + String.valueOf(vNumPrimero) + " + " + String.valueOf(vNumSegundo) + " = " + (vNumPrimero + vNumSegundo));
    }

    private synchronized void mRestar(javax.swing.JTextArea vTextAreaH)
    {
        vTextAreaH.setText(vTextAreaH.getText() + "\n" + String.valueOf(vNumPrimero) + " - " + String.valueOf(vNumSegundo) + " = " + (vNumPrimero - vNumSegundo));
    }

    private synchronized void mMultiplicar(javax.swing.JTextArea vTextAreaH)
    {
        vTextAreaH.setText(vTextAreaH.getText() + "\n" + String.valueOf(vNumPrimero) + " x " + String.valueOf(vNumSegundo) + " = " + (vNumPrimero * vNumSegundo));
    }

    private synchronized void mDividir(javax.swing.JTextArea vTextAreaH)
    {
        float vNum1 = vNumPrimero;
        float vNum2 = vNumSegundo;

        if (vNum1 != 0 && vNum2 != 0)
        {
            vTextAreaH.setText(vTextAreaH.getText() + "\n" + String.valueOf(vNumPrimero) + " / " + String.valueOf(vNumSegundo) + " = " + (vNumPrimero / vNumSegundo));

        } else
        {
            if (vNum1 == 0 && vNum2 == 0)
            {
                vTextAreaH.setText(vTextAreaH.getText() + "\n" + "No se puede dividir 0 / 0");
            } else
            {
                vTextAreaH.setText(vTextAreaH.getText() + "\n" + vNum1 + " / " + vNum2 + " = ");
                if (vNum1 != 0 && vNum2 == 0)
                {
                    vTextAreaH.setText(vTextAreaH.getText() + "No se puede dividir entre 0");
                } else
                {
                    if (vNum1 == 0 && vNum2 != 0)
                    {
                        vTextAreaH.setText(vTextAreaH.getText() + "" + "0");
                    }
                }
            }
        }
    }

}
