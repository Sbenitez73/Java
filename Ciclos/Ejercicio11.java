import java.util.Scanner;
//Leer un número entero de dos dígitos y mostrar en pantalla todos los enteros comprendidos entre un dígito y otro.

public class Ejercicio11 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        
        int digito1_1 = num1 / 10;
        int digito1_2 = num1 % 10;

        
        for(int i = digito1_1;i<=digito1_2;i++)
        {
            System.out.println(i);
        }
    }
    
}
