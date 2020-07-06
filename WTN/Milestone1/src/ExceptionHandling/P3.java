package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class negativevaluesException extends Exception
{
	public negativevaluesException()
	{
		super();
		System.out.println("Negative Values Exception");
	}
}

class valueoutofrangeException extends Exception
{
	public valueoutofrangeException()
	{
		super();
		System.out.println("Values out of range Exception");
	}
}

public class P3 
{
	public static void main(String[] args) throws negativevaluesException, valueoutofrangeException
	{
		// TODO Auto-generated method stub
		String name="";
		int m1;
		int m2;
		int m3;
		int t=2;
		int avg=0;
		Scanner sc=new Scanner(System.in);
		try 
		{
			while(t>0)
			{
				name=sc.nextLine();
				m1=sc.nextInt();
				m2=sc.nextInt();
				m3=sc.nextInt();
				if(m1<0)
					{
						throw new negativevaluesException();
					}
				if(m1>100)
					{
						throw new valueoutofrangeException();
					}
				if(m2<0)
					{
						throw new negativevaluesException();
					}
				if(m2>100)
					{
						throw new valueoutofrangeException();
					}
				if(m3<0) 
					{
						throw new negativevaluesException();
					}
				if(m3>100)
					{
						throw new valueoutofrangeException();
					}
					avg=(m1+m2+m3)/3;
					System.out.println(avg);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Number Format Exception");
		}
		catch(valueoutofrangeException e)
		{
			System.out.println(e.getMessage());
		}
		catch(negativevaluesException e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}

}
