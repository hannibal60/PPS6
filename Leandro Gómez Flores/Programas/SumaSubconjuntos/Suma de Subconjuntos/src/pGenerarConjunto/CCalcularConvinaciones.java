/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pGenerarConjunto;

import java.math.BigInteger;

/**
 *
 * @author leand
 */
public class CCalcularConvinaciones
{
    public static BigInteger mCalcularSubconjuntos(int vLongConjunto)
    {
        BigInteger vSuma = new BigInteger("0");
        for (int i = vLongConjunto; i >= 2; i--)
        {
            vSuma = vSuma.add(combinaciones(vLongConjunto, i));
        }
        return vSuma;
    }

    public static BigInteger combinaciones(int vLongConjunto, int vLong)
    {
        return mFactorial(vLongConjunto).divide((mFactorial(vLongConjunto - vLong).multiply(mFactorial(vLong))));
    }

    public static BigInteger mFactorial(int vLong)
    {
        BigInteger vResultado = new BigInteger("1");
        for (int i = 2; i <= vLong; ++i)
        {
            vResultado = vResultado.multiply(new BigInteger(String.valueOf(i)));
        }
        return vResultado;
    }
}
