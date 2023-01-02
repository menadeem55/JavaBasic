package com.blabz.java;

import java.util.Scanner;

public class Experience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Age");
		Scanner sc = new Scanner(System.in);	//using scanner for taking input from user
		int age = sc.nextInt();		//using variable for store data
		if(age>=60)		//using if-else ladder for checking condition
			System.out.println("You are Retired.. Enjoy your life");
		else if(age >50 && age <40)
		System.out.println("you are Highly Experienced");
		else if(age >20 && age < 40)
			System.out.println("You are Experienced");
		else if(age >=18 )
			System.out.println("Fresher");
		else
			System.out.println("Not Elegable");
	}

}
