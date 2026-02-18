import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i = 0; i<=5 ; i++)
		{
			System.out.println("The ages are:");
			arr[i] = scan.nextInt();
		}
		
		for(int i=0;i<=5;i++) {
			System.out.println("The ages are:");
			System.out.println(arr[i] +" ");
		}

	}

}
