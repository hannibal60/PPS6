package programacion;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calcula
{
    public static void main(String[] args)
    {
        Scanner numbs = new Scanner(System.in);
        numbs.useLocale(Locale.US);
        
        System.out.println("Dame el primer numero");
        double num1 = numbs.nextDouble();

        System.out.println("El primer numero es "+num1);
        
        System.out.println("Dame el segundo numero");
        double num2 = numbs.nextDouble();

        System.out.println("El segundo numero es "+num2);
        
        System.out.println("ELija la operaciona realizar: ");
        System.out.println(" 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division\n");
        int opc = numbs.nextInt();
        System.out.println("La opcion es "+opc);
        
        double r = 0;
        switch (opc)
        {
            case 1:
                double suma=0;
                suma= num1 + num2;
                System.out.println("El resultado de sumar" + num1 + " mas " + num2 + "es igual a:" + suma );
                break;
            case 2:
                double resta=0;
                resta= num1 - num2;
                System.out.println("El resultado de resta" + num1 + " menos " + num2 + "es igual a:" + resta );
                break;
            case 3:
                double multi=0;
                multi= num1 * num2;
                System.out.println("El resultado de multiplicar" + num1 + " por " + num2 + "es igual a:" + multi );
                break;
            case 4:
                double div=0;
                if (num2 != 0)
                {
                    div= num1 / num2;
                    System.out.println("El resultado de dividir" + num1 + " entre " + num2 + "es igual a:" + div );
                } else
                {
                    System.out.println("No se puede efectuar la division");
                }
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
