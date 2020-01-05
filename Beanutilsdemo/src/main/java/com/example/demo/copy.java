package com.example.demo;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class copy {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		student s=new student();
		s.setName("nandan");
		s.setId(1);
		s.setCity("hyd");
		
		College college=new College();
		BeanUtils.copyProperties(college, s);
		
		syso
	}

}
