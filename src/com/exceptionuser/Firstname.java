package com.exceptionuser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	//static String fName;
	//static String lName;
	//static String mail;
	static String mNumber;
	
	//static String fName() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter first name");
		//fName=sc.next();
		//return fName;
	//}
	//static String lName() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter last name ");
		//lName=sc.next();
		//return lName;
	//}
	//static String mail() {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter mail address");
		//mail=sc.next();
		//return  mail;
	//}
	static String mNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mobile number");
	     mNumber=sc.nextLine();
		return  mNumber;
	}
	static void Print(String mNumber) {
		boolean pattern=Pattern.matches("[+]?{1}[0-9]{2}[\\s]?{1}[7-9]{1}[0-9]{9}", mNumber);
		if(pattern==true) {
			System.out.println(" "+mNumber+ " is valid mobile number");
		}else {
			System.out.println(" "+mNumber+ " is not valid mobile number");
	}
	}
     public static void main(String[] args) {
    	// String fName=fName();
    	 //String lName=lName();
    	 //String mail=mail();
    	 String mNumber=mNumber();
    	 System.out.println("mobile number  is:->");
    	 //Print(fName);
		 //Print(lName);
    	 // Print(mail);
    	 Print(mNumber);

	}

}
