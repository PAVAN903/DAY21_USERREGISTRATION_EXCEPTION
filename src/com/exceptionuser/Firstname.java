package com.exceptionuser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	static String fName;
	
	static String fName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		fName=sc.next();
		return fName;
	}
	static void Print(String fName) {
		boolean pattern=Pattern.matches("[A-Z]{1}[a-z]{3,}", fName);
		if(pattern==true) {
			System.out.println(" "+fName+ "is valid name");
		}else {
			System.out.println(" "+fName+ "is not valid name");
	}
	}
     public static void main(String[] args) {
    	 String fName=fName();
    	 System.out.println("first name is:->");
		Print(fName);

	}

}
