package com.project;

public class FibonaciiSeries {
	
	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print("this is fibonaci series\n");
		System.out.println(a+"\n"+b);
		int c;
	
        //using for loop
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
