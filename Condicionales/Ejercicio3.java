
import java.util.Scanner;
/*Leer tres numeros  enteros de dos digitos y 
determinar cual es el mayor de los digitos*/

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada1 = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");

        int numero1 = entrada1.nextInt();
        int numero2 = entrada1.nextInt();
        int numero3 = entrada1.nextInt();

        int digito1_1 = numero1 / 10;
        int digito1_2 = numero1 % 10;

        int digito2_1 = numero2 / 10;
        int digito2_2 = numero2 % 10;

        int digito3_1 = numero3 / 10;
        int digito3_2 = numero3 % 10;

        
        if ((digito1_1 > digito1_2) && (digito1_1 > digito2_1) && (digito1_1 > digito2_2) && (digito1_1 > digito3_1) && (digito1_1 > digito3_2))
        {
            System.out.println("Solucion");
            System.out.println(digito1_1);
        }
            

        else if ((digito1_2 > digito1_1) && (digito1_2 > digito2_1) && (digito1_2 > digito2_2) && (digito1_2 > digito3_1) && (digito1_2 > digito3_2))
        {
            System.out.println("Solucion");
            System.out.println(digito1_2);
        }
        
        else if ((digito2_1 > digito1_1) && (digito2_1 > digito1_2) && (digito2_1 > digito2_2) && (digito2_1 > digito3_1) && (digito2_1 > digito3_2))
        {
            System.out.println("Solucion");
            System.out.println(digito2_1);
        }
        
        else if ((digito2_2 > digito1_1) && (digito2_2 > digito1_2) && (digito2_2 > digito2_1) && (digito2_2 > digito3_1) && (digito2_2 > digito3_2))
        {
            System.out.println("Solucion");
            System.out.println(digito2_2);
        }
        
        else if ((digito3_1 > digito1_1) && (digito3_1 > digito1_2) && (digito3_1 > digito2_1) && (digito3_1 > digito2_2) && (digito3_1 > digito3_2))
        {
            System.out.println("Solucion");
            System.out.println(digito3_1);
        }
        
        else if ((digito3_2 > digito1_1) && (digito3_2 > digito1_2) && (digito3_2 > digito2_1) && (digito3_2 > digito2_2) && (digito3_2 > digito3_1))
        {
            System.out.println("Solucion");
            System.out.println(digito3_2);
        }

    }

}
