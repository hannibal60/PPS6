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
public class Hilo_Resta extends Thread
{

    public double n1;
    public double n2;
    double resultado = 0;
    boolean suspender = false;

    public Hilo_Resta(double n1, double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run()
    {

        try
        {
            System.out.println("\n***Hilo Resta Iniciado***\n");
            resultado = n1 - n2;
            System.out.println("---CORRECTO---");
            synchronized (this)
            {
                while (suspender)
                {
                    wait();
                }
            }
            System.out.println("\n***Hilo Resta Finalizado***\n");
        } catch (InterruptedException e)
        {
            System.out.println("Hilo resta suspendido");
        }

    }
}
