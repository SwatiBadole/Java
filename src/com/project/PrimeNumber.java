package com.project;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, count=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter any num");
		n=r.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i ==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("prime");
		}else {
			System.out.println("notprime");
		}
	}
}
