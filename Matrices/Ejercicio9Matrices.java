/*
Leer dos matrices 4x5 enteras y determinar si la cantidad de números pares almacenados
en una matriz es igual a la cantidad de números pares almacenados en la otra matriz.
 */
package matrices_java;
import java.util.Scanner;

public class Ejercicio9Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],con1 = 0,con2 = 0;
        matriz  = new int[4][5];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int a = 0;a < 4;a++)
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
                int num2 = matriz[c][d];
                if(num2 % 2 == 0)
                {
                    con1 ++;
                }
                
            }
        }
        
       
        
        int matriz2[][];
        matriz2  = new int[4][5];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int e = 0;e < 4;e++)
        {
            for(int f = 0;f< 5;f++)
            {
                System.out.print("Matriz["+e+"]["+f+"]: ");
                matriz2[e][f] = entrada.nextInt();
            }
        }
        
        
        
        for(int g = 0;g < matriz2.length;g++)
        {
            
            for(int h = 0;h < matriz2[0].length;h++)
            {
                int num3 = matriz2[g][h];
                if(num3 % 2 == 0)
                {
                    con2 ++;
                }    
            }
        }
        
        if(con1 == con2)
        {
            System.out.println("La cantidad de numeros pares en las dos matrices es igual");
        }
        
        else
        {
            System.out.println("La cantidad de numeros pares en las dos matrices no es igual");
        }
    
    
    
    
    }
    
}
