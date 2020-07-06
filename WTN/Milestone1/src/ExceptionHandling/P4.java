package ExceptionHandling;

import java.util.Scanner;

class InvalidCountryException extends Exception
{
	InvalidCountryException()
	{
		System.out.println("User outside India cannot be registered");
	}
}

public class P4 
{
	static void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(username==null)
		{
			System.out.println("Enter username");
		}
		if(userCountry.equalsIgnoreCase("india"))
		{
			System.out.println("User Registeration done successfully");
		}
		else
		{
			System.out.println("InvalidCountryException must be thrown");
			throw new InvalidCountryException();
		}
		
	}
	public static void main(String[] args) throws InvalidCountryException 
	{
		// TODO Auto-generated method stub
		try
		{
			String uname;
			String ucountry;
			Scanner sc=new Scanner(System.in);
			uname=sc.nextLine();
			String [] a=uname.split(",");
			uname=a[0];
			ucountry=a[1];
			registerUser(uname,ucountry);
			sc.close();
		}
		catch(Exception e)
		{
		}
	}

}
