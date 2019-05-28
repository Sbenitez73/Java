import java.util.Scanner;
//Leer un número entero y determina si es igual a 10

public class Ejercicio12
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = entrada.nextInt();
        
        if(num == 10)
        {
            System.out.println("Solucion");
            System.out.println("El numero es igual a 10");
        }
        
        else
        {
            System.out.println("El numero no es igual a 10");
        }
    }
    
}
