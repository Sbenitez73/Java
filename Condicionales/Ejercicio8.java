import java.util.Scanner;
//Leer un número entero de tres dígitos y determinar si el primer dígito es igual al último.


public class Ejercicio8
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero de tres digitos: ");
        
        int num = entrada.nextInt();
        int digito1 = num / 100;
        int digito2 = (num % 100)/10;
        int digito3 = (num % 100) % 10;
        
        if(digito1 == digito3)
        {
            System.out.println("Solucion");
            System.out.println("El primer digito es igual al ultimo");
        }
        
        
        else
        {
            System.out.println("Solucion");
            System.out.println("El primer digito no es igual al ultimo");
        }
    
    
    }
    
}
