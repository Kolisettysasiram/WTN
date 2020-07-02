package com.wipro.Exceptions;
import java.util.InputMismatchException;

// give input with commas like 1,55,0,65,79

public class Ex2 {

	public static void main(String[] args) {
		int n = args.length;
		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		
		int[] a = new int[n];

		int sum = 0;
		double avg = 0;
		
		try {
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(args[i]);
			
			for (int i = 0; i < n; i++)
				sum += a[i];
			
			avg = sum / n;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}
}
