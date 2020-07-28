package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarksArray(Student s[])
	{
		int C=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=null)
				{
					try
					{
						if(s[i].getMarks()==null)
							C++;
					}
					catch (Exception e)
					{
					}
				}
			}
		}
		return C;
	}
	public int findNumberOfNullName(Student s[])
	{
		int C=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=null)
				{
					try
					{
						if(s[i].getName()==null)
						{
							C++;
						}
					}
					catch (Exception e)
					{
					}
				}
			}	
		}
		return C;
	}
	public int findNumberOfNullObjects(Student s[])
	{
		int C=0;
		if(s!=null)
		{
			for(int i=0;i<s.length;i++)
			{
				try
				{
					if(s[i]==null)
					{
					
						C++;
					}
				}
					catch(Exception e)
					{
						
					}
				}
			}
		return C;
	}

}
