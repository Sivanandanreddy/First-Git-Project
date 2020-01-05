package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Compara {
	public static void main(String[] args) {
		STudent s=new STudent("siva", 1, 1000);
		STudent s1=new STudent("Nandan", 2, 2000);
		STudent s2=new STudent("Reddy", 3, 3000);
		
		Map<Integer, STudent> map=new HashMap<>();
		map.put(101, s);
		map.put(102, s1);
		map.put(103, s2);
		
		List<Entry<Integer, STudent>> k=new ArrayList<>(map.entrySet());
		
		Collections.sort(k, (e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName()));
		System.out.println(k);
		
		
	}

}
