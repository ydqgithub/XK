# 计G201 杨东奇 2020322083
## 实验报告
## 实验目的
1 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；<br/>
2 掌握面向对象的类设计方法（属性、方法）；<br/>
3 掌握类的继承用法，通过构造方法实例化对象；<br/>
4 学会使用super（），用于实例化子类；<br/>
5 掌握使用 Object根类的toString（）方法，应用在相关对象的信息输出中。<br/>
## 二、实验要求
> 1.学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。<br/>
> 2.每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每门学生仅选一门课程。<br/>
> 3.人员（编号、姓名、性别），教师（编号、姓名、性别、所授课程），学生（编号、姓名、性别、所选课程），课程（编号、课程名称、上课地点、时间、授课教师）。<br/>
> 4.编写上述实体类以及测试主类（主意类之间继承关系的使用）。<br/>
> 5.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师、教师性别、教师编号）。<br/>
> 6.模拟学生退课操作，再打印课程信息。
## 三、实验过程
1.新建成员类，类中定义基本属性，建立构造方法。<br/>

    public member(int xuehao,String name,String sex){
    
2.子类student类和teacher类都继承父类member,course类又继承teacher类<br/>

		public class Student extends member{
		public class Teacher extends member{
    public class Course extends teacher{
	
3.test类定义Scanner构造器，接收从控制台输入的信息。<br/>
		
		Scanner scan = new Scanner(System.in);	
		course c=new course();
		
## 四、实验流程图
![image](https://github.com/ydqgithub/XK/blob/main/images/lct.jpg)
## 五、核心代码、注释
1.分别将各位老师的信息写在方法中例如以下代码中存储在teacher类中，course类可以通过super.方法名来调用。

		public void showsJAVA(){
		name="张一";
		System.out.println("教师姓名:"+name);
	}
    super.showsJAVA();
2.用数组存放课程信息。

    String cour[]={"英语","数学","音乐","美术"};
 
3.根基控制台用户输入的课程号进行选课。

		num=scan.nextInt();

4.test类调用course类的xk（）方法和needtui()方法来打印选课信息和退课信息。

		c.choseLesson(s1.name);
		c.needtui(s1.name);
## 六、系统运行截图
![image](https://github.com/ydqgithub/XK/blob/main/images/ydq.jpg)
## 七、编程感想
* 不会使用object的.toString()方法未遍历出数组。<br/>
* 需要使用构造器Scanner获取控制台信息以及无参的构造方法与带参的构造方法super的写法。<br/>
* 学习了实例化各类<br/>
