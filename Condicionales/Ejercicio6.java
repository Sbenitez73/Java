import java.util.Scanner;
/* . Leer un número entero de cuatro dígitos y 
determinar cuántos dígitos pares tiene.*/

public class Ejercicio6
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
        int con = 0;
        
        if(digito1 % 2 == 0)
        {
            con += 1;
        }
        
        if(digito2 % 2 == 0)
        {
            con += 1;
        }
        
        if(digito3 % 2 == 0)
        {
            con += 1;
        }
        
        if(digito4 % 2 == 0)
        {
            con += 1;
        }
        
        
        if(con != 0)
        {
            System.out.println("Solucion");
            System.out.println("La cantida de digitos pares es");
            System.out.println(con);
        }
        
        else
        {
            System.out.println("Solucion");
            System.out.println("El numero no tiene digitos pares");
        }
    }
    
}
