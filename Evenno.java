import java.util.Scanner;

public class Evenno {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		//even numbers 2 4 6 8 10
//		for(int i = 0;i<n;i++)
//		{
//			if(i%2 == 0)
//			{
//				System.out.println(i);
//			}
//		}
//		
		
		//odd numbers 1 3 5 7 9
//		for(int i = 0;i<n;i++)
//		{
//			if(i%2 !=0)
//			{
//				System.out.println(i);
//			}
//		}

//to print 3 6 9 12 15
		for(int i = 3;i<n; i=i+3)
		{
			System.out.println(i);
		}
		scan.close();
		
		
	}

}
