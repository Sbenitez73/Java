    import java.util.Scanner;

public class Ejercicio20
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = entrada.nextInt();
        
        int digito1 = num / 10;
	int digito2 = num % 10;
	
	if (digito2 == 1)
        {
            System.out.println("El primer digito del numero es: ");
            System.out.println(digito1);
        }
	
	if (digito2 == 2)
        {       System.out.println("La suma de los digitos es igual a:");
                System.out.println(digito1 + digito2);
        }
	
	if (digito2 == 3)
        {
		System.out.println("El producto de los digitos es igual a: ");
                System.out.println(digito1 * digito2);
	}
	
	
        if (digito2 != 1 && digito2 != 2 && digito2 != 3)
        {
		System.out.println("El programa no funciona con los numeros ingresados");
	}	
    }
}
