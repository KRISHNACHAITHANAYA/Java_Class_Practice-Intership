import java.util.Scanner;

public class Absolutevalue {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		//9 10 15 876
		//-1 -3 -4 -9 -127
		
		int n = scan.nextInt();
//		
//		if(n>=0)
//		{
//			System.out.println(n);
//		}
//		else
//		{
//			System.out.println(n*-1);
//		}

		int res = n>=0 ? n : -n;
		
		System.out.println(res);
		
		scan.close();
	}

}
