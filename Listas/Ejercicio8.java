/*
Leer 10 números enteros, almacenarlos en una lista y determinar a cuántos es igual el
cuadrado de cada uno de los números leídos
 */
package java_listas;

import java.util.ArrayList;
import java.util.List;  
import java.util.Scanner;

public class Ejercicio8 
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
        
        
        System.out.println("El resultado de elevar los numeros al cuadrado es");
        for(int b = 0;b < Numeros.size();b++)       
        {
            int num2 = Numeros.get(b);
            int resultado = (int)Math.pow(num2,2);
            System.out.println(resultado);
        }
    }
    
}
