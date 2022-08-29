package com.actitime.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class Practice3Test extends BaseClass{


	@Test(groups="smokeTest") 
	public void createTest()
	{
		System.out.println("Test assigned");
		driver.get("https://www.amazon.in/");
	}
	
	@Test(groups="regressionTest")
	public void editTest()
	{
		System.out.println("Edit Test");
	}
	
	@Test(groups="regressionTest")
	public void deleteTest()
	{
		System.out.println("Test Deleted");
	}
}
