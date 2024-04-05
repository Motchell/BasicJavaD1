package com.basicjava;

import java.util.ArrayList;
import java.util.List;

public class BasicJava {

	public static void main(String[] args) {
		int[] arrayTest1 = {1,3,5,7,9,13};
		int[] arrayTest2 = {-5,3,0,2,9,-13};
		double[] arrayTest3 = {2,10,3,5,7,8,20};
		int[] arrayTest4 = {1,3,5,7};
		int[] arrayTest5 = {1,5,10,-2};
		int[] arrayTest6 = {1,5,10,7,-2};
		ArrayList<Object> arrListTest = new ArrayList<Object>(List.of(1,5,10,-2));
		//printNums();
		//printNumsImp();
		//printAndSum();
		//printArray(arrayTest1);
		//printMaxNumArray(arrayTest2);
		//printPromNumArray(arrayTest3);
		//printArrayImp();
		//greaterThanY(arrayTest4, 3);
		//arrayPow(arrayTest5);
		//arrayNoNegative(arrayTest5);
		//System.out.println(minMaxPromArr(arrListTest));
		//System.out.println(nextValueInArr(arrayTest6));
		
		/*Acá puede descomentar cualquier método para que vea que funciona :) !!! */
	}
	
	public static void printNums() {
		
		for(int i=1;i<=255;i++) {
			System.out.println(i);
		}
		
	}
	
	public static void printNumsImp() {
		
		for(int i=1;i<=255;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void printAndSum() {
		int sum = 0;
		
		for(int i=0;i<=255;i++) {
			sum += i;
			System.out.println("Nuevo numero: " + i + " Suma: " + sum);
		}
		
	}
	
	public static void printArray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void printMaxNumArray(int[] arr) {
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
	
	public static void printPromNumArray(double[] arr) {
		double prom = 0;
		double sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
		}
		prom = sum/arr.length;
		System.out.println("Promedio de " + prom);
		
	}

	public static void printArrayImp() {
		ArrayList<Integer> oddArr = new ArrayList<Integer>();
		
		for(int i=1;i<=255;i++) {
			if(i%2!=0) {
				oddArr.add(i);
			}
		}
		
		for(int oddNum : oddArr) {
			System.out.println(oddNum);
		}
		// la tarea dice que no hay que retornar un arraylist así que simplemente la imprimo desde el método
		
	}
	
	public static int greaterThanY(int[] arr, int y) {
		int count = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(y<arr[i]) {
				count++;
			}
		}
		
		System.out.println(count);
		// Lo hice con return ya que en la tarea pide que se devuelva el contador
		return count;
		
	}

	public static void arrayPow(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			arr[i] *= arr[i];
			System.out.println(arr[i]);
		}
		
	}
	
	public static void arrayNoNegative(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i] = 0;
			}
			System.out.println(arr[i]);
		}
		
	}
	
	public static ArrayList<Object> minMaxPromArr(ArrayList<Object> arr) {
		int min = 0, max = 0, actual;
		double prom, sum = 0;
		
		for(int i=0;i<arr.size();i++) {
			actual = (Integer)arr.get(i);
			sum += actual;
			if(min > actual) {
				min = actual;
			}
			if(max < actual) {
				max = actual;
			}
		}
		
		prom = sum/arr.size();
		ArrayList<Object> newArray = new ArrayList<Object>(List.of(min, max, prom));
		return newArray;
	}
	
	public static ArrayList<Integer> nextValueInArr(int[] arr) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				newArray.add(0);
			}else{
				newArray.add(arr[i+1]);
			}
		}
		
		return newArray;
	}
}