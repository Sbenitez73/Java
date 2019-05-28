import java.util.Scanner;
//Leer un número entero y mostrar todos los divisores exactos del número comprendidos entre 1 y el número leído.

/**
 *
 * @author HPMINI
 */
public class Ejercicio3 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        
        for(int i = 1;i<=num1;i++)
        {
            if(num1%i == 0)
            {
                System.out.println(i);
            }
        }
    
    }
}
