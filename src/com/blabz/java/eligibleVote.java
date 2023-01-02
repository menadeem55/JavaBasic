package com.blabz.java;

import java.util.Scanner;

public class eligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age!!");
		Scanner sc = new Scanner(System.in);	//using scanner for taking input from user
		int age = sc.nextInt();		//using variable for store data
		if(age>=18)	
			System.out.println("Your are Elegable for Vote");
		else
			System.out.println("You are under Age.");
		

	}

}
