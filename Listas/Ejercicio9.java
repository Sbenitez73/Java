/*
Leer 10 números enteros, almacenarlos en una lista y determinar cuántas veces en la lista
se encuentra el dígito 2. No se olvide que el dígito 2 puede estar varias veces en un mismo
número.
 */
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Ejercicio9
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        int con = 0;
        
        
        for(int a = 0;a <= 9;a++)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            Numeros.add(num);
        }
        
        for(int b = 0;b < Numeros.size();b++)
        {
            int num2 = Numeros.get(b);
            
            while(num2 != 0)
            {
                int digito = num2 % 10;
                if (digito == 2)
                {
                    con ++;
                }
                num2 /= 10;
            }
        }
        
        System.out.println("El digito numero dos se encuentra: "+con+" veces");
        
    }
    
}
