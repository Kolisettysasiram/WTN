package com.wipro.iostreams;

import java.io.*;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		FileInputStream in=null;
		FileOutputStream out=null;
		try
		{
			in=new FileInputStream("Input.txt");
			out=new FileOutputStream("Output.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
		}
		finally {
			
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
		}
	}

}
