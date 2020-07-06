package com.wipro.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.wipro.task.DailyTasks;
public class TestCheckPresence 
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
	public void TestPresence()
	{
		assertTrue("Output Mismatch",d.checkPresence("Hari","i"));
	}
	@Test 
	public void TestPresence1()
	{
		assertFalse("Output",d.checkPresence("bot","B"));
	}

}
