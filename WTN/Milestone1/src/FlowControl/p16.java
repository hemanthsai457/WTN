package FlowControl;
import java.util.*;
public class p16 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		try
		{
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*	");
			}
			System.out.println();
		}
		}
		catch(Exception e)
		{
			System.out.println("Please enter an integer value");
		}
		sc.close();
	}
	

}
