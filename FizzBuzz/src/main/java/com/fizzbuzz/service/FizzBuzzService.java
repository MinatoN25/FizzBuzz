package com.fizzbuzz.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fizzbuzz.dto.FizzBuzzDTO;

@Service
public class FizzBuzzService {

	private static final Logger logger = LoggerFactory.getLogger(FizzBuzzService.class);
	private Map<FizzBuzzDTO, Integer> fizzMap = new HashMap<>();

	public String convertFizzBuzz(int a, int b, int limit, String fizz, String buzz) {
		StringBuilder sb = new StringBuilder();
		try {
			FizzBuzzDTO fizzDTO = new FizzBuzzDTO(a, b, limit, fizz, buzz);
			fizzMap.put(fizzDTO, fizzMap.getOrDefault(fizzDTO, 0) + 1);
			for (int i = 1; i <= limit; i++) {
				if (i % a == 0 && i % b == 0) {
					sb.append(fizz).append(buzz).append(",");
				} else if (i % a == 0) {
					sb.append(fizz).append(",");
				} else if (i % b == 0) {
					sb.append(buzz).append(",");
				} else {
					sb.append(i).append(",");
				}
			}
			if (sb.length() > 0) {
				sb.setLength(sb.length() - 1);
			}
		} catch (Exception e) {
			logger.error("Exception in convertFizzBuzz", e);
		}
		return sb.toString();
	}

	public FizzBuzzDTO getStatistics() {
		FizzBuzzDTO res = null;
		try {
			int max = 0;

			for (Map.Entry<FizzBuzzDTO, Integer> entry : fizzMap.entrySet()) {
				if (entry.getValue() > max) {
					max = entry.getValue();
					res = entry.getKey();
				}
			}
			
			res.setHitCount(max);
		} catch (Exception e) {
			logger.error("Exception in getStatistics", e);
		}
		return res;
	}
}
