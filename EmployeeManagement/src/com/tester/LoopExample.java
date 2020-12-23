package com.tester;

public class LoopExample {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int tmp:a){
			System.out.println(tmp);
		}
		
		
	}

}
