package ExceptionHandling;
import java.util.Scanner;
public class P1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array");
		int x;
		try
		{
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
				x=sc.nextInt();
				sc.close();
				System.out.println("The array element at index "+x+" = "+a[x]);
				System.out.println("The array element successfully accessed");
			}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
