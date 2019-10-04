package com.test;

import org.junit.jupiter.api.Test;

import com.Addition;
import com.IncorrectDataException;

import junit.framework.Assert;

class AdditionTest {
	
	Addition addObj = new Addition();

	@Test
	void testAddTwoNumbers() {
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(10, 20));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(-10, 20));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(10, -20));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(-10, -20));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(0, 0));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Assert.assertEquals(30, addObj.addTwoNumbers(10, 0));
		} catch (IncorrectDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
