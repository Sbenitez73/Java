import java.util.Scanner;
//Leer un número entero de tres dígitos y determinar a cuánto es igual la suma de sus dígitos.

public class Ejercicio16 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        System.out.println("Introduce un numero: ");
        System.out.println("Introduce un numero: ");
        int num = entrada.nextInt();
        
        int digito1 = num / 100;
        int digito2 = (num % 100)/10;
        int digito3 = (num % 100) % 10;
        
        System.out.println("El resultado de la suma de los digitos es igual a");
        System.out.println(digito1 + digito2 + digito3);
    
    }
}
