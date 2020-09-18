/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planti;

import java.util.Scanner;

/**
 *
 * @author David Vergara
 */
public class Menu
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do
        {
            opcion = opcionesInicio();
            if (opcion == 1)
            {
                //Crar planta
                System.out.println("");
                System.out.println("Escribe el nombre de para tu planta: ");
                String nombre = sc.next();
                PlantaVirutal planta = new PlantaVirutal(nombre);

                do
                {
                    opcion = opcionesPlanta();

                    switch (opcion)
                    {
                        case 1:
                            System.out.println("Estado de la planta");
                            System.out.println(planta.getEstado());
                            break;
                        case 2:
                            int agua = opcionesRegar();
                            System.out.println("Regando...");
                            System.out.println(planta.regar(agua));
                            break;
                        case 3:
                            int sol = opcionesSol();
                            System.out.println("Tomando el sol");
                            System.out.println(planta.tomandoSol(sol));
                            break;
                        case 4:
                            System.out.println("Abonando");
                            System.out.println(planta.creciendo());
                            break;
                        case 9:
                            System.out.println("Su Planta se murio :( Asesino !!!");
                            break;
                        case 0:
                            System.out.println("Saliendo....");
                            break;
                        default:
                            System.out.println("Opcion invalida");
                    }
                } while (opcion != 0 && opcion != 9 && planta.estaVivo());
                System.out.println(planta.getEstado());
            }

        } while (opcion != 0);
    }

    public static int opcionesInicio()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingresa la opcion correspondiente: ");
        System.out.println("[1] Crear planta");
        System.out.println("[0] Salir");
        System.out.println("");
        return sc.nextInt();

    }

    public static int opcionesRegar()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("");
        do
        {
            System.out.println("Ingresa la opcion correspondiente: ");
            System.out.println("[1] 10%");
            System.out.println("[2] 25%");
            System.out.println("[3] 35%");
            System.out.println("");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }
     public static int opcionesSol()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("");
        do
        {
            System.out.println("Ingresa la opcion correspondiente: ");
            System.out.println("[1] Nublado 10%");
            System.out.println("[2] Caluroso 25%");
            System.out.println("[3] Intenso 45%");
            System.out.println("");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static int opcionesPlanta()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingresa la opcion correspondiente: ");
        System.out.println("[1] Mostar Estado");
        System.out.println("[2] Regar");
        System.out.println("[3] Dar Sol");
        System.out.println("[4] Abonar");
        System.out.println("[9] Matar Planta!");
        System.out.println("[0] Salir");
        System.out.println("");
        return sc.nextInt();
    }

}
