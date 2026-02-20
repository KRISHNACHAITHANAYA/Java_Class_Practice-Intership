import java.util.Scanner;

public class Forloop1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
//		 incremmental order
		
		for(int i = 1;i<=n;i++)
		{
			System.out.println(i);
		}
		
		//decremental order
		for(int i = n;i>=n;i--)
		{
			System.out.println(i);
		}
		scan.close();
		

	}

}
