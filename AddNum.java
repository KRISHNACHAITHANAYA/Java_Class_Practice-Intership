import java.util.Scanner;

public class AddNum
{

	static int NumAdd(int n){

		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		return sum;
	}


	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();

		int res = NumAdd(n);
		System.out.println(res);
	}

}
