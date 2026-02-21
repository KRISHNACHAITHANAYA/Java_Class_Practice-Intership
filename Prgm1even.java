package com.loops.programming;

import java.util.Scanner;

public class Prgm1even {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n = scan.nextInt();
		
		
		for(int  i = 0; i<=n; i++)
		{
			//check all the n even numbers
			if(i%2==0) 
			{
				System.out.println(i);
			}
			//check all  the n  odd numbers 
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		scan.close();

	}

}
