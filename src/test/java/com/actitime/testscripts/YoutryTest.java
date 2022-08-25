package com.actitime.testscripts;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class YoutryTest extends BaseClass{
	@Test(groups="regressionTest")
	public void sipleTest() {
		System.out.println("good");
	}
	

}
