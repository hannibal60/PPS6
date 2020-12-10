/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pBasura;

/**
 *
 * @author leand
 */
public class CBasura
{
    public void mResultado()
    {
        /*
        String vTexto = "";
        vTexto = "{";
        for (int i = 0; i < vConjunto.length; i++)
        {
            if (i == vConjunto.length - 1)
            {
                vTexto += " " + vConjunto[i];
            } else
            {
                vTexto += vConjunto[i] + ",";
            }
        }
        vTexto += "}";
        vTextFileConjuntos.setText(vTexto);
        vLabelTotal.setText("Total de subconjuntos: " + vSubconjuntosTotal.length + " | Subconjuntos que suman 0: " + vSubconjuntos.length);

        vTexto = "";
        for (int i = 0; i < vSubconjuntosTotal.length; i++)
        {
            vTexto += (i + 1) + ": {";
            for (int j = 0; j < vSubconjuntosTotal[i].length; j++)
            {
                if (j == vSubconjuntosTotal[i].length - 1)
                {
                    vTexto += " " + vSubconjuntosTotal[i][j];
                } else
                {
                    vTexto += vSubconjuntosTotal[i][j] + ",";
                }
            }
            vTexto += "}\n";
        }
        //vTextAreaTodoSubconjunto.setText(vTexto);
        vTextAreaTodoSubconjunto.setText(vTextSubconjuntoTotal);
        vTexto = "";
        
        for (int i = 0; i < vSubconjuntos.length; i++)
        {
            vTexto += (i + 1) + ": {";
            for (int j = 0; j < vSubconjuntos[i].length; j++)
            {
                if (j == vSubconjuntos[i].length - 1)
                {
                    vTexto += " " + vSubconjuntos[i][j];
                } else
                {
                    vTexto += vSubconjuntos[i][j] + ",";
                }
            }
            vTexto += "} = 0\n";
        }
        //vTextAreaSubconjuntos0.setText(vTexto);
        vTextAreaSubconjuntos0.setText(vTextSubconjunto0);

        vFinTiempo = System.nanoTime();
        double vResultadoTiempo = (double) ((((double) vFinTiempo) - ((double) vInicioTiempo)) / 1000000000);
        vLabelTiempoEjec.setText("Tiempo de ejecución: " + vResultadoTiempo + " segundos");
*/
    }
    
    /*
     protected void mAgregarSubConjunto(int vNuevoSubconjunto[])
    {
        int vTmp[][] = new int[vSubconjuntos.length + 1][];
        System.arraycopy(vSubconjuntos, 0, vTmp, 0, vSubconjuntos.length);
        vTmp[vSubconjuntos.length] = vNuevoSubconjunto;
        vSubconjuntos = vTmp;
    }

    protected void mAgregarSubConjuntoTotal(int vNuevoSubconjunto[])
    {
        int vTmp[][] = new int[vSubconjuntosTotal.length + 1][];
        System.arraycopy(vSubconjuntosTotal, 0, vTmp, 0, vSubconjuntosTotal.length);
        vTmp[vSubconjuntosTotal.length] = vNuevoSubconjunto;
        vSubconjuntosTotal = null;
        vSubconjuntosTotal = vTmp;

    }
    */
}
