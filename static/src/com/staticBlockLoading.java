package com;

public class staticBlockLoading {
	static int a;

	staticBlockLoading() {
		System.out.println("i m in costructor");
	}

	{
		System.out.println("i m in nonstatic block");
	}
	static {
		System.out.println("i m in static block");
		a = 10;
	}

	public static void main(String[] args) {
		staticBlockLoading sb = new staticBlockLoading();
		staticBlockLoading sb1 = new staticBlockLoading();

	}
}
