package com.loops.programming;

import java.util.Scanner;

public class MultiplesN {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scan.nextInt();
		
		System.out.println("enter the value of a:");
		int a = scan.nextInt();
		
		System.out.println("enter the value of b:");
		int b = scan.nextInt();

		for(int  i = 0; i<=n; i++)
		{
			if(i%a==0 || i%b==0)
			{
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
