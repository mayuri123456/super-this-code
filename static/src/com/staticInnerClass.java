package com;

public class staticInnerClass {

static class A{
	static int a=10;
	int b=20;
	void display(){
		System.out.println("i m i  display method");
		
	}
	static void show(){
		int c=30;
		System.out.println("i m in show method ");
	}
	public static void main(String[] args) {
		A a=new A();
		a.show();
		a.display();
		System.out.println(a.b);
		System.out.println(a.a);
	}
}
}
