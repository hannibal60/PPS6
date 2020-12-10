/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pBasura;

import java.math.BigInteger;

/**
 *
 * @author leand
 */
public class NewClass
{
    
    
    public static void main(String[] args)
    {
        System.out.println(mCalcularSubconjuntos(500));
        System.out.println("g");
    }
    public static BigInteger mCalcularSubconjuntos(int vLongConjunto)
    {
        BigInteger suma = new BigInteger("0");
        for (int i = vLongConjunto; i >= 2; i--)
        {
            suma = suma.add(combinaciones(vLongConjunto, i));
        }
        return suma;
    }

    public static BigInteger combinaciones(int vLongConjunto, int vLong)
    {
        return factorial(vLongConjunto).divide((factorial(vLongConjunto - vLong).multiply(factorial(vLong))));
    }

    public static BigInteger factorial(int vLong)
    {
        BigInteger resultado = new BigInteger("1");
        for (int i = 2; i <= vLong; ++i)
        {
            resultado = resultado.multiply(new BigInteger(String.valueOf(i)));
        }
        return resultado;
    }
}
