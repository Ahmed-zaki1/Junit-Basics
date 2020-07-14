package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class MyMathTest {
	MyMath myMath=new MyMath();
	@After
	public void before() {
		System.out.println("After");
	}
	
	@Test
	public void sum_with3numbers() {

		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));

	}
	@Test
	public void sum_with1number()
	{

	System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));

	}

}
