package fp.experimentos;

import java.util.Scanner;



/**
 * @author willi
 *Clase de utilidad
 *
 */

public class ExperimentosEstructrurasControl {
	
	/**
	 * @param n Numero entero.
	 * Muestra por consola un mensaje que indica si n es par.
	 */
	public static void mensajePar (Integer n) {
		String s = String.format("El numero %d es ", n);
		System.out.println(s);
		//System.out.println("El número es " + n + " es ");
		if (n % 2 == 0) {
			System.out.println("par");
		}else {
				System.out.println("impar");
			}
		}
}		
   

