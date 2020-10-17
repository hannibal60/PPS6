/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFuncion;

import static PFuncion.CPlanta.*;

/**
 *
 * @author leand
 */
public class CCrecimiento
{

    public static void mCrecimiento()
    {
        if (vConteoCrecimiento >= 4)
        {
            switch (vClimaNum)
            {
                case 0://helado
                    vHumedad += Math.random() * 2 + 1;
                    break;
                case 1://frio
                    vHumedad += Math.random() * 1 + 1;
                    break;
                case 2://fresca
                    if (Math.random() * 2 + 1 == 0)
                    {
                        vHumedad += Math.random() * 1 + 1;
                    } else
                    {
                        vHumedad -= Math.random() * 2 + 1;
                    }
                    break;
                case 3://Comoda
                    if (Math.random() * 2 + 1 == 0)
                    {
                        vHumedad += Math.random() * 2 + 1;
                    } else
                    {
                        vHumedad -= Math.random() * 3 + 1;
                    }
                    break;
                case 4://caliente
                    vHumedad -= Math.random() * 5 + 1;
                    break;
                case 5://muy frio
                    vHumedad += Math.random() * 1 + 1;
                    break;
            }
            vConteoCrecimiento = 0;
        }
    }
}
