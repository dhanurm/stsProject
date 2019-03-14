package com.clc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clc.entity.EmployeeBean;
import com.clc.service.EmployeeServiceImpl;

public class TestEmployee {
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeServiceImpl service = (EmployeeServiceImpl) contex.getBean("empService");

		System.out.println("ServiceImpl...." + service);
		System.out.println("DAOImpl...." + service.daoImpl);
		System.out.println("SessionFactory...." + service.daoImpl.sfactory);

		EmployeeBean e1 = new EmployeeBean(1, "Dhanu");
		EmployeeBean e2 = new EmployeeBean(1, "Dhanu");
		EmployeeBean e3 = new EmployeeBean(1, "Dhanu");
		EmployeeBean e4 = new EmployeeBean(1, "Dhanu");

		service.addEmp(e1);
		service.addEmp(e2);
		service.addEmp(e3);
		service.addEmp(e4);
	}
}
