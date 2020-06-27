package FlowControl;

public class p3 
{
	public static void main(String args[])
	{
		if(args.length>0)
		{
			System.out.print(args[0]);
			for(int s=1;s<args.length;s++)
			{
				System.out.print(","+args[s]);
				
			}
		}
		else
		{
			System.out.println("No arguments");
		}
	}

}
