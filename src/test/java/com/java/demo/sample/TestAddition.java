package com.java.demo.sample;

import java.util.Calendar;

import org.testng.annotations.Test;

import junit.framework.Assert;

@Test
public class TestAddition {

	
	@Test
	public void testPositiveAdditionCase() {
		CalculaterApp obj = new CalculaterApp();
		try {
			int result  = obj.addition(100, 203);
			Assert.assertEquals(303, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(expectedExceptions = Exception.class)
	public void testNegativeAdditionCase() throws Exception {
		CalculaterApp obj = new CalculaterApp();
		int result  = obj.addition(-100, 203);
	}


}

