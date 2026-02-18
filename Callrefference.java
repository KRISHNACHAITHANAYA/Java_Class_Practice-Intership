
class Car
{
	String  name;
	int noofseats;
	float cost;
	
}


public class Callrefference {

	public static void main(String[] args) {
		 Car a = new Car();
		 
//		 System.out.println(a.name);
//		 System.out.println(a.noofseats);
//		 System.out.println(a.cost);
		 
		 

//		int a = 1000;
//		int b;
//		b = a;
		 
//		b = 3000;
//		b = 5000;
		 
//		System.out.println(a);
//		System.out.println(b);
		
		 Car b;
		 b = a;
		 
		 b.name = "BMW";
		 b.noofseats = 5;
		 b.cost = 54.6f;
		 
		 
//		 System.out.println(b.name);
//		 System.out.println(b.noofseats);
//		 System.out.println(b.cost);

		 
		 
		 Car c;
		 c = a;
		 
		 c.name = "KIA";
		 c.noofseats = 7;
		 c.cost = 14.6f;
		 
		 
//		 System.out.println(c.name);
//		 System.out.println(c.noofseats);
//		 System.out.println(c.cost);
//		 
		 
		 
		 Car d;
		 d = a;
		 
		 d.name = "Maruti";
		 d.noofseats = 5;
		 d.cost = 7.6f;
		 
		 System.out.println(d.name);
		 System.out.println(d.noofseats);
		 System.out.println(d.cost);
		 
		 
		 
		

	}

}
