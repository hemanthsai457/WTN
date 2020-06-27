package FlowControl;
import java.util.*;
public class p17 
{
	public static void main(String args[])
	{
		int n;
		int rev = 0;
		int rem;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse is "+rev);
		sc.close();
		
	}

}
