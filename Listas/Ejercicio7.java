/*
Leer 10 números enteros, almacenarlos en una lista y determinar si el promedio entero
de dichos números es un número primo
 */
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio7 
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        int suma = 0;
       
        
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
            suma += num2;
        }
        
        int promedio = suma / 10;
        int con = 0; 
        
        for(int c = 1;c <= promedio;c++)
        {
            if(promedio % c == 0)
            {
                con ++;
            }
        }
        
        if(con == 2)
        {
            System.out.println("El promedio de los numeros es un numero primo");
        }
        else
        {
            System.out.println("El promedio de los numeros no es un numero primo");
        }
    }
    
}
