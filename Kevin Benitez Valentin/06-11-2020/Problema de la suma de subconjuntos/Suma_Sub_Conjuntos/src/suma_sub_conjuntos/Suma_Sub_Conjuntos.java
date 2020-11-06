/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_sub_conjuntos;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Benitez
 */
public class Suma_Sub_Conjuntos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Hecho por mr.r4ms0n
        Sonidos sn = new Sonidos();
        int[] arr = null;
        int suma = 0;
        int opc;
        boolean listcorrect = false, sumcorrect = false, opccorrect = false;
        String s = "";
        String s1 = "";
        String s2 = "";
        Metodos_conj obj = new Metodos_conj();
        do
        {
            try
            {
                s = JOptionPane.showInputDialog(null, "                        Programa hecho por mr.r4ms0n"
                        + "\n\n               Problema de la Suma de Sub-Conjuntos\n"
                        + "\n\nIngrese la lista de numeros positivos a considerar, separados por comas:");
                if (!s.equals(""))
                {
                    if (s.matches("([0-9]+,)+([0-9])+"))
                    {
                        listcorrect = true;
                        arr = Metodos_conj.conversor(s);
                    } else
                    {
                        System.out.println("Incorrecto");
                        sn.incorrect();
                        JOptionPane.showMessageDialog(null, "Lista de numeros invalida, intentelo de nuevo",
                                "Error", JOptionPane.ERROR_MESSAGE);

                    }

                } else
                {
                    sn.incorrect();
                    JOptionPane.showMessageDialog(null, "Lista de numeros invalida, intentelo de nuevo",
                            "Error", JOptionPane.ERROR_MESSAGE);

                }
            } catch (HeadlessException | NullPointerException e)
            {
                if (s == null)
                {
                    System.exit(0);
                }
            }

        } while (listcorrect != true);

        do
        {
            try
            {
                s1 = JOptionPane.showInputDialog(null, "Ingrese la suma a encontrar entre los sbconjuntos de\n"
                        + "{" + s + "}");
                if (Metodos_conj.isNumeric(s1))
                {
                    suma = Integer.parseInt(s1);
                    sumcorrect = true;
                } else
                {
                    if (s1 == null)
                    {
                        System.exit(0);
                    } else
                    {
                        sn.incorrect();
                        JOptionPane.showMessageDialog(null, "Suma invalida, intentelo de nuevo",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }
            } catch (HeadlessException | NullPointerException e)
            {

            }
        } while (sumcorrect != true);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("SUMA: " + suma);
        do
        {
            try
            {
                s2 = JOptionPane.showInputDialog(null, "Formas de resolver el problema\n"
                        + "1.- Método recursivo\n"
                        + "2.- Método de backtracking\n"
                        + "3.- Método de programación dinamica\n\n"
                        + "Escoja una forma de resolverlo (1-3):");

                if (Metodos_conj.isNumeric(s2))
                {
                    opc = Integer.parseInt(s2);
                    switch (opc)
                    {
                        case 1:
                            if (Metodos_conj.suma_subc_rec(arr, arr.length, suma))
                            {
                                JOptionPane.showMessageDialog(null, "Existe un subconjunto que da como resultado la suma :" + suma);
                            } else
                            {
                                JOptionPane.showMessageDialog(null, "No existe ningun subconjunto que da como resultado la suma :" + suma);
                            }
                            opccorrect = true;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, Metodos_conj.met_backtraking(arr, suma));
                            opccorrect = true;
                            break;
                        case 3:
                            Object arrob[] = new Object[2];
                            arrob = Metodos_conj.suma_subc_dyp(arr, arr.length, suma);
                            boolean resp = (boolean) arrob[1];
                            if (resp)
                            {
                                JOptionPane.showMessageDialog(null, "Existe un subconjunto que da como resultado la suma: " + suma);
                            } else
                            {
                                JOptionPane.showMessageDialog(null, "No existe ningun subconjunto que da como resultado la suma :" + suma);
                            }
                            opccorrect = true;
                            break;
                        default:
                            sn.incorrect();
                            JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else
                {
                    if (s2 == null)
                    {
                        System.exit(0);
                    } else
                    {
                        sn.incorrect();
                        JOptionPane.showMessageDialog(null, "Opcion invalida, intentelo de nuevo",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } catch (HeadlessException | NullPointerException e)
            {

            }
        } while (opccorrect != true);
    }

}
