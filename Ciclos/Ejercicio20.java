import java.util.Scanner;
//Leer números hasta que digiten 0 y determinar a cuanto es igual el promedio entero de los número primos leídos.

public class Ejercicio20 
{
    public static void main(String[] args)
    {
         
        int suma = 0,num = 1,con2 = 0;
        
        do
        {
            System.out.print("Introduce un numero: ");
            Scanner entrada = new Scanner(System.in);
            num = entrada.nextInt();
            int con = 0;
            
            for(int i =1;i<=num;i++)
            {
                if(num % i == 0)
                {
                    con++;
                }
            }
            
            if (con == 2)
            {
                suma += num;
                con2 += 1;
            }
        
        
        }while(num != 0);
        
        System.out.println("El promedio de los numeros primos es:");
        System.out.println(suma/con2);
        
    }   
                
                
}
    

