package com.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			
			invertirArreglo();

	}

		public static void invertirArreglo() {
			
			int[] arregloOriginal = new int [10];
			int[] arregloInvertido = new int [10];
			
			for (int i = 0; i < arregloOriginal.length; i++) {
				System.out.print("Numeros aleatorios");
				arregloOriginal[i] = (int) (Math.random()*100);
				
				System.out.println("Esta posición es : " +  i + " y esta el valor: " + arregloOriginal[i]);
				
			}
			
			
			for (int i =0; i < arregloInvertido.length; i++) {
				arregloInvertido[i] = (arregloOriginal[i]); 
			}
			
			Arrays.sort(arregloInvertido);
				
			for (int i = 0; i < arregloInvertido.length; i++)	{
				System.out.print(arregloInvertido[i]);
			}
			 
	
	}
}

