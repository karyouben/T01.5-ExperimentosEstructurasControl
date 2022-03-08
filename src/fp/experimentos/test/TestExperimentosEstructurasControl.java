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
		System.out.println("");
		//ExperimentosEstructrurasControl.mensajePar(3);
		
		System.out.println("Introduzca su salario: ");
		Float salario = sc.nextFloat();
		Float impuesto = ExperimentosEstructrurasControl.calcularImpuesto(salario);
		String s = String.format("El impuesto correspondiente al salario %.2f es %.2f", salario, impuesto);
		System.out.println(s);
		System.out.println("");
		
		System.out.println("Introduzca un número de la semana: ");
		Integer n1= sc.nextInt();
		String diaSemana = ExperimentosEstructrurasControl.obtenNombreDia(n1);
		String r = String.format("El dia de la semana es: " + diaSemana);
		System.out.println(r);
		System.out.println("");
		
		System.out.println("Introduzca un número: ");
		Integer n2= sc.nextInt();
		Integer Sumatorio = ExperimentosEstructrurasControl.sumatorio1(n2);
		String p = String.format("La suma total es: " + Sumatorio);
		System.out.println(p);
		System.out.println("");
		
		System.out.println("Introduzca un número: ");
		Integer n3= sc.nextInt();
		Integer Sumatorio2 = ExperimentosEstructrurasControl.sumatorio2(n3);
		String p2 = String.format("La suma total es: " + Sumatorio2);
		System.out.println(p2);
		System.out.println("");
		
		sc.close();
	}
	
	
	public static Integer leeEntero(Scanner sc, String mensaje) {
		//System.out.println("Introduzca un número entero : ");
		Integer n = sc.nextInt();
		return n;
	}
	


}
