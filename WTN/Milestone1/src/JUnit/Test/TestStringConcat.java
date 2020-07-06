package com.wipro.test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.wipro.task.DailyTasks;
public class TestStringConcat 
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
	public void TestConcat()
	{
		assertEquals("output mismatch","hari Kiran",d.doStringConcat("hari","Kiran"));
	}

}
