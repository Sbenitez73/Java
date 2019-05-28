import java.util.Scanner;
//Leer un número entero y determinar si es múltiplo de 7

public class Ejercicio13 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        
        
        if(num % 7 == 0)
        {
            System.out.println("Solucion");
            System.out.println("El numero es multiplo de 7");
        }
        
        else
        {
            System.out.println("El numero no es multiplo de 7");
        }
    
    }
    
}
