package org.helper;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class B {

	public static <E> void main(String[] args) {
		
		
		List<Object> li =new ArrayList<Object>();
		
		
		li.add(20);
		li.add(30);
		li.add(40);
		li.add("suresh");
		

		
		System.out.println(li);
		
		System.out.println(li.get(1));
		Set<Object> s =new LinkedHashSet<Object>(li);
		
		System.out.println(s);
	
	}
	
	
	
	
	
	
}
