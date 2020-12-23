package com;

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(40);
		l1.add(90);
		l1.add(20);
		l1.add(60);
		l1.add(40);
		l1.add(50);
		l1.add(40);
		System.out.println(l1);
		System.out.println(l1.indexOf(40));
		System.out.println(l1.lastIndexOf(40));
		System.out.println(l1.get(1));
		System.out.println(l1.contains(40));
		System.out.println(l1.contains(4000));
		l1.remove(2);
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println(l1);
		
		
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("hi");
		l2.add("hello");
		l2.add("welcome");
		l2.add("hello");
		l2.add("tanjore");
		l2.add("chennai");
		l2.add("kolkatta");
		l2.add("delhi");
		System.out.println(l2);
		System.out.println(l2.indexOf("hello"));
		System.out.println(l2.lastIndexOf("hello"));
		System.out.println(l2.get(1));
		System.out.println(l2.contains("delhi"));
		System.out.println(l2.contains("mumbai"));
		l2.remove(2);
		System.out.println(l2);
		
		Collections.sort(l2);
		System.out.println(l2);
	}

}
