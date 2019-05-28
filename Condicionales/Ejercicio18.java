import java.util.Scanner;
//Leer dos números enteros de dos dígitos y determinar si la suma de los dos números origina un número par.
public class Ejercicio18 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero de dos digitos: ");
        
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int res = num1 + num2;
        
        if(res % 2 == 0)
        {
            System.out.println("El resultado de la suma de los dos numeros es un numero par");
        }
        
        else
        {
            System.out.println("El resultado de la suma de los dos numeros no es un numero par");
        }
        
    
    
    }
    
}
