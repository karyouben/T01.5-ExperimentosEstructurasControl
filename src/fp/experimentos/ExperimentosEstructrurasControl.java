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
		String s = String.format("El numero %d es: ", n);
		System.out.println(s);
		//System.out.println("El número es " + n + " es ");
		if (n % 2 == 0) {
			System.out.println("par");
		}else {
				System.out.println("impar");
			}
		}
	public static Float calcularImpuesto(Float salario) {
		Float impuesto = 0.0f;
		if (salario>= 5000.0) {
			impuesto = 20.0f;
		}else if (salario < 5000.0 && salario >= 2500.0) {
			impuesto = 15.0f;	
		}else if (salario < 2500.0 && salario >= 1500.0) {
			impuesto = 10.0f;
		}else if (salario > 800) {
			impuesto = 5.0f;
		//Float porcentaje = (salario*impuesto)/100;
	  }
		return impuesto;
	
	}
}		
   

