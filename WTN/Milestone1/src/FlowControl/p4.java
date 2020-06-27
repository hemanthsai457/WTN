package FlowControl;
import java.util.*;
public class p4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		if(ch1>ch2)
		{
			System.out.println(ch2+" "+ch1);
			
		}
		else if(ch1<ch2)
		{
			System.out.println(ch1+" "+ch2);
		}
		sc.close();
	}

}
