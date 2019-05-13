package com;

public class callingMethod {
	int a = 10;
	static int b = 20;

	void show() {
		//static int c;       static variable cannot be initialized in a nonstatic block
     System.out.println(a);
     System.out.println(b);
		
	}

	static void display() {
		//static int c;        static var cannot be initialize in a static block nd 
	//System.out.println(a);   static var cannot be call in a static method
	System.out.println(b);
	b=b+1;
	System.out.println(b);
	}
	public static void main(String[] args) {
		callingMethod cm=new callingMethod();
		cm.show();
		cm.display();
	}
}
