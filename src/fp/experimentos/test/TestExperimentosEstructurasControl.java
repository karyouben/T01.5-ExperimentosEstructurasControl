package fp.experimentos.test;

import java.util.Scanner;

import fp.experimentos.ExperimentosEstructrurasControl;

public class TestExperimentosEstructurasControl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un número entero : ");
		Integer n = leeEntero(sc, "Introduzca un número entero :");
		//Integer n = sc.nextInt();
		ExperimentosEstructrurasControl.mensajePar(n);
		//ExperimentosEstructrurasControl.mensajePar(3);
		System.out.println("Introduzca su salario: ");
		Float salario = sc.nextFloat();
		Float impuesto = ExperimentosEstructrurasControl.calcularImpuesto(salario);
		String s = String.format("El impuesto correspondiente al salario %.2f es %.2f", salario, impuesto);
		System.out.println(s);
		sc.close();
	}
	
	
	public static Integer leeEntero(Scanner sc, String mensaje) {
		//System.out.println("Introduzca un número entero : ");
		Integer n = sc.nextInt();
		return n;
	}
	
	public static String obtenNombreDia(Integer n) {
		String res = "" ;
        switch (n){
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

}
