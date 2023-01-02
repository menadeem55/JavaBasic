package com.blabz.java;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");	
		Scanner sc = new Scanner(System.in);	//using scanner for taking input from user
		int num = sc.nextInt();			//using variable for store data
		if(num % 2 == 0)	//checking condition for Even number
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
