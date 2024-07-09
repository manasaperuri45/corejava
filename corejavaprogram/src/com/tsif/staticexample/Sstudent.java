package com.tsif.staticexample;

public class Sstudent {
	int rollno;
	String name;
	 static String college= "Sri Indu";
	 static void change()
	 {
		 college= "IIT";
		 
	 }
	 Sstudent(int r, String n)
{
		 rollno= r;
		 name=n;
		 
		 }
	 void display() {
		 System.out.println(rollno+" "+name+" "+college);
	 }
}
