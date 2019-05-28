import java.util.Scanner;
/*. Leer un número entero de tres dígitos y determinar en 
qué posición está el mayor dígito*/

public class ejercicio4 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero entero de tres digitos: ");
        
        int num = entrada.nextInt();
        int digito1 = num / 100;
        int digito2 = (num % 100)/10;
        int digito3 = (num % 100) % 10;
        
        if(num < 0)
        {
            System.out.println("El numero digitado debe ser mayor a 0");
        }
        
        
        else
        {
            
            if(digito1 > digito2 && digito1 > digito3)
            {
                System.out.println("Solucion");
                System.out.println(digito1);
            } 
    
            else if(digito2 > digito1 && digito2 > digito3)
            {
                System.out.println("Solucion");
                System.out.println(digito2);
            }
    
            else if(digito3 > digito1 && digito3 > digito2)
            {
                System.out.println("Solucion");
                System.out.println(digito3);
            }
        
            else 
            {
                System.out.println("Los numeros son iguales");
            }
        }
    
    }
}
