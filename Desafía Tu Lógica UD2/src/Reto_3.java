/*Escribe un programa en Java que muestre y cuente los números
 * que son múltiplos de 2 o de 3 que hay entre 1 y 100.
 * Utiliza las estructuras de control que creas convenientes.*/


public class Reto_3 {
	public static void main(String[] args)
	{
		int multiplosDos = 0, multiplosTres= 0;
		
		System.out.println("Los multiplos de 2 son: ");
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			{
				multiplosDos = multiplosDos + 1;
				System.out.print("(" + i + ")" + " ");
			}
		}
		System.out.println();
		
		System.out.println("Los multiplos de 3 son: ");
		for (int i = 1; i <=100; i++)
		{
			if (i % 3 == 0)
			{
				multiplosTres = multiplosTres + 1;
				System.out.print("(" + i + ")" + " ");
			}
		}
		System.out.println();

		System.out.println("La suma de los mútiplos de 2  que hay entre 1 y 100 son: " + multiplosDos);
		System.out.println("La suma de los mútiplos de 3  que hay entre 1 y 100 son: " + multiplosTres);
		
	}

}
