import java.util.Scanner;
//Leer dos números y mostrar todos los enteros comprendidos entre ellos.
/**
 *
 * @author HPMINI
 */
public class Ejercicio4 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        for(int i = num1;i<=num2;i++)
        {
            System.out.println(i);
        }
    
    }
}
