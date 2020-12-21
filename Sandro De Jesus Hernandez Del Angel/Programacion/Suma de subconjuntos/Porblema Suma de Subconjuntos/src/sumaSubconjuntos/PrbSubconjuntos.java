/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntos;

import java.util.Arrays;

/**
 *
 * @author saipr
 */
public class PrbSubconjuntos
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
        set = Subconjuntos.llenarArray(20);
        tFinLlenado = System.nanoTime();
        System.out.println("Su conjunto es " + Arrays.toString(set));
        //Suma de subconjuntos
        tIniCalc = System.nanoTime();
        Subconjuntos obj = new Subconjuntos(set);
        obj.iniSumSubconjuntos(set, 0);
        tFinCalc = System.nanoTime();
        //Tiempos de ejecucion
        System.out.println("\nTiempos: Milisegundos");
        System.out.println("    Llenado del conjunto: " + Subconjuntos.timeNanoToMili(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + Subconjuntos.timeNanoToMili(tIniCalc, tFinCalc));
        
        System.out.println("\nTiempos: Segundos");
        //System.out.println("    Llenado del conjunto: " + Subconjuntos.timeNanoToSeconds(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + Subconjuntos.timeNanoToSeconds(tIniCalc, tFinCalc));
        
        System.out.println("\nTiempos: Minutos");
        System.out.println("    Llenado del conjunto: " + Subconjuntos.timeNanoToMin(tIni, tFinLlenado));
        System.out.println("    Calculo subconjuntos: " + Subconjuntos.timeNanoToMin(tIniCalc, tFinCalc));
//Fin del programa<--
    }

}
