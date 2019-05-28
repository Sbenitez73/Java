import java.util.Scanner;

/*Leer un número entero de tres dígitos y determinar si alguno de sus dígitos es igual a la
suma de los otros dos.*/


public class Ejercicio5
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero de tres digitos: ");
        
        int num = entrada.nextInt();
        
        int digito1 = num / 100;
        int digito2 = (num % 100)/10;
        int digito3 = (num % 100) % 10;
        
        if((digito1 + digito2) == digito3)
        {
            System.out.println("La suma de los 2 primeros digitos es igual al 3");
        }
        
        else if((digito1 + digito3) == digito2)
        {
           System.out.println("Solucion");
           System.out.println("La suma de el primero y el tercer digito es igual al segundo");
        }
        
        else if((digito2 + digito3) == digito1)
        {
           System.out.println("Solucion");
           System.out.println("La suma de el segundo y el tercer digito es igual al primero");
        }
        
        else
        {
            System.out.println("La suma de los digitos no es igual a ninguno");
        }
    
    
    
    
    }
    
}
