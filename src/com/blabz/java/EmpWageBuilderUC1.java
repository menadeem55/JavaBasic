package com.blabz.java;

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;		//using variable for store data
		double empCheck = Math.floor(Math.random() * 10) % 2;	//using inbuilt method for checking condition
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abscent");
	}

}
