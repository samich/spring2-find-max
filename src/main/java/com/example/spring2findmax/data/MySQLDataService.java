package com.example.spring2findmax.data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService {
	
	public int[] retrieveData() {
		return new int[] {1, 2, 12, 3, 4, 5};
	}

}
