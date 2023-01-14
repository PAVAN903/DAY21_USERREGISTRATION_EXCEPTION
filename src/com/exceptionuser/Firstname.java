package com.exceptionuser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	static String fName;
	static String lName;
	static String mail;
    static String mNumber;
	static String password;
	static String uPASSWORD;
	
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
	static String mail() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail address");
		mail=sc.next();
	return  mail;
	}
	static String mNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mobile number");
	     mNumber=sc.nextLine();
		return  mNumber;
	}
	static String password() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
	     password=sc.next();
		return password;
	}
	static String uPASSWORD() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
	     uPASSWORD=sc.next();
		return uPASSWORD;
	}
	static void Print(String uPASSWORD) {
		boolean pattern=Pattern.matches("[A-Z]{1}[a-z]{8,}", uPASSWORD);
		if(pattern==true) {
			System.out.println(" "+uPASSWORD+ " is valid password number");
		}else {
			System.out.println(" "+uPASSWORD+ " is not valid password number");
	}
	}
     public static void main(String[] args) {
    	 String fName=fName();
    	 String lName=lName();
    	 String mail=mail();
    	 String mNumber=mNumber();
    	 String password=password();
    	 String password1=uPASSWORD();
    	 System.out.println("password  is:->");
    	 Print(fName);
		 Print(lName);
    	 Print(mail);
    	 Print(password1);
    	 Print(password1);
    	

	}

}
