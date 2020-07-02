package com.wipro.Exceptions;
import java.util.*;

@SuppressWarnings("serial")
class NegativeValuesException extends Exception {
	public NegativeValuesException() 
	{
		super();
		System.out.println("NegativeValuesException occured");
	}
}

@SuppressWarnings("serial")
class ValuesOutOfRangeException extends Exception {
	public ValuesOutOfRangeException()
	{
		super();
		System.out.println("ValuesOutOfRangeException occured");
	}
}

public class Ex3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = s.nextLine();
				
				if (s.hasNextInt())
					subA = s.nextInt();
				else
					throw new NumberFormatException();
				
				if (s.hasNextInt())
					subB = s.nextInt();
				else
					throw new NumberFormatException();
				
				if (s.hasNextInt())
					subC = s.nextInt();
				else
					throw new NumberFormatException();
				
				if (subA < 0) throw new NegativeValuesException();
				if (subA > 100) throw new ValuesOutOfRangeException();
				
				if (subB < 0) throw new NegativeValuesException();
				if (subB > 100) throw new ValuesOutOfRangeException();
				
				if (subC < 0) throw new NegativeValuesException();
				if (subC > 100) throw new ValuesOutOfRangeException();
				
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
		
		s.close();

	}

}
