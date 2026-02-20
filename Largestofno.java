import java.util.Scanner;

public class Largestofno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		
		
		//this this one tyoe to achive.
//		if(a>b)
//		{
//			System.out.println("a is largest");
//		}
//		
//		else
//		{
//			System.out.println("b is largest");
//		}
		
		//using ?-true and :-false
		
		System.out.println(a>b ? a : b);
//		}
		
		
		
		
		scan.close();

	}

}
