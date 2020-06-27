package ClassAndObjects;
class Calculator
{
	static int powerInt(int num1,int num2)
	{
		int pow=0;
		pow=num1^num2;	
		return pow;
	}
	static double powerDouble(double num1,double num2)
	{
		double pow1=0.0;
		pow1=Math.pow(num1,num2);
		return pow1;
	}
}

public class MAIN2 
{
	public static void main(String args[])
	{
		int a1;
		double a2;
		a1=Calculator.powerInt(10,20);
		a2=Calculator.powerDouble(10.0, 20.0);
		System.out.println(a1+"\n"+a2);
		
	}
}
