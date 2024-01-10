package com.fizzbuzz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fizzbuzz.dto.FizzBuzzDTO;
import com.fizzbuzz.service.FizzBuzzService;

@RestController
public class FizzBuzzController {
	private static final Logger logger = LoggerFactory.getLogger(FizzBuzzService.class);

	private FizzBuzzService fizzBuzzService;
	
	public FizzBuzzController(FizzBuzzService buzzService) {
		this.fizzBuzzService = buzzService;
	}
	
	@GetMapping("/convert")
	public ResponseEntity<String> fizzBuzzProblem(@RequestParam Integer a, @RequestParam Integer b, @RequestParam String fizz, @RequestParam String buzz, @RequestParam Integer limit){
		try {
			return new ResponseEntity<String>(fizzBuzzService.convertFizzBuzz(a, b, limit, fizz, buzz), HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Exception in fizzBuzz Controller", e);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/statistics")
	public ResponseEntity<FizzBuzzDTO> fizzBuzzStatistics(){
		try {
			return new ResponseEntity<FizzBuzzDTO>(fizzBuzzService.getStatistics(), HttpStatus.OK);
		} catch (Exception e) {
			logger.error("Exception in fizzBuzz Controller", e);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
