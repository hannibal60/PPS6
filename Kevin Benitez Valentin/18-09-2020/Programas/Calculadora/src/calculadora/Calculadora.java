/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Kevin Benitez
 */
public class Calculadora
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Funciones func = new Funciones();
        Scanner teclado = new Scanner(System.in);
        int opc = 0;
        double numero1 = 0, numero2 = 0, resultado = 0;

        System.out.println("--CALCULADORA--\n"
                + "1.- Suma\n"
                + "2.- Resta\n"
                + "3.- Multiplicacion\n"
                + "4.- Division\n"
                + "\n\nIngrese una opcion:");
        opc = teclado.nextInt();
        switch (opc)
        {
            case 1:
                System.out.println("Ingrese el primer numero");
                numero1 = teclado.nextDouble();
                System.out.println("Ingrese el segundo numero");
                numero2 = teclado.nextDouble();
                resultado = func.suma(numero1, numero2);
                if (resultado > 0)
                {
                    System.out.println("El resultado de la suma es: " + resultado);
                } else

                {
                    System.out.println("Ocurrio un error en la suma, verifica");
                }

                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                numero1 = teclado.nextDouble();
                System.out.println("Ingrese el segundo numero");
                numero2 = teclado.nextDouble();
                resultado = func.resta(numero1, numero2);
                if (resultado >= 0)
                {
                    System.out.println("El resultado de la resta es: " + resultado);
                } else
                {
                    System.out.println("Ocurrio un error en la resta, verifica");
                }

                break;
            case 3:
                System.out.println("Ingrese el primer numero");
                numero1 = teclado.nextDouble();
                System.out.println("Ingrese el segundo numero");
                numero2 = teclado.nextDouble();
                resultado = func.muliplicacion(numero1, numero2);
                if (resultado > 0)
                {
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                } else
                {
                    System.out.println("Ocurrio un error en la multiplicacion, verifique");
                }

                break;
            case 4:
                System.out.println("Ingrese el primer numero");
                numero1 = teclado.nextDouble();
                System.out.println("Ingrese el segundo numero");
                numero2 = teclado.nextDouble();
                resultado = func.division(numero1, numero2);
                if (resultado > 0)
                {
                    System.out.println("El resultado de la division es: " + resultado);
                } else

                {
                    System.out.println("Ocurrio un error en la division, verifique");
                }

                break;
            default:
                System.out.println("Error, opcion erronea");
        }
    }

}
