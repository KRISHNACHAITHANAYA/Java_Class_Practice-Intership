package com.loops.programming;

import java.util.Scanner;

public class CountFactorial {

	static void factors(int n)
	{
		int count= 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) 
			{
				count++;
			}
		}System.out.print(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		factors(n);
		
		
		scanner.close();
	}

}
