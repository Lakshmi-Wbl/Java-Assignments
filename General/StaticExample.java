package com.General;

public class StaticExample {
	
		int rollNumber;
		String stname;
		static String collegeName="Chaitanya";
		
		static void nameChange(){
			collegeName="JNTU";
		}
		
		StaticExample(int a, String b){
			rollNumber=a;
			stname=b;
		}
		
		public void display(){
			System.out.println("Register Number:"+rollNumber+" Student name:"+stname+" College:"+collegeName);
		}
		

		public static void main(String[] args) {
			StaticExample.nameChange();
			StaticExample s1=new StaticExample(1,"Nikhil");
			StaticExample s2=new StaticExample(2,"Sruthi");
			StaticExample s3=new StaticExample(3,"Rashmi");
			
			s1.display();
			s2.display();
			s3.display();

		}

	}


