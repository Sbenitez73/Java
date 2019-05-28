import java.util.Scanner;
//Determinar a cuánto es igual la suma de los elementos de la serie de Fibonacci entre 0 y 100.
public class Ejercici18 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int fibo1,fibo2,suma = 0,i;
        

        fibo1=1;
        fibo2=1; 

        for(i=2;i<=100;i++)
        {
            suma += fibo2; 
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        
        System.out.println("La suma de los 100 primeros numeros de fibonacci es igual a:");
        System.out.println(suma);
    }
    
}
