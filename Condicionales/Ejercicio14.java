import java.util.Scanner;
//Leer un número entero de 4 dígitos y determinar si tiene más dígitos pares o impares.

public class Ejercicio14 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero de cuatro digitos: ");
        int num = entrada.nextInt();
        
        //defino los digitos
        int digito1 = num / 1000;
        int digito2 = (num % 1000)/100;
        int digito3 = ((num % 1000) % 100) / 10;
        int digito4 = ((num % 1000) % 100) % 10;
        int con1 = 0;
        int con2 = 0;
        
        if(digito1 % 2 == 0)
        {
            con1 += 1;
        }
        else if(digito1 % 2 != 0)
        {
            con2 += 1;
        }
        
        if(digito2 % 2 == 0)
        {
            con1 += 1;
        }
        
        else if(digito2 % 2 != 0)
        {
            con2 += 1;
        }
        
        if(digito3 % 2 == 0)
        {
            con1 += 1;
        }
        
        else if(digito3 % 2 != 0)
        {
            con2 += 1;
        }
        
        if(digito4 % 2 == 0)
        {
            con1 += 1;
        }
        
        else if(digito4 % 2 != 0)
        {
            con2 += 1;
        }
        
        
        if(con1 > con2)
        {
            System.out.println("Solucion");
            System.out.println("El numero tiene mas digitos pares que impares");
        }
        
        else if(con1 == con2)
        {
            System.out.println("Solucion");
            System.out.println("El numero tiene la misma cantidad de digitos pares e impares");
        }
        
        
        else
        {
            System.out.println("Solucion");
            System.out.println("El numero tiene mas digitos impares que pares");
        }
        
        
        
        
    
    }
    
}
