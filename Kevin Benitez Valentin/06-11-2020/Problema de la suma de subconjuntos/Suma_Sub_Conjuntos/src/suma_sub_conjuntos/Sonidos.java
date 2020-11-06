/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_sub_conjuntos;

import java.applet.AudioClip;

/**
 *
 * @author Kevin Benitez
 */
public class Sonidos
{
    public void incorrect()
    {
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/alarma.wav"));
        sonido.play();
    }
}
