package com.cavalier.atm.back;

import java.util.List;

public class Compute {

	public static int add(List<Integer> numberList) {
		int sum = 0;
		for(Integer value : numberList){
			sum+=value;
		}
		return sum;
	}

	/*public static int add(Integer... numbers) {
		int sum = 0;
		for(Integer value : numbers){
			sum += value;
		}
		return sum;
	}*/
	
	

}
