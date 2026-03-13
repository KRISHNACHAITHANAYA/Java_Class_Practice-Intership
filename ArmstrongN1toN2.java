package com.loops.programming;

import java.util.Scanner;

public class ArmstrongN1toN2 {
	
	public static int NumCount(int n)
	{
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}return count;
	}
	
	
	public static boolean ArmstrongNum(int n)
	{
		int Originalnum = n;
		int arm = 0;
		int count = NumCount(n);
		
		while(n>0)
		{
			int last = n%10;
			arm = arm+(int)Math.pow(last,count);
			n =n/10;
			
		}return arm ==Originalnum;
		
	}
	
	
	
	
	public static void PrintArmstrong(int n1, int n2)
	{
		for(int i = n1; i<=n2; i++)
		{
			if(ArmstrongNum(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		PrintArmstrong( n1, n2);
		
//		System.out.println(res);


	}

}
