package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
public class StudentReport 
{
	public String findGrades(Student studentObject)
	{
		int marks[]=studentObject.getMarks();
		String grade="";
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
			{
				grade="F";
			}
			else
			{
				sum+=marks[i];
			}
		}
		if(sum<150)
		{
			grade="C";
		}
		else if(sum<200)
		{
			grade="B";
		}
		else if(sum<250)
		{
			grade="A";
		}
		else
		{
			grade="A+";
		}
		return grade;
	}
	public String validate (Student studentObject) throws NullStudentObjectException, NullNameException, NullMarksArrayException	
	{
				if (studentObject == null) 
				{
					throw new NullStudentObjectException();
				} 
				else 
				{
					if (studentObject.getName() == null) throw new NullNameException();
					if (studentObject.getMarks() == null) throw new NullMarksArrayException();	
					return findGrades(studentObject);
				}
			}

}
