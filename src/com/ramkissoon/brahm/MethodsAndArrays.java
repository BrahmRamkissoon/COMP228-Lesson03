package com.ramkissoon.brahm;

import java.security.SecureRandom;
import java.util.Scanner;



public class MethodsAndArrays {
	
	public static void main(String[] args) {
		Game  game = new Game();
	
		Scanner input = new Scanner(System.in);
		int numDice = 0;	
		int numSides = 0;	
		
		try {
			System.out.println("Enter the number of die");
			numDice = input.nextInt();
			
			System.out.println("Enter the number of sides");
			numSides = input.nextInt();
			
			System.out.printf("You rolled %d%n", game.rollDice(numDice,  numSides));
			
		} catch (Exception e) {
			System.out.println("You've entered invalid data!");
		}
			
				
	}
}
