/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcula;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David Vergara
 */
public class Calcula
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double num1, num2;
        do
        {
            opcion = opcionesInicio();

            switch (opcion)
            {
                case 1:
                    System.out.println("Estas en el apartado sumar\n");
                    System.out.println("Dame el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("El Resultado es: " + sumar(num1, num2));
                    System.out.println("Presione cualquier tecla para continuar");
                    System.in.read();
                    break;
                case 2:
                    System.out.println("Estas en el apartado restar\n");
                    System.out.println("Dame el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("El Resultado es: " + restar(num1, num2));
                    System.out.println("Presione cualquier tecla para continuar");
                    System.in.read();
                    break;
                case 3:

                    System.out.println("Estas en el apartado multiplicar\n");
                    System.out.println("Dame el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("El Resultado es: " + multiplicar(num1, num2));
                    System.out.println("Presione cualquier tecla para continuar");
                    System.in.read();
                    break;
                case 4:
                    System.out.println("Estas en el apartado Dividir\n");
                    System.out.println("Dame el primer numero");
                    num1 = sc.nextDouble();
                    System.out.println("Dame el segundo numero");
                    num2 = sc.nextDouble();
                    System.out.println("El Resultado es: " + dividir(num1, num2));
                    System.out.println("Presione cualquier tecla para continuar");
                    System.in.read();
                case 0:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static int opcionesInicio()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingresa la opcion correspondiente: ");
        System.out.println("[1] sumar");
        System.out.println("[2] restar");
        System.out.println("[3] multiplicar");
        System.out.println("[4] dividir");
        System.out.println("[0] Salir");
        System.out.println("");
        return sc.nextInt();
    }

    public static double sumar(double num1, double num2)
    {
        double res = 0;
        res = num1 + num2;
        return res;
    }

    public static double restar(double num1, double num2)
    {
        double res = 0;
        res = num1 - num2;
        return res;
    }

    public static double multiplicar(double num1, double num2)
    {
        double res = 0;
        res = num1 * num2;
        return res;
    }

    public static double dividir(double num1, double num2)
    {
        double res = 0;

        if (num2 == 0)
        {
            System.out.println("No se puede dividir entre cero");

        } else
        {
            res = num1 / num2;
        }
        return res;
    }

}
