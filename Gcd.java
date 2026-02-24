import java.util.Scanner;

public class Gcd {
	
	static int gcd(int a,int b)
	{
		while(a>0 && b>0)
		{
			if(a>b)
			{
				a=a%b;
			}
			else
			{
				b=b%a;
			}
		}return a+b;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		
		int res = gcd(a,b);
		System.out.println(res);

	}

}
