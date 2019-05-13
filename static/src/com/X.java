package com;

public class X extends A {   //class cannot be static
/*void m1(){             //final method cannot be override
	static int c=10;	//local variable static nahi hote
	}
*/	
	
	
	
	
	public static void main(String[] args) {
		A a=new A();
		
		a.a++;
		a.b++;
		System.out.println(a.a);
		System.out.println(a.b);
		
		A aa=new A();
		aa.a++;
		aa.b++;
		System.out.println(aa.a);
		System.out.println(aa.b);
		System.out.println(a.b);
//	A.a++;
	A.b++;
	System.out.println(a.b);
	
	
	
	
	
	}
}
