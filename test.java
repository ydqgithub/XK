package com;

import java.util.Scanner;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner scan = new Scanner(System.in);	
		course c=new course();
		
		System.out.println("ÊäÈëĞÕÃû£º");
		name=scan.next();
		
		student s1=new student();
		c.xk(s1.name);
		c.needtui(s1.name);
		
	}

}
