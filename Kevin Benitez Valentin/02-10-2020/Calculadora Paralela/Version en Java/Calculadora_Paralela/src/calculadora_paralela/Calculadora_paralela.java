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
public class Calculadora_paralela
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Validaciones captura = new Validaciones();
        Hilo_Suma suma = null;
        Hilo_Resta resta = null;
        Hilo_Multiplicacion multi = null;
        Hilo_Division divi = null;
        double num1 = 0, num2 = 0;
        boolean op1 = false, op2 = false, op3 = false, op4 = false;
        boolean n1c = false, n2c = false;
        System.out.println("***Calculadora Aritmetica Paralela***\n");

        do
        {
            do
            {
                Object[] num1_pr = captura.lee_doubles(1);
                if (num1_pr != null)
                {
                    num1 = (double) num1_pr[0];
                    n1c = (boolean) num1_pr[1];
                }

            } while (n1c != true);

            do
            {
                Object[] num1_pr = captura.lee_doubles(2);
                num2 = (double) num1_pr[0];
                n2c = (boolean) num1_pr[1];
            } while (n2c != true);

            //declaracion de hilos//
            if (op1 == false)
            {
                suma = new Hilo_Suma(num1, num2);
                suma.start();
            }
            if (op2 == false)
            {
                resta = new Hilo_Resta(num1, num2);
                resta.start();
            }
            if (op3 == false)
            {
                multi = new Hilo_Multiplicacion(num1, num2);
                multi.start();
            }
            if (op4 == false)
            {
                divi = new Hilo_Division(num1, num2);
                divi.start();
            }

            ////////////////////////
            //Arrancando hilos//
            ////////////////////
            try //esperamos a que todos los hilos esten completos y cerramos
            {
                suma.join();
                resta.join();
                multi.join();
                divi.join();
                if (op1 == false)
                {
                    System.out.println("\n\nLa suma de: " + num1 + " + " + num2 + " es: " + suma.resultado);
                    op1 = true;
                    Thread.sleep(800);
                }
                if (op2 == false)
                {
                    System.out.println("\nLa resta de: " + num1 + " - " + num2 + " es: " + resta.resultado);
                    op2 = true;
                    Thread.sleep(800);
                }
                if (op3 == false)
                {
                    System.out.println("\nLa multiplicacion de: " + num1 + " * " + num2 + " es: " + multi.resultado);
                    op3 = true;
                    Thread.sleep(800);
                }
                if (op4 == false)
                {
                    if (divi.resultado != 0)
                    {
                        System.out.println("\nLa division de: " + num1 + " / " + num2 + " es: " + divi.resultado);
                        op4 = true;
                    } else
                    {
                        System.out.println("Error de division, se reiniciara el hilo");
                    }
                }

            } catch (InterruptedException e)
            {

            }
        } while (op4 != true);

    }

}
