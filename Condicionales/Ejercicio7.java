import java.util.Scanner;
/*Leer un número entero de cuatro dígitos y determinar a cuanto es igual la suma de sus
dígitos.*/

public class Ejercicio7 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero de cuatro digitos: ");
        
        int num = entrada.nextInt();
        int digito1 = num / 1000;
        int digito2 = (num % 1000)/100;
        int digito3 = ((num % 1000) % 100) / 10;
        int digito4 = ((num % 1000) % 100) % 10;
        
        System.out.println("La suma de los digitos es igual a: ");
        System.out.println(digito1 + digito2 + digito3 + digito4);
    
         
    
    }
    
}
