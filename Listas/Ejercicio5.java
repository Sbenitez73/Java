/*
 Leer 10 números enteros, almacenarlos en una lista y determinar a cuánto es igual la
suma de los dígitos pares de cada uno de los números leídos.
 */
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio5 
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        int digito = 0,suma = 0;
        
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
            while (num2 != 0)
            {
                digito = num2 % 10;
                num2 /= 10;
                if (digito % 2 == 0)
                {
                    suma += digito;
                }
            }
        
        }
        
        System.out.println("La suma de los digitos pares es igual a: "+suma);
        
    
    }
    
}
