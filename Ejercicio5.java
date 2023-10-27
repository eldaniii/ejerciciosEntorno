package daw;
import java.util.Scanner;

public class Ejercicio5 {
   public static void main(String[] args) {
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad:");
        edad=sc.nextInt();
       
        if (edad<12) System.out.println("Infante");
        else if (edad>=12 && edad<=17) System.out.println("Adolescente");
        else if (edad>=18 && edad<=60) System.out.println("Adulto");
        else System.out.println("Anciano");
    }
}

