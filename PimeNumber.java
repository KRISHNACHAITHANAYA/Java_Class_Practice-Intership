package com.loops.programming;

import java.util.*;

//public class PimeNumber {
//		// Method to check if a number is prime
//		static void checkPrime(int n) {
//			int count = 0;
//
//			// Loop to count factors
//			for (int i = 1; i <= n; i++) {
//				if (n % i == 0) {
//					count++;
//				}
//			}
//
//			// A prime number has exactly 2 factors (1 and itself)
//			if (count == 2) {
//				System.out.println(n + " is a prime number.");
//			} else {
//				System.out.println(n + " is not a prime number.");
//			}
//		}
//
//
//
//
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//
//			if (scan.hasNextInt()) {
//				int n = scan.nextInt();
//				checkPrime(n);
//			}
//
//			scan.close();
//		}
//	}


public class PimeNumber {
	
	static void CheckPrime(int n){
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;			}
		}
		
		if(count==2)
		{
			System.out.println("true Prime");
			
		}
		else
		{
			System.out.println("not  Prime");
		}
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		CheckPrime(n);
		


	}
}











