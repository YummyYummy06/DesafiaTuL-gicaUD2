/*Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento,
 * que puede ser ascendente o descendente, a continuación, según el orden indicado
 * se mostrarán en pantalla dichos números. Ej.: si los números introducidos son 4,7,2 y
 * se escoge orden ascendente (de menor a mayor) aparecen en pantalla en este orden 2,4,7,
 * si el ordenamiento es descendente (de mayor a menor) se mostrarán en el siguiente 7, 4, 2.
 * Utiliza estructuras de control adecuadas. */

import java.util.Scanner;

public class Reto_4 {
	public static void main(String[] args)
	{
		int n1,n2,n3,cambio;
		boolean ascendente;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el primer número entero: ");
		n1 = sc.nextInt();
		
		System.out.println("Escribe el segundo número entero: ");
		n2 = sc.nextInt();
		
		System.out.println("Escribe el tercer número entero: ");
		n3 = sc.nextInt();
		 
		System.out.println("¿Quiere ordenar los números de forma ascendente?,"
				+ "en caso contrario se ordenarán de forma descendente (true/false)");
		ascendente = sc.nextBoolean();
		
		if (ascendente) {
            if (n1 > n2) {
                cambio = n1;
                n1 = n2;
                n2 = cambio;
            }
            if (n2 > n3) {
                cambio = n2;
                n2 = n3;
                n3 =cambio;
            }
            if (n1 > n2) {
                cambio = n1;
                n1 = n2;
                n2 = cambio;
            }
        } else {
            if (n1 < n2) {
                cambio = n1;
                n1 = n2;
                n2 = cambio;
            }
            if (n2 < n3) {
                cambio = n2;
                n2 = n3;
                n3 = cambio;
            }
            if (n1 < n2) {
                cambio = n1;
                n1 = n2;
                n2 = cambio;
            }
        }

        System.out.println("Los números ordenados quedarían: " + n1 + ", " + n2 + ", " + n3);
		
        sc.close();
	}

}
