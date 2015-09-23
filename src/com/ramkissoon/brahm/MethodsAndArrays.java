package com.ramkissoon.brahm;

import java.security.SecureRandom;

public class MethodsAndArrays {

	public static void main(String[] args) {
		SecureRandom generateRandom = new SecureRandom();
		int die1 = 0;
		int die2 = 0;
		int dice = 0;
		
		// generate a number betwween 2 and 12
		
		die1 = generateRandom.nextInt(6) + 1;
		die2 = generateRandom.nextInt(6) + 1;
		
		dice = die1 + die2;
		
		System.out.println(rollDice(2,6));
		

	}
	
	public static int rollDice(int numDice, int numSides){
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		
		for(int index=0; index < numDice-1; index++){
			result += generateRandom.nextInt(numSides) + 1;
		}
		
		return result;
	}
}
