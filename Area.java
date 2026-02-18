import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("enter the length:");
		int l = scan.nextInt();
//		System.out.println(l);
		
		
		System.out.print("enter the breadth :");
		int b = scan.nextInt();
//		System.out.println(b);
		
		 int area = l*b;
		 
		 System.out.println(area);
		
		scan.close();
		

	}

}
