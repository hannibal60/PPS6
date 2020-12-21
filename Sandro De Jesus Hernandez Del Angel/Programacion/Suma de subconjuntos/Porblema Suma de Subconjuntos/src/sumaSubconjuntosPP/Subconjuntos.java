/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaSubconjuntosPP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saipr
 */
public class Subconjuntos implements Runnable
{

    private int conjunto[];
    private int sumD;
    private int total;

    @Override
    public void run()
    {
        subconjuntos();
    }

    private void subconjuntos()
    {
        System.out.println(">>>Inicie Subconjuntos");
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        int sum = 1;
        Interfaz.jtaTodos.append(String.valueOf(sum) + ".- { }\n");
        double tIni = System.nanoTime();
        for (int x : getConjunto())
        {
            Interfaz.lblTmpNoSuman1.setText("Tiempo: " + PPSubconjuntos.timeNanoToSeconds(tIni, System.nanoTime()) + "'s");
            int n = subsets.size();
            for (int i = 0; i < n; i++)
            {
                ArrayList<Integer> aux = new ArrayList(subsets.get(i));
                aux.add(x);
                subsets.add(aux);
                int add = 0;
                String ssAux = "";
                ssAux += "{ ";
                for (int j = 0; j < aux.size(); j++)
                {
                    if (j == aux.size() - 1)
                    {
                        ssAux += aux.get(j);
                    } else
                    {
                        ssAux += aux.get(j) + ", ";
                    }
                    add += aux.get(j);
                }
                ssAux += " }\n";
                //--> Aqui imprime el resultado
                sum++;
                Interfaz.jtaTodos.append(String.valueOf(sum) + ".- " + ssAux);
                Interfaz.lblTodosSubconjuntos.setText("No. Resultados: " + sum);
            }
        }
        Interfaz.lblTmpNoSuman1.setText("Tiempo: " + PPSubconjuntos.timeNanoToSeconds(tIni, System.nanoTime()) + "'s Terminado");
        System.out.println(">>>Termine Subconjuntos");
    }

    public Subconjuntos(int arr[], int sum)
    {
        this.conjunto = arr;
        this.sumD = sum;
    }

    /**
     * @return the conjunto
     */
    public int[] getConjunto()
    {
        return conjunto;
    }

    /**
     * @param conjunto the conjunto to set
     */
    public void setConjunto(int[] conjunto)
    {
        this.conjunto = conjunto;
    }

    /**
     * @return the sumD
     */
    public int getSumD()
    {
        return sumD;
    }

    /**
     * @param sumD the sumD to set
     */
    public void setSumD(int sumD)
    {
        this.sumD = sumD;
    }

    /**
     * @return the total
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total)
    {
        this.total = total;
    }

}
