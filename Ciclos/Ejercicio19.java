import java.util.Scanner;
//Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio de los números terminados en 5.
public class Ejercicio19 
{
    public static void main(String[] args)
    {
        int num = 1,suma = 0,con = 0;
        do
        {
            System.out.print("Introduce un numero: ");
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            
            if (num % 10 == 5 )
            {
                con += 1;
                suma += num;
            }
            
        }while(num != 0);
        
        System.out.println("El promedio de los numeros terminados en 5 es");
        System.out.println(suma / con);
    
    }
    
}
