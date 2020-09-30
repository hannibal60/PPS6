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
public class Hilo_Multiplicacion extends Thread
{

    public double n1;
    public double n2;
    double resultado;
    boolean suspender = false;

    public Hilo_Multiplicacion(double n1, double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run()
    {

        try
        {
            System.out.println("\n***Hilo Multiplicacion Iniciado***\n");
            resultado = n1 * n2;
            System.out.println("--CORRECTO---");
            System.out.println("\n***Hilo Multiplicacion Finalizado***\n");
            synchronized(this)
            {
                while (suspender)
                {
                    wait();
                }
            }
        } catch (InterruptedException e)
        {
            System.out.println("Hilo multiplicacion interrumpido");
        }

    }
}
