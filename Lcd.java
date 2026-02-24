import java.util.Scanner;

public class Lcd {
	
	static int lcd(int a,int b)
	{
		while(a>0 && b>0)
		{
			if(a>b)
			{
				a = a%b;
			}
			else {
				b = b%a;
			}
		}return a+b;
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int res = a*b/lcd(a,b);
		System.out.println(res);
		
		
		
		}

}
