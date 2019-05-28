import java.util.Scanner;

//Leer un número entero de tres dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos.
public class Ejercicio6 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        
        int digito1 = num / 100;
        int digito2 = (num % 100)/10;
        int digito3 = (num % 100) % 10;
        
        
        for(int i = 1;i<=digito1;i++)
        {
            System.out.println(i);
        }
        
        for(int a = 1;a<=digito2;a++)
        {
            System.out.println(a);
        }
        
        for(int b = 1;b<=digito3;b++)
        {
            System.out.println(b);
        }
    
    }
    
}
