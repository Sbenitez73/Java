/*
 Leer una matriz 4x4 entera y calcular el promedio de los números mayores de cada fila.
 */
package matrices_java;
import java.util.Scanner;

public class Ejercicio6Matirces 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],mayor = 0,fila = 0,columna = 0,suma = 0,promedio = 0;
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
            int var = 0;
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                if(num2 > var)
                {
                    var = num2;
                }
            }
            suma += var;
            promedio = suma / 4;
           
        }
        System.out.println("El promedio de los numeros mayores por cada fila es: "+promedio);
        
    
    }
    
}
