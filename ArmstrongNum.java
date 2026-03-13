package com.loops.programming;

import java.util.Scanner;

public class ArmstrongNum {

	static int NumCount(int n)
	{
		int count = 0;
		while(n!=0) 
		{
			n = n/10;
			count++;
		}
		return count;
	}


	public static boolean Armstrong(int n)
	{
		int arm =0;
		int originalNum = n;
		int count = NumCount(n);
		while(n>0)
		{
			
			

			int last = n%10;
			arm = arm+(int)Math.pow(last,count);
			n = n/10;

		}
		return arm == originalNum;
	}



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		boolean res = Armstrong(n);
		System.out.println(res);





	}

}
