/*
 Leer 10 enteros, almacenarlos en una lista y 
determinar en qué posición de la lista está el mayor número leído
 */
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Java_listas 
{
    public static void main(String[] args) 
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        
        for (int i = 0; i <= 9; i++) 
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            Numeros.add(num);
        }
        
        int mayor = 0; 
        for(int a = 0;a < Numeros.size();a++)
        {
            if (Numeros.get(a) > mayor)
            {
                mayor = Numeros.get(a);
            }
        }
        
        System.out.println("El numero mayor es: "+mayor);
       
    }
    
}
