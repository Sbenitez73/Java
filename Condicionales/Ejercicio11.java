import java.util.Scanner;
//Leer un número entero de 4 dígitos y determinar si el primer dígito es múltiplo de alguno de los otros dígitos.

public class Ejercicio11 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero de cuatro digitos: ");
        
        int num = entrada.nextInt();
        //Defino los digitos
        int digito1 = num / 1000;
        int digito2 = (num % 1000)/100;
        int digito3 = ((num % 1000) % 100) / 10;
        int digito4 = ((num % 1000) % 100) % 10;
        int con = 0;
                
        
        
        
        if(digito2 % digito1 == 0)
        {
            con += 1; 
        }
        
        if(digito3 % digito1 == 0)
        {
            con += 1;
        }
        
        if(digito4 % digito1 == 0)
        {
            con += 1;
        }
        
        else
        {
            System.out.println("El primer digito no es multiplo de los demas");
        }
        
        if(con != 0)
        {
            System.out.println("La cantidad de digitos multiplos del primero es");
            System.out.println(con);
        }
        
    
    
    
    }
    
}
