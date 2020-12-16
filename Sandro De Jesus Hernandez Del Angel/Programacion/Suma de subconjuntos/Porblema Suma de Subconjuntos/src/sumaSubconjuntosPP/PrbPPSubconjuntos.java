/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntosPP;

import java.util.Arrays;

/**
 * @author saipr
 */
public class PrbPPSubconjuntos
{

    public static void main(String[] args)
    {
        //Variables
        int set[];
        double tIni;
        double tIniCalc;
        double tFinCalc;
        double tFinLlenado;
        //-->Inicio del programa
        //Llenado del array
        tIni = System.nanoTime();
        set = PPSubconjuntos.llenarArray(20);
        tFinLlenado = System.nanoTime();
        System.out.println("Su conjunto es " + Arrays.toString(set));
        //Suma de subconjuntos
        tIniCalc = System.nanoTime();
        PPSubconjuntos.iniSumSubconjuntos(set, 0);
        tFinCalc = System.nanoTime();
        //Tiempos de ejecucion
        System.out.println("Tamaño del conjunto: " + set.length);
        System.out.println("\nTiempos: Milisegundos");
        System.out.println("    Llenado del conjunto: " + PPSubconjuntos.timeNanoToMili(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + PPSubconjuntos.timeNanoToMili(tIniCalc, tFinCalc));
        
        System.out.println("\nTiempos: Segundos");
        System.out.println("    Llenado del conjunto: " + PPSubconjuntos.timeNanoToSeconds(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + PPSubconjuntos.timeNanoToSeconds(tIniCalc, tFinCalc));
        
        System.out.println("\nTiempos: Minutos");
        System.out.println("    Llenado del conjunto: " + PPSubconjuntos.timeNanoToMin(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + PPSubconjuntos.timeNanoToMin(tIniCalc, tFinCalc));
//Fin del programa<--
    }

}
