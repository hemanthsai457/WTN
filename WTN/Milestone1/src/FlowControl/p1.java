package FlowControl;
import java.util.Scanner;
public class p1 
{
	public static void main(String args[])
	{
		try {
				int n;
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();
				if(n>0) 
				{
					System.out.println("Positive number "+n);
				}
				else if(n<0)
				{
					System.out.println("Negative number "+n);
				}
				sc.close();
			}
		catch(Exception e)
		{
			System.out.println("Invalid entry");
		}
	}

}
