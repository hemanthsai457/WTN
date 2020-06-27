package FlowControl;

import java.util.Scanner;

public class p2 
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even "+n);
		}
		else
		{
			System.out.println("odd "+n);
		}
		sc.close();
	}
}
