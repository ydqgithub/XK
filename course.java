package com;
import java.util.Scanner;
public class course extends teacher{

	public course(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		// TODO Auto-generated constructor stub	
	}
	public course(){
//		System.out.println("所提供的课程列表："+Arrays.toString(keming));
		}
	
	int num;
	teacher teac=new teacher();
	String address,time;
	String cour[]={"英语","数学","音乐","美术"};

	Scanner scan =new Scanner(System.in);
	

	public void xk(String name){
		System.out.println("请选择课程：(编号为1-3)");
		num=scan.nextInt();
		
		if(num==1){
			address="121";
			time="17:00";
			System.out.println("您所选的课程为:"+cour[0]+",课程编号:"+num+", 教室："+address+", 时间："+time);
			System.out.println("教师信息：");
			super.showsJAVA();
		}else if(num==2){
			address="122";
			time="15:05";
			System.out.println("您所选的课程为:"+cour[1]+",课程编号:"+num+", 教室："+address+", 时间："+time);
			System.out.println("教师信息：");
			super.showsEn();
		}else if(num==3){
			address="123";
			time="10:30";
			System.out.println("您所选的课程为:"+cour[2]+",课程编号:"+num+", 教室："+address+", 时间："+time);	
			System.out.println("教师信息：");
			super.showsIn();
		}else if(num==4){
			address="124";
			time="08:40";
			System.out.println("您所选的课程为:"+cour[3]+",课程编号:"+num+", 教室："+address+", 时间："+time);	
			System.out.println("教师信息：");
			super.showsHi();
		}
	}
	
	public void needtui(String name) {
		// TODO Auto-generated method stub
		System.out.println("是否需要退课？（1：是 2：否）");
		int n;
		n=scan.nextInt();
				
		if(n==1){
			System.out.println("请输入需要退课的课程编号：");
			num=scan.nextInt();
		    if(num==1){
				  System.out.println(cour[0]+"已退选");
			  }else if(num==2){
				  System.out.println(cour[1]+"已退选");
			  }else if(num==3){
				  System.out.println(cour[2]+"已退选");
			  }else if(num==4){
				  System.out.println(cour[3]+"已退选");
			  }
		}
		else if(n==2){
			System.out.println("成功选课");
		}
		else{
			System.out.println("输入错误，请重新输入！");
		}
	}
}

