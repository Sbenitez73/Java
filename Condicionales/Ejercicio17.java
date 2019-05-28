import java.util.Scanner;
//Leer dos números enteros de dos dígitos y determinar a cuánto es igual la suma de todos los dígitos


public class Ejercicio17 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        System.out.print("Introduce otro numero: ");
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        int digito1 = num1 / 10;
        int digito2 = num1 % 10;
        
        int digito1_2 = num2 / 10;
        int digito2_2 = num2 % 10;
        
        System.out.println("La suma de todos los digitos es igual a");
        System.out.println(digito1 + digito2 + digito1_2 + digito2_2);
    
    }
}
