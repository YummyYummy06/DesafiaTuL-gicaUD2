/*Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo.
 * A continuación, muestra los primeros 20 números sucesivos a dicho número.*/

import java.util.Scanner;
public class Reto_2 {
	public static void main (String[] args)
	{
		int numero;
		Scanner n = new Scanner (System.in);
		do 
		{
		System.out.println("Hola, escribe un número positivo");
		
		numero = n.nextInt();
		
		if (numero < 0)
		{
			System.out.println("Ese no es un número positivo, intentalo de nuevo");
		}
		}
		
		while (numero < 0);
		
		System.out.println("Los 20 primeros números de: " + numero + " son: ");
		for (int i = 1; i <= 20; i++)
		{
			numero = numero + 1;
			System.out.println(numero);
		}
		n.close();
		
	}

}
