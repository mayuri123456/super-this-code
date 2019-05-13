package com;

public class personTest extends person
{
	
int age =60;
 void insertStudent(){
	int age =90;
	System.out.println(super.age);
	
	person p=new person();
	System.out.println(p.age);

System.out.println(age);
System.out.println(this.age);}
	

public static void main(String [] args){
	personTest pt = new personTest();
	pt.insertStudent();
}}


