package com.wipro.test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.wipro.task.DailyTasks;
public class TestSort 
{
	DailyTasks d;
	@Before
	public void before()
	{
		d=new DailyTasks();
	}
	@After
	public void after()
	{
		d=null;
	}
	@Test
	public void testsort()
	{
		int [] a={10,40,30,20};
		int [] b={10,20,30,40};
			assertArrayEquals("Error !",b,d.sortValues(a));
	}

}
