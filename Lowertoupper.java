import java.util.Scanner;

public class Lowertoupper {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int n  = scan.nextInt();
		
		//check the unicode value
		
		if(n>=65 && n<=90 )
		{
			System.out.println("Upper case");
			
		}
		else if(n>=97 && n<=122)
		{
			System.out.println("Lower case");
		}
		else if(n>=48 && n<=57)
		{
			System.out.println("numeric");
		}
		else
		{
			System.out.println("NOA");
		}
		
	 
		
		//convert the intger tio unicode value
		
//		System.out.println((char)n);
		
		scan.close();
		
	}

}