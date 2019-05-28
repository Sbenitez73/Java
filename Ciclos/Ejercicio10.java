import java.util.Scanner;
//Leer un número entero y determinar a cuánto es igual la suma de todos los enteros comprendidos entre 1 y el número leído.
public class Ejercicio10 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int suma = 0;
        
        for(int i = 1;i<=num1;i++)
        {
            suma += i;
        }
        
        System.out.println("Resultado");
        System.out.println(suma);
    }
}
