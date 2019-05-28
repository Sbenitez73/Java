/*
Leer una matriz 4x4 entera y determinar cuántas veces se repita en ella el número mayor
*/
package matrices_java;
import java.util.Scanner;


public class Ejercicio2Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],mayor = 0,con = 0;
        matriz = new int[4][4];
        
        System.out.println("Introduce una matriz");
        System.out.println();
           
        
        for(int a = 0;a < 4;a++)
        {
            for(int b = 0; b < 4;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        
        for(int c = 0;c < matriz.length;c++)
        {
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num = matriz[c][d];
                if(num > mayor)
                {
                    mayor = num;
                }
            }
        }
        
        for(int e = 0;e < matriz.length;e++)
        {
            for(int f = 0;f < matriz[0].length;f++)
            {
                int num2 = matriz[e][f];
                if(num2 == mayor)
                {
                    con++;
                }
            }
        }
        
        System.out.println("El numero mayor se repite: "+con+" Veces");
        
    
    
    }
    
}
