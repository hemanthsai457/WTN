package ExceptionHandling;

public class P2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int l=5;
		int s;
		int a;
		int[] ar=new int[l];
		try 
		{
			for(int i=0;i<l;i++)
			{
				ar[i]=Integer.parseInt(args[i]);
			}
			s=sumofele(ar,l);
			a=avgofele(s,l);
			System.out.println(a+"\n"+s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	private static int avgofele(int s, int l) {
		// TODO Auto-generated method stub
		int avg=0;
		avg=s/l;
		return avg;
	}

	private static int sumofele(int[] ar, int l) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<l;i++)
		{
			sum+=ar[i];
		}
		return sum;
		
	}
}
