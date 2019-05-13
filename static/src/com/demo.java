package com;

public class demo {
	static int a = 10;
	static int b = 20;
 
	void m1(){
		System.out.println(a);
	}
	
	 static void m2(){
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		demo d = new demo();
		d.m1();
		demo d6=new demo();
		d6.m2();
/*
		demo d1 = new demo();
		int x = d1.a++;
		int y = d1.b++;
		System.out.println(x);
		System.out.println(y);

		demo d2 = new demo();
		int s = d2.a++;
		int t = d2.b++;
		System.out.println(s);
		System.out.println(t);


*/
	}
}
