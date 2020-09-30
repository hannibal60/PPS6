/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_paralela;

/**
 *
 * @author Kevin Benitez
 */
public class Hilo_Division extends Thread
{

    public double n1;
    public double n2;
    double resultado;
    boolean suspender = false;

    public Hilo_Division(double n1, double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run()
    {
        try
        {
            System.out.println("\n***Hilo Division Iniciado***\n");
            if (n1 != 0 && n2 != 0)
            {
                resultado = n1 / n2;
                System.out.println("--CORRECTO--");
            } else
            {
                if (n1 == 0 && n2 == 0)
                {
                    resultado = 0;
                } else
                {
                    if (n1 != 0 && n2 == 0)
                    {
                        resultado = 0;
                    } else
                    {
                        if (n1 == 0 && n2 != 0)
                        {
                            resultado = 0;
                        }
                    }
                }
            }
            synchronized (this)
            {
                while (suspender)
                {
                    wait();
                }
            }

        } catch (InterruptedException e)
        {
            System.out.println("Hilo division interumpido");
        }

    }

}
