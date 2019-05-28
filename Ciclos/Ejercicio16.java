import java.util.Scanner;
//Leer dos números entero y mostrar todos los múltiplos de 5 comprendidos entre el menor y el mayor.
public class Ejercicio16 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        if(num1 > num2)
        {
            for(int i = num2;i<=num1;i++)
            {
                if(i % 5 == 0)
                {
                    System.out.println(i);
                }
            }
        }
        
        else
        {
            for(int a = num1;a<=num2;a++)
            {
                if(a % 5 == 0)
                {
                    System.out.println(a);
                }
            }
        }
        
    
    }
    
}
