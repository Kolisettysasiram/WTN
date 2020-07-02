package com.wipro.Exceptions;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n = s.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the elements  ");
		try {
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			System.out.println("Enter the index of the array element you want ");
			int index = s.nextInt();
			System.out.println("The array element at index " + index + " = " + a[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		
		}

s.close();
}

}
