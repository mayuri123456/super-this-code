package com;

public class printStatement {
	
static int a=10;
static int d;
int b =20;
static{
	int d=50;
}
static void m1() {
	// TODO Auto-generated method stub
	int i=40;
	System.out.println(a);
	System.out.println(i);
	System.out.println("d===="+d);
}
void m2(){
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {
	//printStatement s=new printStatement();
	printStatement .m1();
	//s.m2();
	
}

}
