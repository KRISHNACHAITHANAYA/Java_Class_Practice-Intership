import java.util.Scanner;

public class RevNum {


	static int NumRev(int n)
	{ 
		int rev = 0;
		while(n>0)
		{
			
			int last= n%10;
			rev = rev*10 +last;
			 n = n/10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		int res = NumRev(n); 
		System.out.println(res);



	}

}
