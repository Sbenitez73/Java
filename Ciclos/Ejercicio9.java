import java.util.Scanner;
//Mostrar en pantalla todos los números terminados en 6 comprendidos entre 25 y 205.


public class Ejercicio9 
{
    public static void main(String[] args)
    {
        
        for(int i = 25;i<=205;i++)
        {
            if(i % 10 == 6)
            {
                System.out.println(i);
            }
        }
    
    }
    
}
