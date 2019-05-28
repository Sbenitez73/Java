/*
Leer una matriz 4x4 entera y determinar en qué fila y en qué columna se encuentra el
número mayor..
 */
package matrices_java;
import java.util.Scanner;


public class Matrices_java 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],mayor = 0,fila = 0,columna = 0;
        matriz  = new int[4][4];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 4;a++)
        {
            for(int b = 0;b< 4;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        
        
        for(int c = 0;c < matriz.length;c++)
        {
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                if(num2 > mayor)
                {
                    mayor = num2;
                    fila = c;
                    columna = d;
                }
            } 
        }
        
        System.out.println("El numero mayor de la matriz es: "+mayor);
        System.out.println("El numero mayor se encuentra en la fila: "+fila);
        System.out.println("El numero mayor se encuentra en la columna: "+columna);
        
        
       
    }
    
}
