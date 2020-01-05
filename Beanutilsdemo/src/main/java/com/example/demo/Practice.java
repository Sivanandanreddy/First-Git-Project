package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Practice {
	private String name;
	private List<String> courses=Arrays.asList("nandan","iz","don");
	
	
	

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Practice [name=" + name + ", courses=" + courses + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
