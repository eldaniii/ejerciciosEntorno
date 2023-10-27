package daw;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int N;
        int factor=1;
        int producto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número N:");
        N=sc.nextInt();

        while (factor<=10) {
            producto=N*factor;
            System.out.println(N+"*"+factor+"="+producto);
            factor++;
        }
    }
}
