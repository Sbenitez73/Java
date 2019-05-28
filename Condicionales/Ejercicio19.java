import java.util.Scanner;
//Leer dos números enteros y determinar cuál es el mayor.
public class Ejercicio19
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero de dos digitos: ");
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        if(num1 > num2)
        {
            System.out.println("El numero mayor es");
            System.out.println(num1);
        }
        
        else if(num2 > num1)
        {
            System.out.println("El numero mayor es");
            System.out.println(num2);
        }
        
        else
        {
            System.out.println("Los numeros son iguales");
        }
    
    }
    
}
