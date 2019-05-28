/*
 Leer una matriz 4x3 entera y 
determinar en qué posiciones exactas se encuentran los
números primos.
 */
package matrices_java;
import java.util.Scanner;

public class Ejercicio4Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],mayor = 0,fila = 0,columna = 0;
        matriz  = new int[4][3];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 4;a++)
        {
            for(int b = 0;b< 3;b++)
            {
                System.out.print("Matriz["+a+"]["+b+"]: ");
                matriz[a][b] = entrada.nextInt();
            }
        }
        System.out.println();
        System.out.println("Numeros primos y su pocision");
        
        for(int c = 0;c < matriz.length;c++)
        {
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                int con = 0;
                for(int e = 1;e <= num2;e++)
                {
                    if(num2 % e == 0)
                    {
                        con ++;
                    }
                }
                if(con == 2)
                {
                    fila = c;
                    columna = d;
                    System.out.println("Numero: "+num2);
                    System.out.println("Pocision["+fila+"]["+columna+"]");
                }
            
            }
        }
        
        
    }
    
}
    

