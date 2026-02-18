import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("eneter the first number:");
		int a = scan.nextInt();
		System.out.print("eneter the second number:");
		int b = scan.nextInt();
		System.out.print("eneter the third number:");
		int c = scan.nextInt();
		
		int sum1 = a+b;
		System.out.println(sum1);
		int sum2 = a+c;
		System.out.println(sum2);
		int sum3 = b+c;
		System.out.print(sum3);
		scan.close();

	}

}
