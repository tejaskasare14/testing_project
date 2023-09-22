package com.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingApplicationTests {
	
	Calculator calculator = new Calculator();

	@Test
	void testAdd()
	{
		int expectedResult = 10;
		int actualResult = calculator.add(5, 5);
		
		assertEquals(expectedResult, actualResult);
		//assertThat(expectedResult).isEqualTo(actualResult);
	}
	
	@Test
	void testMul()
	{
		int expectedResult = 20;
		int actualResult = calculator.mul(4, 5);
		
		assertEquals(expectedResult, actualResult);
		//assertThat(expectedResult).isEqualTo(actualResult);
	}

}
