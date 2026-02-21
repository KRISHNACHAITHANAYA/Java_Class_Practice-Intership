package com.loops.programming;

import java.util.Scanner;

public class CountFact {
	
	public static int CountFactors(int n)
	{
		int count = 0;
		for(int i = 1; i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scan.nextInt();
		
		int res = CountFactors(n);
		System.out.println(res);
		

		

	}

}
