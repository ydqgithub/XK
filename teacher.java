package com;

public class teacher extends member{
	String tlesson;
	public teacher(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		

	}
	public teacher(){
		
	}
	

	public void showsJAVA(){
		name="��һ"; 
		System.out.println("��ʦ����:"+name);
		}
	public void showsEn(){
		name="��һ"; sex="Ů"; xuehao=3002;
		System.out.println("��ʦ����:"+name);
	}
	public void showsIn(){
		name="��һ"; sex="��"; xuehao=3003;
		System.out.println("��ʦ����:"+name);
	}
	public void showsHi(){
		name="֣һ"; sex="Ů"; xuehao=3004;
		System.out.println("��ʦ����:"+name);
	}
	
}
