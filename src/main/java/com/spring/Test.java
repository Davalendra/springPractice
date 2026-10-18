package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
		
		Product pp = container.getBean("pro",Product.class);
		System.out.println(pp);
		
	}

	private static void dynamicDispatchAutowiring(ApplicationContext container) {
		Users use = container.getBean("use",Users.class);
		System.out.println(use);
		
		Address add=container.getBean("address",Address.class);
		System.out.println(add);
	}

	private static void list(ApplicationContext container) {
		Student stt = container.getBean("stu3",Student.class);
		System.out.println(stt);
	}

	private static void dataputting(ApplicationContext container) {
		Student student = container.getBean("stu",Student.class);
		System.out.println(student);
		
		Student student2=container.getBean("stu2",Student.class);
		System.out.println(student2);
	}

	private static void Singletione1(ApplicationContext container) {
		Student stu=container.getBean("stu",Student.class);
		System.out.println(stu);
		
		Student stu1=container.getBean("stu",Student.class);
		System.out.println(stu1);
		
//		by this we  knowing that Spring run automatically background Singletone only
	}

	private static void Singletone() {
		Singletone s=Singletone.getSingletone();
		System.out.println(s);
		
		Singletone s2=Singletone.getSingletone();
		System.out.println(s2);
	}

}
