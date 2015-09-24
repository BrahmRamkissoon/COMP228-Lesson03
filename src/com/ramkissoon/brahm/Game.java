package com.ramkissoon.brahm;

import java.security.SecureRandom;

public class Game {

	// CONSTRUCTOR ++++++++++++++++++++++++++++++
	public Game(){
		
	}
	
	// PUBLIC METHODS ++++++++++++++++++++++++++
	//rollDice Method returns sum of series of dice rolls
	public static int rollDice(int numDice, int numSides){
		// Forces minimum of one die
		if (numDice <1) {
			numDice = 1;
		}
		
		// forces minimum of 4 sides
		if(numSides <4){
			numSides = 4;
			
		}
		
		System.out.printf("You selected %d die with %d sides %n",  numDice, numSides);
		
		
		SecureRandom generateRandom = new SecureRandom();
		int result = 0;
		
		for(int index=0; index < numDice; index++){
			result += generateRandom.nextInt(numSides) + 1;
		}		
		return result;
	}
}
