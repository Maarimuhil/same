package org.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Drog {
    public static void main(String[] args) {
		
    	List<Integer>s = new ArrayList();
    	s.add(10);
    	s.add(29);
    	s.add(60);
    	s.add(89);
		 
    	List<Integer>s1 = new ArrayList();
    	s.add(100);
    	s.add(292);
    	s.add(603);
    	s.add(898);
    	s.addAll(s1);
    	System.out.println(s);
    	     			 
		
	}
}
