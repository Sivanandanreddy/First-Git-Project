package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;

public class Course {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Practice p=new Practice();
		String name="is";
		//List<String> list=Arrays.asList("siva","reddy","nandan");
		//PropertyUtils.setProperty(p, "courses", list);
		//PropertyUtils.setSimpleProperty(p, "name", name);
		PropertyUtils.setIndexedProperty(p,"courses[1]" , name);
		System.out.println(p.toString());
	
	}

}
