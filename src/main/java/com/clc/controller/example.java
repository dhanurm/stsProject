package com.clc.controller;

public class example {
	public static void main(String[] args) {
		// A a = new B();
		// a.m1();
		// System.out.println(a.i);

		String s1 = "Abc";
		String s2 = s1 + "nsfsf";
		String s4 = new String(s1 + "nsfsf");
		String s3 = s1 + "nsfsf";
		final String s5=s1+"nsfsf";
		
		System.out.println("dgjgsd");
//		
//		System.out.println(s2 == s3);
//		System.out.println(s2 == s5);
//		System.out.println(s3 == s4);		
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//				
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
//		String s;
//		
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}
}


enum TrafficSignal 
{ 
    // This will call enum constructor with one 
    // String argument 
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"); 
  
    // declaring private variable for getting values 
    private String action; 
  
    // getter method 
    public String getAction() 
    { 
        return this.action; 
    } 
  
    // enum constructor - cannot be public or protected 
    private TrafficSignal(String action) 
    { 
        this.action = action; 
    } 
} 
class A {
	int i = 10;

	public void m1() {
		System.out.println("M1 parent");
	}
}

class B extends A {
	int i = 20;

	@Override
	public void m1() {
		System.out.println("M1 child");
	}

}
