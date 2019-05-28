import java.util.Scanner;

//Leer dos números y mostrar todos los números terminados en 4 comprendidos entre ellos.
public class Ejercicio5 
{
    public static void main(String[] args)
    {
        System.out.print("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        for(int i = num1;i<=num2;i++)
        {
            if(i % 10 == 4)
            {
                System.out.println(i);
            }
        }
    
    }
    
}
