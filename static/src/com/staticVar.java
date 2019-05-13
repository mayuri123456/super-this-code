package com;

public class staticVar {
	static int a = 10;
	 int b = 20;
	 void display() {
			//static int c;        static var cannot be initialize in a static block nd 
		//System.out.println(a);   static var cannot be call in a static method
		System.out.println("this is display method");
	
		}
		

	 static void show() {
		//static int c;       static variable cannot be initialized in a nonstatic block
     System.out.println("this is static method");
     
		
	}
	 {
		 display();
	 }
	 static{
		 System.out.println(a);
		// System.out.println("this is static method"+b);
		    
	 }
	public static void main(String[] args) {
		staticVar vr=new staticVar();
		vr.show();
		vr.display();
		staticVar s1 =null;
		s1.show();
	}

}
