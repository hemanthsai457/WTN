package AbstractClasses;
import java.util.concurrent.ThreadLocalRandom;
abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	@Override
	public String notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is FirstClass Compartment");
		return "FirstClass";
	}
}

class Ladies extends Compartment
{

	@Override
	public String notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is Ladies Compartment");
		return "Ladies";
	}
}

class General extends Compartment
{

	@Override
	public String notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is General Compartment");
		return "General";
	}
}

class Luggage extends Compartment
{

	@Override
	public String notice() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is Luggage Compartment");
		return "Luggage";
	}
}
public class TestCompartment 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadLocalRandom random=ThreadLocalRandom.current();
		Compartment[] co=new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int r=random.nextInt(1,5);
			switch(r)
			{
				case 1:
					co[i]=new FirstClass();
					break;
				case 2:
					co[i]=new Ladies();
					break;
				case 3:
					co[i]=new General();
					break;
				case 4:
					co[i]=new Luggage();
					break;
			}
			System.out.println("Notice : "+co[i].notice());
		}
	}
}
