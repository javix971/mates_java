package mates_java;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		//operadores matemáticos
		System.out.println("suma num1+num2=");
		int num1, num2;
		num1 = 9;
		num2 = 10;
		int suma = num1 + num2;
		System.out.println(suma);
		System.out.println(num1+num2);
		System.out.println(9+num2);
		System.out.println(" ");
		int resta = num1 - num2;
		System.out.println("resta num1-num2=");
		System.out.println(resta);
		System.out.println(" ");
		int producto = num1*num2;
		System.out.println("multiplicación num1*num2=");
		System.out.println(producto);
		System.out.println(" ");
		int division1 = num1/num2;
		float division2 = num1/num2;
		System.out.println(division1);
		System.out.println(division2);
		//no salen decimales porque se dividen enteros
		float num3, num4;
		num3 = 9;
		num4 = 11;
		float division3 = num3/num4;
		System.out.println(division3);
		//operación módulo
		int  modulo = num2 % num1;
		System.out.println(modulo);
		
		//concatenar
		System.out.println("concatenar");
		String A, B;
		A ="hola";
		B=" qué tal";
		System.out.println(A+B);
		
		//auto incremento decremento ++ --
		int num5 = 6;
		//nota para el melón: interpreta esto
		System.out.println(num5);
		System.out.println(num5++);
		System.out.println(num5);
		/********************/
		int num6 = 10;
		System.out.println("");
		System.out.println(num6);
		num6-=5;
		System.out.println(num6);
		
		
		
			
		
	}

}
