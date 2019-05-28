import java.util.Scanner;
//Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3.


public class Ejercicio15 
{
    public static void main(String[] args)
    {
        int suma = 0;
        
        for(int i = 1;i<=60;i++)
        {
            suma += i; 
        }
    
        System.out.println("La suma es igual a");
        System.out.println(suma);
    }
}
