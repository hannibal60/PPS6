package general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Kevin
 */
public class Vectores
{

    private int arr[];
    public int cantidad = 0;
    private int tope = -1;
    private int pos = 0;
    private int neg = 0;
    private int zero = 0;

    public Vectores(int n)
    {
        this.arr = new int[n];
    }

    public void Inserta(int numero, int indice)
    {
        getArr()[indice] = numero;
        setTope(getTope() + 1);
        Posibilidades(numero);
    }

    public String Desp()
    {
        String s = "{";
        for (int i = 0; i <= getTope(); i++)
        {
            s += " " + getArr()[i] + " ";
        }
        s += "}";
        return s;
    }

    private void Posibilidades(int numero)
    {
        if (numero == 0)
        {
            zero++;
        } else
        {
            if (numero > 0)
            {
                pos++;
            } else
            {
                neg++;
            }
        }
    }

    public boolean HayResultados()
    {
        if (zero > 0 || (pos > 0 && neg > 0))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public String Subconjuntos()
    {
        String sub = "";

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
            System.out.println("Se añadio: "+arr[i]);
        }

        for (Set<Integer> s : Powerset(set))
        {
            Object[] arreglo = s.toArray();
            int cero = 0;
            for (int i = 0; i < arreglo.length; i++)
            {
                cero += (int) arreglo[i];
                if (i == arreglo.length - 1)
                {
                    if (cero == 0)
                    {
                        cantidad++;
                        sub += s + "\n";
                    }
                }
            }
        }

        return sub;
    }

    public static <T> Set<Set<T>> Powerset(Set<T> originalSet)
    {
        Set<Set<T>> sets = new HashSet<Set<T>>();
        if (originalSet.isEmpty())
        {
            sets.add(new HashSet<T>());
            return sets;
        }
        List<T> list = new ArrayList<T>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
        for (Set<T> set : Powerset(rest))
        {
            Set<T> newSet = new HashSet<T>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

    /**
     * @return the arr
     */
    public int[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(int[] arr)
    {
        this.arr = arr;
    }

    /**
     * @return the tope
     */
    public int getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(int tope)
    {
        this.tope = tope;
    }

    /**
     * @return the pos
     */
    public int getPos()
    {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos)
    {
        this.pos = pos;
    }

    /**
     * @return the neg
     */
    public int getNeg()
    {
        return neg;
    }

    /**
     * @param neg the neg to set
     */
    public void setNeg(int neg)
    {
        this.neg = neg;
    }

    /**
     * @return the zero
     */
    public int getZero()
    {
        return zero;
    }

    /**
     * @param zero the zero to set
     */
    public void setZero(int zero)
    {
        this.zero = zero;
    }
}
