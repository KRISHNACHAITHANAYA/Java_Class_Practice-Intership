import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		
		float f = (c * 9.0f/5) + 32;
		
		System.out.println(f);
		scan.close();

	}

}
