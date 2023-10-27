package daw;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int N;
        int sumaTotal=0;
        int sumando=1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número N:");
        N=sc.nextInt();

        while (sumando<=N) {
            sumaTotal=sumaTotal+sumando;
            sumando+=1;
        }

        System.out.println("El resultado de la suma es "+sumaTotal);
    }
}
