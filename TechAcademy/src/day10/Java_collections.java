package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java_collections {
    public static void main(String[] args) {
    	ArrayList<String> courses = new ArrayList<>();
    	courses.add("java full Stack");
    	courses.add("python");
    	courses.add("data Structures");
    	courses.add("python");
    	
    	for(String s: courses) {
    		System.out.println(s);
    	}
    	System.out.println();
    	
    	Set<Integer> sets = new HashSet<>();
    	sets.add(12);
    	sets.add(87);
    	sets.add(12);
    	sets.add(74);
    	sets.add(39);
    	
    	for(Integer i : sets) {
    		System.out.println(i);
    	}
    	
    	Map<String, Integer> duration = new HashMap<>();
    	duration.put("java",25);
    	duration.put("java full stack",49);
    	duration.put("python",15);
    	duration.put("C programming",49);
       
    	for(Map.Entry<String, Integer>entry : duration.entrySet()) {
    		System.out.println(entry.getKey()+" value :"+entry.getValue());
    	}
    	
    }
}








