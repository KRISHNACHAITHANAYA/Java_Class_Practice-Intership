package com.loops.programming;

import java.util.Scanner;

public class prgm1 {

	public static void PrintCommonMultilpies(int n,int a,int b)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%a==0 && i%b==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		PrintCommonMultilpies(n,a,b);
		
		

		scan.close();
	}

}
