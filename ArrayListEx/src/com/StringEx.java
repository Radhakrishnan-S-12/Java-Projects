package com;

public class StringEx {
	public static void main(String[] args) {
		String s1 = "Welcome";
		
		// Some important string functions
		
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.indexOf("z"));
		System.out.println(s1.lastIndexOf("e"));
		System.out.println(s1.lastIndexOf("z"));
		System.out.println(s1.substring(2,4));
		System.out.println(s1.charAt(2));
		System.out.println(s1.contains("el"));
		System.out.println(s1.contains("ab"));
		System.out.println(s1.compareTo("Welcome"));
		System.out.println(s1.compareTo("come"));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equals("come"));
		System.out.println(s1.endsWith("me"));
		System.out.println(s1.endsWith("z"));
		System.out.println(s1.startsWith("We"));
		System.out.println(s1.startsWith("W"));
		System.out.println(s1.startsWith("a"));
		System.out.println(s1.equalsIgnoreCase("welcome"));
		
		
		
	}
}

