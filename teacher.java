package com;

public class teacher extends member{
	String tlesson;
	public teacher(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		

	}
	public teacher(){
		
	}
	

	public void showsJAVA(){
		name="张一"; 
		System.out.println("教师姓名:"+name);
		}
	public void showsEn(){
		name="刘一"; sex="女"; xuehao=3002;
		System.out.println("教师姓名:"+name);
	}
	public void showsIn(){
		name="赵一"; sex="男"; xuehao=3003;
		System.out.println("教师姓名:"+name);
	}
	public void showsHi(){
		name="郑一"; sex="女"; xuehao=3004;
		System.out.println("教师姓名:"+name);
	}
	
}
