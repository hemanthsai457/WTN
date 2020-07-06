package ExceptionHandling;

class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		System.out.println("Under Age Exception");
	}
}
class OverAgeException extends Exception
{
	OverAgeException()
	{
		System.out.println("Over Age Exception");
	}
}

class ValueNullException extends Exception
{
	ValueNullException()
	{
		System.out.println("The value is Null for the above inputs");
	}
}

public class P5 {

	public static void main(String[] args) throws ValueNullException
	{
		// TODO Auto-generated method stub
		String name;
		int age;
		try 
		{
			name=args[0];
			age=Integer.parseInt(args[1]);
			if(name==null)
			{
				throw new ValueNullException();
			}
			if(age<=18)
			{
				throw new UnderAgeException();
			}
			else if(age>60)
			{
				throw new OverAgeException();
			}
			System.out.print(name+"\n"+age);
		}
		catch(Exception e)
		{
			System.exit(0);
		}
	}
}