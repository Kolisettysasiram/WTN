package com.wipro.wrapperclasses;

public class Ex2 {

	public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
		System.out.println("Given Number is : " + n);		
		System.out.println("Binary equivalent is : " + Integer.toBinaryString(n));
		System.out.println("Octal equivalent is : " + Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent is : " + Integer.toHexString(n));

	}

}
