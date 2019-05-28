/*
Leer una matriz 4x6 entera y determinar cuántas veces está en ella el número menor
 */
package matrices_java;
import java.util.Scanner;


public class Ejercicio7Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],con = 0,menor = 0;
        matriz  = new int[4][6];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 4;a++)
        {
            for(int b = 0;b< 6;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        
        
        
        for(int c = 0;c < matriz.length;c++)
        {
            menor = matriz[0][0];
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                if (num2 < menor)
                    {
                        menor = num2;
                    }    
            }
        }
        
        for(int e = 0;e < matriz.length;e++)
        {
            for(int f = 0;f < matriz[0].length;f++)
            {
                int num3 = matriz[e][f];
                if (num3 == menor)
                    {
                        con++;
                    }    
            }
        }
        
        System.out.println("Numero: "+menor);
        System.out.println("Las veces que se repite dentro del numero son:"+con+" Veces");
        
        
        
        
    
    }
    
}
