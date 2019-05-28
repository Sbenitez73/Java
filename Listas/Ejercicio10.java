/*
Leer 10 números enteros, almacenarlos en una lista y determinar cuántos números de los
almacenados en dicha lista comienzan en dígito primo
*/
package java_listas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 
{
    public static void main(String[] args)
    {
        List<Integer>Numeros;
        Numeros = new ArrayList<>();
        int uno = 0,con2 = 0;
    
    
        for(int a = 0;a <= 9;a++)
        {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce un numero: ");
            int num = entrada.nextInt();
            
            if(num < 0)
            {
                System.out.println("El programa solo funciona con numeros positivos");
            }
            
            else
            {
                Numeros.add(num);
            }
        }
        
        
        for(int b = 0;b < Numeros.size();b++)
        {
            int num2 = Numeros.get(b);
            
            while(num2 != 0)
            {
                int digito = num2 % 10;
                
                if (digito > 0)
                {
                    uno = digito;
                }
                num2 /= 10;
            }
            
            int con = 0;
            for(int c = 1;c <= uno;c++)
            {
                if(uno % c == 0)
                {
                    con ++;
                }
            }
            if(con == 2)
            {
                con2 ++;
            }
           
        }
        System.out.println("La cantidad de numeros que comienzan con digito primo es: "+con2);
        
    }
}
