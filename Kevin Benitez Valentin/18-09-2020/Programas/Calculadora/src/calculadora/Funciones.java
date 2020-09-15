/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Kevin Benitez
 */
public class Funciones
{

    public Funciones()
    {
    }

    /**
     * Metodo encargado de realizar la suma de 2 numeros
     * @param numero1 numero 1 a sumar
     * @param numero2 numero 2 a sumar
     * @return resultado de los 2 numeros operados
     */
    public double suma(double numero1, double numero2)
    {
        double resultado = 0;
        try
        {

            resultado = numero1 + numero2;

        } catch (Exception e)
        {
            resultado = 0;
        }
        return resultado;
    }

    /**
     * Metodo encargado de realizar la resta de 2 numeros
     * @param numero1 numero 1 a restar
     * @param numero2 numero 2 a restar
     * @return resultado de los 2 numeros operados
     */
    public double resta(double numero1, double numero2)
    {
        double resultado = 0;
        try
        {
            if (numero1 > 0 && numero2 > 0)
            {
                resultado = numero1 - numero2;
            }
        } catch (Exception e)
        {
            resultado = 0;
        }

        return resultado;
    }

    /**
     * Metodo encargado de realizar la multiplicacion de 2 numeros
     * @param numero1 numero 1 a multiplicar
     * @param numero2 numero 2 a multiplicar
     * @return resultado de los 2 numeros operados
     */
    public double muliplicacion(double numero1, double numero2)
    {
        double resultado = 0;
        try
        {
            if (numero1 >= 0 && numero2 >= 0)
            {
                resultado = numero1 * numero2;
            }
        } catch (Exception e)
        {
            resultado = 0;
        }
        return resultado;
    }

    /**
     * Metodo encargado de realizar la division de 2 numeros
     * @param numero1 numero 1 a multiplicar
     * @param numero2 numero 2 a multiplicar
     * @return resultado de los 2 numeros operados
     */
    public double division(double numero1, double numero2)
    {
        double resultado = 0;
        try
        {
            if (numero1 >= 1 && numero2 >= 1)
            {
                resultado = numero1 / numero2;
            }
        } catch (Exception e)
        {
            resultado = 0;
        }
        return resultado;
    }
}
