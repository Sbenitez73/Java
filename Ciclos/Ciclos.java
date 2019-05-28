package ciclos;
import java.util.Scanner;
//Leer un número entero y mostrar todos los enteros comprendidos entre 1 y el número leído.

public class Ciclos 
{
    public static void main(String[] args) 
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        
        
        for(int i = 1;i<=num1;i++)
        {
            System.out.println(i);
        }
    }
    
}
