import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Ente rthe grade :");
		int n = scan.nextInt();
		
		if(n>=91 && n<=100)
		{
			System.out.println("A+");
		}
		else if(n>=81 && n<=90)
		{
			System.out.println("A");
		}
		else if(n>=71 && n<=80)
		{
			System.out.println("B+");
		}
		else if(n>=61 && n<=70)
		{
			System.out.println("B");
		}
		else if(n>=51 && n<=60)
		{
			System.out.println("C+");
		}
		else if(n>=35 && n<=50)
		{
			System.out.println("C");
		}
		
		else if(n>=0 && n<=34)
		{
			System.out.println("FAIL");
		}
		
		
		scan.close();
		

	}

}
