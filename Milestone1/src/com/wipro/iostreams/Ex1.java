package com.wipro.iostreams;
import java.io.*;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		Scanner s =new Scanner(System.in);
		String m = s.next();
		char d=m.charAt(0);
		int count=0;
		FileInputStream in=null;
		try
		{
			in=new FileInputStream("Input.txt");
			int c;
			while((c=in.read())!=-1)
			{
				if (c >= 65 && c <= 90) c += 32;
				if (d >= 65 && d <= 90) d += 32;
				if(c==d)
					count++;
			}
		}
		finally {
			System.out.println(count);
			if(in!=null)
			{
				in.close();
			}
		}
		
		
	}

}
