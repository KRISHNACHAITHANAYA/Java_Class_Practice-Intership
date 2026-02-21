package com.loops.programming;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scan.nextInt();

		for(int i = 1 ; i<=10;i++)
		{
			int res = n*i;
			System.out.println(n + "x" + i+ " = " +res );
		}
		scan.close();

	}

}
