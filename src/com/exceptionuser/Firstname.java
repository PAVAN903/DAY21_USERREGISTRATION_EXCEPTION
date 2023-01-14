package com.exceptionuser;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Firstname {
	//static String fName;
	//static String lName;
	static String mail;
	
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
	static String mail() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail address");
		mail=sc.next();
		return  mail;
	}
	
	static void Print(String fName) {
		boolean pattern=Pattern.matches("abc.[a-z]+@bl.co.[a-z]+gmail", mail);
		if(pattern==true) {
			System.out.println(" "+mail+ " is valid mail");
		}else {
			System.out.println(" "+mail+ " is not valid mail");
	}
	}
     public static void main(String[] args) {
    	// String fName=fName();
    	 //String lName=lName();
    	 String mail=mail();
    	 System.out.println("mail address is:->");
    	 //Print(fName);
		 //Print(lName);
    	  Print(mail);

	}

}
