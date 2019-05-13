package com;

public class accessVariable {
	static int i = 10;

	public static void main(String[] args) {
		accessVariable av = new accessVariable();// calling by object creation

		System.out.println(av.i);
		accessVariable av1 = null;// calling by putting null

		System.out.println(av1.i);// calling by object creation
		System.out.println(accessVariable.i);// calling by class name
	}
}
