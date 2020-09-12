/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import principal.Calculator;

/**
 *
 * @author rosal
 */
public class Division extends Thread
{

    @Override
    public void run()
    {
        Calculator.rD.setText(Calculator.a + " / " + Calculator.b
                + " = " +String.valueOf(dividir(Calculator.a, Calculator.b)));
    }

    private Object dividir(double a, double b)
    {
        return (a == 0 || b == 0) ? 0 : a / b;
    }
}
