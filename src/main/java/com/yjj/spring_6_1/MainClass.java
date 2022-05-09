package com.yjj.spring_6_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml","classpath:applicationCTX2.xml");
		//스프링 컨테이너 생성(ctx)
		
		Student stu1 = ctx.getBean("student1", Student.class);
		
		System.out.println(stu1.getName());
		
		StudentInfo stuInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student stu00 = stuInfo.getStudent();
		
		System.out.println(stu00.getName());
		
		
		if(stu1.equals(stu00)) {
			System.out.println("같은 객체 입니다.");
		}
		
		
		Student stu2 = ctx.getBean("student2", Student.class);
		
		System.out.println(stu2.getName());
		
		
		
		Family gildongFam = ctx.getBean("family", Family.class);
		
		System.out.println(gildongFam.getFather());
		System.out.println(gildongFam.getMother());
		System.out.println(gildongFam.getSister());
		System.out.println(gildongFam.getBrother());
		
		
		ctx.close();
		
		
		
		
	}

}
