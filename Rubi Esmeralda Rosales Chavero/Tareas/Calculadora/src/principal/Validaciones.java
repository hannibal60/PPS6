/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.event.KeyEvent;

/**
 *
 * @author rosal
 */
public class Validaciones
{
    public static void validaNumero(KeyEvent ke)
    {
        if ((ke.getKeyChar() < '0' || ke.getKeyChar() > '9') && ke.getKeyChar() != '.')
        {
            ke.setKeyChar((char) 8);
        }
    }
}
