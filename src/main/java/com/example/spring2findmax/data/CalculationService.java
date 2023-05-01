package com.example.spring2findmax.data;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class CalculationService {
	
	private DataService dataService;
	
	public CalculationService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findMax() {
		
		int max = Arrays.stream(dataService.retrieveData()).max().orElse(0);
		return max;
		
	}
	

}
