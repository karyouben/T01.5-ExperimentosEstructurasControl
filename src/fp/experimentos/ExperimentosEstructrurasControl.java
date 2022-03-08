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
		System.out.print(s);
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
	public static String obtenNombreDia(Integer n1) {
		String res = "" ;
        switch (n1){
        case 1:              
            res = "Lunes";
            break;
        case 2:              
        	res = "Martes";
            break;
        case 3:             
        	res = "Miercoles";
            break;
        case 4:             
        	res = "Jueves";
            break;
        case 5:             
        	res = "Viernes";
            break;           
        case 6: 
        	res = "Sabado";
            break;
        case 7: 
        	res = "Domingo";
            break;
                  
      }
       return res;    
	}
    public static Integer sumatorio1 (Integer n2) {
   	 Integer suma1 = 0;
   	 int i = 1;
   	 while (i<=n2) {
   		 suma1 = suma1 +i;
   		 i++;
   	 }
	return suma1;
   }

    public static Integer sumatorio2 (Integer n3) {
    	Integer suma = 0;
    	for(int i =0; i<=n3; i++) {
    		suma =suma + i;	
    	}
    	return suma;
   
      }
}		
   

