package com.fizzbuzz.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.fizzbuzz.dto.FizzBuzzDTO;

@RunWith(SpringRunner.class)
public class FIzzBuzzServiceTest {

	
	@InjectMocks
	FizzBuzzService fizz;
	
	
	@Test
	public void testFizzBuzzPositive() {
		String s =fizz.convertFizzBuzz(2, 5, 50, "fizz", "buzz");
		assertEquals("1,fizz,3,fizz,buzz,fizz,7,fizz,9,fizzbuzz,11,fizz,13,fizz,buzz,fizz,17,fizz,19,fizzbuzz,21,fizz,23,fizz,buzz,fizz,27,fizz,29,fizzbuzz,31,fizz,33,fizz,buzz,fizz,37,fizz,39,fizzbuzz,41,fizz,43,fizz,buzz,fizz,47,fizz,49,fizzbuzz", s);
	}
	
	@Test
	public void testFizzBuzzNegative() {
		String s =fizz.convertFizzBuzz(2, 5, 50, "fizz", "buzz");
		assertNotEquals("7,fizz,49,fizzbuzz", s);
	}
	
	@Test
	public void testStatisticsPositive() {
		fizz.convertFizzBuzz(2, 7, 50, "fizz", "buzz");
		FizzBuzzDTO dto =fizz.getStatistics();
		FizzBuzzDTO dtoEx = new FizzBuzzDTO(2, 7, 50, "fizz", "buzz");
		dtoEx.setHitCount(1);
		assertEquals(dtoEx.toString(), dto.toString());
	}
}
