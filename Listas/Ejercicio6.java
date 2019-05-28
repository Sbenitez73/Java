/*
Leer 10 números enteros, almacenarlos en una lista y mostrar en pantalla todos los
enteros comprendidos entre 1 y cada uno de los números almacenados en la lista.
*/
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio6 
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
       
        
        for(int a = 0;a <= 10;a++)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            Numeros.add(num);
        }
        
        for(int b = 0;b < Numeros.size();b++)       
        {
            int num2 = Numeros.get(b);
            for(int c = 1;c <= num2;c++)
            {
                System.out.println(c);
            }
            
        }
        
        
        
   }
    
}
