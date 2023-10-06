package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		float distancia;
		float velocidadMedia;
		int tiempoRestMin;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la distancia a recorrer en kilómetros:");
		distancia=sc.nextFloat();
		System.out.println("Ingresa la velocidad media en (k/h):");
		velocidadMedia=sc.nextFloat();
		
		tiempoRestMin= (int) (distancia/velocidadMedia)*60;
		System.out.println("El tiempo restante es de: "+tiempoRestMin+" minutos");
	}
	
}
