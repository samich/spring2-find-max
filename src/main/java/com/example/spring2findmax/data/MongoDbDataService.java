package com.example.spring2findmax.data;

import org.springframework.stereotype.Component;

@Component
public class MongoDbDataService implements DataService {
	
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 44, 55};
	}
	

}
