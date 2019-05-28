/*
 Leer una matriz 4x3 entera, calcular la suma de los elementos de cada fila y determinar
cuál es la fila que tiene la mayor suma.
 */
package matrices_java;
import java.util.Scanner;


public class Ejercicio5Matrices 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int matriz[][],mayor = 0,fila = 0,columna = 0,var = 0;
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
        
        
        for(int c = 0;c < matriz.length;c++)
        {
            int suma = 0;
            for(int d = 0;d < matriz[0].length;d++)
            {
                int num2 = matriz[c][d];
                suma += num2;
            }
            if(suma > var)
            {
                var = suma;
                fila = c; 
            }
        }
        System.out.println("La fila con la mayor suma es: "+fila);
        
    }
        
}
