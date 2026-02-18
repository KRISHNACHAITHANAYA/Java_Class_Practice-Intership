import java.util.Scanner;

class Car1
{
	String name;
	int noofseats;
	float cost;
	
	
	void Start()
	{
		System.out.println("Car is strting");
	}
	 void Accelarate()
	 {
		 System.out.println("Car is accelarating");
	 }
	 
	 void stop()
	 {
		 System.out.println("Car is stoping");
	 }
}


public class Methods {

	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the car name:");
		c1.name = scan.next();
		System.out.print("Enter the car seats");
		c1.noofseats = scan.nextInt();
		System.out.print("Enter the car cost:");
		c1.cost = scan.nextFloat();
		
		System.out.println(c1.name);
		System.out.println(c1.noofseats);
		System.out.println(c1.cost);
		
		c1.Start();
		c1.Accelarate();
		c1.stop();
		
		scan.close();
		

	}

}
