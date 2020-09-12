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
public class Suma extends Thread
{

    @Override
    public void run()
    {
        Calculator.rS.setText(Calculator.a + " + " + Calculator.b
                + " = " + String.valueOf(Calculator.a + Calculator.b));
    }
}
