import java.util.Scanner;


class Factorsofn {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter the value of n:");
		int n = scan.nextInt();


		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		scan.close();
	}

}
