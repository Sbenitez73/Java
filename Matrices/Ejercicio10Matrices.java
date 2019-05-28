/*
 Leer dos matrices 5x5 enteras y determinar si el promedio entero de los números pares
de una matriz es igual al promedio de los números pares de la otra matriz.
 */
package matrices_java;
import java.util.Scanner;

public class Ejercicio10Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],suma1 = 0,suma2 = 0,promedio1 = 0,promedio2 = 0,con1 = 0,con2 = 0;
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
                int num2 = matriz[c][d];
                if(num2 % 2 == 0)
                {
                    suma1 += num2;
                    con1 ++;
                }
                
            }
        }
        promedio1 = suma1 / con1;
        
       
        
        int matriz2[][];
        matriz2  = new int[5][5];
        
        System.out.print("Introduce un matriz");
        System.out.println();
        
        for(int e = 0;e < 5;e++)
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
                if (num3 % 2 == 0)
                {
                    suma2 += num3;
                    con2 ++;
                }
            }
        }
        promedio2 = suma2 / con2;
        
        if(promedio1 == promedio2)
        {
            System.out.println("El promedio de los numeros pares es igual");
        }
        
        else
        {
            System.out.println("El promedio de los numeros pares no es igual");
        }
    
    }
    
}
