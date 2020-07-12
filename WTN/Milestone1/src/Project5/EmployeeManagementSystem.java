package Project5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EmployeeManagementSystem 
{
	
	public static void writetofile(int id,String name,int age,int salary)
	{
		try
		{
			  FileWriter fstream = new FileWriter("C:\\Users\\heman\\OneDrive\\Desktop\\WTN\\Employeedetails.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(id+" "+name+" "+age+" "+salary+" "+"\n");
			  out.close();
		  }
		catch (Exception e)
		{
			 System.err.println("Error while writing to file: "+e.getMessage());
		  }
	}
	
	public static void retrievefromfile()
	{
		String line=null;
		try
	    {
	        FileReader fileReader = new FileReader("C:\\Users\\heman\\OneDrive\\Desktop\\WTN\\Employeedetails.txt");
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        while((line = bufferedReader.readLine()) != null)
	        {
	            System.out.println(line);
	        }
	        bufferedReader.close();
	    }
	    catch(Exception ex)
	    {
	        System.out.println("Error reading file ");
	    }
	}
	
	public static void main(String[] args)
	{
		int choice;
		int empid;
		String name;
		int empsalary;
		int age;
		// TODO Auto-generated method stub
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Main Menu");
			System.out.println("1.Add an Employee");
			System.out.println("2.Display All");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter Employee ID:");
					empid=sc.nextInt();
					System.out.println("Enter Employee Name:");
					name=sc.next();
					System.out.println("Enter Employee Age");
					age=sc.nextInt();
					System.out.println("Enter Employee Salary:");
					empsalary=sc.nextInt();
					writetofile(empid,name,age,empsalary);
					break;
				case 2:
					System.out.println("----Report----");
					retrievefromfile();
					System.out.println("----End Of Report----");
					break;
					
				case 3:
					System.out.println("Exiting the System");
					System.exit(0);
			}
			
		}
	}

}
