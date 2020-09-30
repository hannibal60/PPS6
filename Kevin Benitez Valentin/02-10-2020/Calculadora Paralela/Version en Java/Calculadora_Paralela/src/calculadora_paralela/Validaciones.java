/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_paralela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin Benitez
 */
public class Validaciones
{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Object[] lee_doubles(int n_d)
    {
        Object[] arr = new Object[2];
        double ret = 0;
        boolean correct = false;
        try
        {
            System.out.println("Ingrese el numero " + "[" + n_d + "] a operar");
            String numero = br.readLine();
            ret = Double.parseDouble(numero);
            correct = true;
            arr[0] = ret;
            arr[1] = correct;
        } catch (IOException e)
        {
            System.out.println("Error de entrada/salida");
        } catch (NumberFormatException e)
        {
            System.out.println("Error, numero invalido");
            arr[0] = ret;
            correct = false;
            arr[1] = correct;
        }
        return arr;
    }
}
