package com.exceptionuser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	static String fName;
	static String lName;
	
	static String fName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		fName=sc.next();
		return fName;
	}
	static String lName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter last name ");
		lName=sc.next();
		return lName;
	}
	
	static void Print(String fName) {
		boolean pattern=Pattern.matches("[A-Z]{1}[a-z]{3,}", lName);
		if(pattern==true) {
			System.out.println(" "+lName+ "is valid name");
		}else {
			System.out.println(" "+lName+ "is not valid name");
	}
	}
     public static void main(String[] args) {
    	 String fName=fName();
    	 String lName=lName();
    	 System.out.println("last name is:->");
    	 Print(fName);
		Print(lName);

	}

}
