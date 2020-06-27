package FlowControl;
import java.util.*;
public class p20 
{
	public static void main(String args[])
	{
		int n1;
		int n2;
		int sum;
		int diff;
		int choice;
		char cont;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. ADDITION");
			System.out.println("2. SUBSTRACTION");
			choice=sc.nextInt();
			n1=sc.nextInt();
			n2=sc.nextInt();
			switch(choice)
			{
			case 1:
				sum=n1+n2;
				System.out.println(sum);
				break;
			case 2: 
				diff=n1-n2;
				System.out.println(diff);
				break;
			}
			System.out.println("To continue press Y");
			cont=sc.next().charAt(0);
		}
		while(cont=='Y'||cont=='y');
		sc.close();
		}
}
