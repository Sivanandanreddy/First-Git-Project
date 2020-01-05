package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Execu {
	public static void main(String[] args) {
		//test demo
		STudent s1 = new STudent("siva", 1, 1000);
		STudent s2 = new STudent("nandan", 2, 9000);
		STudent s3 = new STudent("reddy", 3, 100);
		STudent s4 = new STudent("chinna", 4, 99000);

		List<STudent> list = new ArrayList<STudent>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		Collections.sort(list, Comparator.comparing(k -> k.getId().compareTo(k.getId())));

		System.out.println(list);

	}

}
