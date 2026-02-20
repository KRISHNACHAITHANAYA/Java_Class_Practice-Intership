import java.util.Scanner;

public class MulTable {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1 ;i<=10; i++)
		{
			int res = n*i;
			System.out.println(n + "x" +i+ " = "+ res);
		}
		
		scan.close();

	}

}
