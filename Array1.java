package com.array.practice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" enter the array size");
		int n = scan.nextInt();
		
		int[] arr = new int [n];
		
		for(int i = 0; i<n; i++)
		{
			System.out.println(" enter the array of " + i);
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		scan.close();
	}

}
