/*
Leer una matriz 3x4 entera y determinar en qué posiciones exactas se encuentran los números pares.
 */
package matrices_java;
import java.util.Scanner;

public class Ejercicio3Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],mayor = 0,fila = 0,columna = 0;
        matriz  = new int[3][4];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 3;a++)
        {
            for(int b = 0;b< 4;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        
        
        System.out.print("Los numeros pares estan en la pocision");
        for(int c = 0;c < matriz.length;c++)
        {
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                if(num2 % 2 == 0)
                {
                    fila = c;
                    columna = d;
                    System.out.println();
                    System.out.print("Pocision["+fila+"]["+columna+"]");
                    
                }
        
            }
            
        }
        System.out.println();
    }
    
}
