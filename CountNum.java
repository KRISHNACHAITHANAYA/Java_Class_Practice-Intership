import java.util.Scanner;

public class CountNum {
	
	static int NumCount(int n)
	{
		int count = 0;
		while(n!=0) 
		{
			n = n/10;
			count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int result = NumCount(n);
		System.out.println(result);
	}

}
