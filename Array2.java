package com.array.practice;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
//		System.out.println(" enter the  size");
//		int n = scan.nextInt();
		
		int [][] arr = new int[2][5];
		
		for(int i = 0; i<2; i++) 
		{
			for(int j = 0; j<5;j++)
			{ 
				System.out.println("the class " + (i+1) + " Student " + (j+1) );
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("the ages are:");
		
		for(int i = 0; i<2; i++) 
		{
			for(int j = 0; j<5;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		


	}

}
