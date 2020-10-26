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
public class CHumedad
{

    public static void mHumedadC()
    {
        if (vHumedad >= 100)
        {
            vHumedad = 100;
        } else
        {
            if (vHumedad <= 0)
            {
                vHumedad = 0;
            }
        }
    }

    public static void mHumedad()
    {
        if (vHumedad < 50)
        {
            switch ((int) vHumedad)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    vSalud -= Math.random() * 40 + 1;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    vSalud -= Math.random() * 25 + 1;
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    vSalud -= Math.random() * 10 + 1;
                    break;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    vSalud -= Math.random() * 5 + 1;
                    break;
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (Math.random() * 2 + 1 == 1)
                    {

                        vSalud -= Math.random() * 2 + 1;

                    } else
                    {
                        vSalud += Math.random() * 5 + 1;
                        if (vSalud > 100)
                        {
                            vSalud = 100;
                        }
                    }
                    break;
            }
        } else
        {
            if (vHumedad > 50)
            {
                switch ((int) vHumedad)
                {
                    case 100:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                        vSalud -= Math.random() * 20 + 1;
                        break;
                    case 90:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                        vSalud -= Math.random() * 15 + 1;
                        break;
                    case 80:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                        vSalud -= Math.random() * 10 + 1;
                        break;
                    case 70:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                        vSalud -= Math.random() * 5 + 1;
                        break;
                    case 60:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 50:
                        if (Math.random() * 2 + 1 == 1)
                        {

                            vSalud -= Math.random() * 2 + 1;

                        } else
                        {
                            vSalud += Math.random() * 5 + 1;
                            if (vSalud > 100)
                            {
                                vSalud = 100;
                            }
                        }
                        break;
                }
            } else
            {
                vSalud += Math.random() * 15 + 1;
                if (vSalud > 100)
                {
                    vSalud = 100;
                }
            }
        }
    }
}
