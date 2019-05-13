package com;

public class constructorCall extends person{
	constructorCall(){
		super();
		System.out.println("constructor is created");
	}
public static void main(String[] args) {
	constructorCall c=new constructorCall();
}
}
