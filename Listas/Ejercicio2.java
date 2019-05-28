/*
 Leer 10 enteros, almacenarlos en una lista y determinar en 
qué posición de la lista está el mayor número par leído.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio2 
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        
        for(int i = 0;i <= 9;i++)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("introduce un numero: ");
            int num = entrada.nextInt();
            Numeros.add(num);
        }
        
        int mayor = 0;
        int pos = 0;
        for(int a = 0;a < Numeros.size();a++)
        {
            if (Numeros.get(a) % 2 == 0)
            {
                if(Numeros.get(a) > mayor)  
                {
                    mayor = Numeros.get(a);
                    pos = a;
                }
            }
        }
        
        System.out.println("El numero mayor par es: "+mayor);
        System.out.println("Su pocision es: "+pos);
        
    
    
    }
    
}
