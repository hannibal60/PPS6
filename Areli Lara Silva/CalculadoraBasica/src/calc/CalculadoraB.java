/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author arele
 */
public class CalculadoraB
{

    
    
   public static int opcion,numero1,numero2,resultado;
    public static float resultado2;
    public static void main(String[] args) throws IOException {
        imprimeMenu();
        preguntaOpcion();
        while(opcion!=5){
            preguntaOperadores();
            switch(opcion){
            case 1:
                suma(numero1,numero2);
                break;
            case 2:
                resta(numero1,numero2);
                break;
            case 3:
                multiplica(numero1,numero2);
                break;
            case 4:
                divide(numero1,numero2);
                break;
            default:
                System.out.println("Opcion pulsada no valida");
                break;
            }
            System.out.println("");
            imprimeMenu();
            preguntaOpcion();
        }
        System.out.println("Fin de aplicacion");

    }
    private static void divide(int operador1, int operador2) {
        resultado2=(operador1/operador2);
        System.out.println("La division de "+operador1+" / "+operador2+" es "+resultado2);
       
    }
    private static void multiplica(int operador1, int operador2) {
        resultado=operador1*operador2;
        System.out.println("La multiplicacion de "+operador1+" * "+operador2+" es "+resultado);
       
    }
    private static void resta(int operador1, int operador2) {
        resultado=operador1-operador2;
        System.out.println("La resta de "+operador1+" - "+operador2+" es "+resultado);
       
    }
    private static void suma(int operador1, int operador2) {
        resultado=operador1+operador2;
        System.out.println("La suma de "+operador1+" + "+operador2+" es "+resultado);
       
    }
    private static void preguntaOperadores() throws  IOException {
        System.out.println("Operador1 ?");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        numero1=Integer.parseInt(br1.readLine());
        System.out.println("Operador2 ?");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        numero2=Integer.parseInt(br2.readLine());
    }
    private static void preguntaOpcion() throws  IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        opcion=Integer.parseInt(br.readLine());
       
    }
    private static void imprimeMenu() {
        System.out.println("Menu Opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
       
    }

}
