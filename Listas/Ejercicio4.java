/*
Leer 10 números enteros, almacenarlos en una lista y determinar en qué posición está el
menor número primo.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;  
        Numeros = new ArrayList<>();
        
        int pos = 0;
        
        for(int a = 0;a <= 9;a++)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            Numeros.add(num);
        }
        
        
        int menor = Numeros.get(0);
        
        for(int b = 0;b < Numeros.size();b++)
        {
            int con = 0;
            int num2 = Numeros.get(b);
            for(int c = 1;c <= num2;c++)
            {
                if(num2 % c == 0)
                {
                    con ++;
                }
            }
            if(con == 2)
            {
                if(num2 < menor)
                 {
                    menor = num2; 
                }
            
            }
        }
        
        for(int d = 0;d < Numeros.size();d++)
        {
            if (Numeros.get(d) == menor)
            {
                pos = d;
            }
        }
        
        System.out.println("El menor numero primo es: "+menor);
        System.out.println("Y su pocision es: "+pos);
        
    
    
    }
    
}
