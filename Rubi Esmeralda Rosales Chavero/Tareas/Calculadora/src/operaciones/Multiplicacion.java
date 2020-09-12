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
public class Multiplicacion extends Thread
{
    @Override
    public void run()
    {
        Calculator.rM.setText(Calculator.a + " * " + Calculator.b
                + " = " +String.valueOf(Calculator.a*Calculator.b));
    }
}
