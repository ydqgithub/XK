package com;
import java.util.Scanner;
public class course extends teacher{

	public course(int xuehao, String name, String sex) {
		super(xuehao, name, sex);
		// TODO Auto-generated constructor stub	
	}
	public course(){
//		System.out.println("���ṩ�Ŀγ��б�"+Arrays.toString(keming));
		}
	
	int num;
	teacher teac=new teacher();
	String address,time;
	String cour[]={"Ӣ��","��ѧ","����","����"};

	Scanner scan =new Scanner(System.in);
	

	public void xk(String name){
		System.out.println("��ѡ��γ̣�(���Ϊ1-3)");
		num=scan.nextInt();
		
		if(num==1){
			address="121";
			time="17:00";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+cour[0]+",�γ̱��:"+num+", ���ң�"+address+", ʱ�䣺"+time);
			System.out.println("��ʦ��Ϣ��");
			super.showsJAVA();
		}else if(num==2){
			address="122";
			time="15:05";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+cour[1]+",�γ̱��:"+num+", ���ң�"+address+", ʱ�䣺"+time);
			System.out.println("��ʦ��Ϣ��");
			super.showsEn();
		}else if(num==3){
			address="123";
			time="10:30";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+cour[2]+",�γ̱��:"+num+", ���ң�"+address+", ʱ�䣺"+time);	
			System.out.println("��ʦ��Ϣ��");
			super.showsIn();
		}else if(num==4){
			address="124";
			time="08:40";
			System.out.println("����ѡ�Ŀγ�Ϊ:"+cour[3]+",�γ̱��:"+num+", ���ң�"+address+", ʱ�䣺"+time);	
			System.out.println("��ʦ��Ϣ��");
			super.showsHi();
		}
	}
	
	public void needtui(String name) {
		// TODO Auto-generated method stub
		System.out.println("�Ƿ���Ҫ�˿Σ���1���� 2����");
		int n;
		n=scan.nextInt();
				
		if(n==1){
			System.out.println("��������Ҫ�˿εĿγ̱�ţ�");
			num=scan.nextInt();
		    if(num==1){
				  System.out.println(cour[0]+"����ѡ");
			  }else if(num==2){
				  System.out.println(cour[1]+"����ѡ");
			  }else if(num==3){
				  System.out.println(cour[2]+"����ѡ");
			  }else if(num==4){
				  System.out.println(cour[3]+"����ѡ");
			  }
		}
		else if(n==2){
			System.out.println("�ɹ�ѡ��");
		}
		else{
			System.out.println("����������������룡");
		}
	}
}

