/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pGenerarConjunto;

import java.util.HashSet;
import java.util.Set;
import static pFrame.FEstructurado.*;
import static pFrame.FParalelo.*;

/**
 *
 * @author leand
 */
public class CGenerar
{

    public long[] mGenerarNoRepe(long vNumMax)
    {
        long vConjunto[];
        long vLongitud;
        if (vNumRandomE&&vNumRandomP)
        {
            vLongitud = (int) Math.floor(Math.random() * (vNumMax - 3 + 1) + 3);
        } else
        {
            vLongitud = vNumMax;
        }
        
        if (vLongitud >= 2147483639)
        {
            vLongitud = 147483600;
        }
        vConjunto = new long[(int) vLongitud];
        long vLongNumAleatorio = (vLongitud + (((vLongitud / 2) / 2) / 2));
        Set<Integer> vConjuntoList = new HashSet<>();

        int vCont = 0;
        while (vConjuntoList.size() < vLongitud)
        {
            int vNumRandom = (int) (Math.random() * (vLongNumAleatorio - (-vLongNumAleatorio)) + (-vLongNumAleatorio));

            if (!vConjuntoList.contains(vNumRandom))
            {
                vConjuntoList.add(vNumRandom);
                vConjunto[vCont] = vNumRandom;
                vCont++;
            }
        }

        return vConjunto;
    }
}
