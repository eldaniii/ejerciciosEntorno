package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		float distancia;
		float velocidadMedia;
		float tiempoRest;
		float parteDecimal; 
		float parteEntera;
		String resultadoMensaje;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la distancia a recorrer en kilómetros:");
		distancia=sc.nextFloat();
		System.out.println("Ingresa la velocidad media en (k/h):");
		velocidadMedia=sc.nextFloat();
		
		tiempoRest= (distancia/velocidadMedia); 
		parteDecimal = tiempoRest % 1; //La parte entera se pasa a minutos.
		parteEntera = tiempoRest - parteDecimal; //La parte entera está en horas.
		resultadoMensaje="El tiempo restante es de: "+parteEntera+"horas y "+parteDecimal*60+" minutos.";
		System.out.println(resultadoMensaje);
	}
	
}
