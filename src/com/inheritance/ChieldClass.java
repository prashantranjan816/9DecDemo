package com.inheritance;

public class ChieldClass extends InheritanceTest{
	
public static void main(String[] args) {
	ChieldClass c1=new ChieldClass();
	c1.m1(100, 200, 300);
}
int  m1(int a,int b,int c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	return 0;
	
}



}
