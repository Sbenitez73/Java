import java.util.Scanner;
//Leer un número entero y determinar cuántos dígitos tiene.

public class Ejercicio12 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int con = 0;
        
        while(num != 0)
        {
            num /= 10;
            con += 1;
        }
        
        System.out.println("La cantidad de digitos del numero es");
        System.out.println(con);
    
    
    }
    
}
