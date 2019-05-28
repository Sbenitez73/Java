/*
 Leer una matriz 5x5 entera y determinar cuántos 
números almacenados en ella tienen
mas de 3 dígitos.
 */
package matrices_java;
import java.util.Scanner;


public class Ejercicio8Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],con2 = 0;
        matriz  = new int[5][5];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 5;a++)
        {
            for(int b = 0;b< 5;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        
        
        
        for(int c = 0;c < matriz.length;c++)
        {
            
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d],con = 0;;
                while(num2 != 0)
                {
                    num2 /= 10;
                    con ++;
                }
                if(con > 3)
                {
                    con2 ++;
                }
            }
            
        }
        System.out.println("La cantidad de numeros  que tienen mas de tres digitos es: "+con2);
    
    
    
    }
    
}
