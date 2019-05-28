import java.util.Scanner;
//Leer tres números enteros y determinar si el último dígito de los tres números es igual.

public class Ejercicio9 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        //digitos de los numeros
        
        int digito1_1 = (num1 % 100) % 10;
        int digito2_2 = (num2 % 100) % 10;
        int digito3_3 = (num3 % 100) % 10;
        
        
        if((digito1_1 == digito2_2) && (digito1_1 == digito3_3) && (digito2_2 == digito3_3))
        {
            System.out.println("Solucion");
            System.out.println("El ultimo digito de los tres numeros es igual");
        }
        
        else
        {
            System.out.println("Solucion");
            System.out.println("El ultimo digito de los tres numeros no es igual");
        }
    
    }
    
}
