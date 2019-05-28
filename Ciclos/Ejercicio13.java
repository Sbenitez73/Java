import java.util.Scanner;
//Leer un entero y mostrar todos los múltiplos de 5 comprendidos entre 1 y el número leído.

public class Ejercicio13 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        for(int i = 1;i<=num;i++)
        {
            if(i % 5 == 0)
            {
                System.out.println(i);
            }
        }
        
        
    
    
    }
    
}
