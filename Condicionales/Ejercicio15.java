import java.util.Scanner;
//Leer tres números enteros y determinar si el último dígito de los tres números es igual.
public class Ejercicio15 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        
        if((num1 % 10) == (num2 % 10) && (num1 % 10) == (num3 % 10) && (num2 % 10) == (num3 % 10))
        {
            System.out.println("El ultimo digito de los tres numeros es igual");
        }
        
        else
        {
            System.out.println("El ultimo digito de los tres numeros no es igual");
        }
    }
}
