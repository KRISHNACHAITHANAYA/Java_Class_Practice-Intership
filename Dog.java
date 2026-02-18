import java.util.Scanner;
class Dogesh_bhaiii{
	String color;
	String name;
	String breed;
	int age;
	boolean veg_nonveg;
	
	void bark()
	{
		System.out.print("Dogesh bhaii bark ");
	}
	void walk() {
		System.out.print("Dogesh bhaii walk ");
		
	}
	void sleep()
	{
		System.out.print("Dogesh bhaii is sleeping DND ");
		
	}
	void eat()
	{
		System.out.print("Dogesh bhaii is hungry give food ");
	}
	
	void bite()
	{
		System.out.print("Dogesh bhaii bite ");
	}
} 

public class Dog {

	public static void main(String[] args) {
		
		Dogesh_bhaiii dog = new Dogesh_bhaiii();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the dog name:");
		dog.name = scan.next();
		System.out.println("Enter the dog color:");
		dog.color = scan.next();
		System.out.println("Enter the dog breed:");
		dog.breed = scan.next();
		
		System.out.println("Enter the dog age:");
		dog.age = scan.nextInt();
		
		System.out.println("Enter the dog is veg or nonveg:");
		dog.veg_nonveg = scan.hasNext();
		
		System.out.println(dog.name);
		System.out.println(dog.color);
		System.out.println(dog.breed);
		System.out.println(dog.age);
		System.out.println(dog.veg_nonveg);
		
		dog.bark();
		dog.bite();
		dog.eat();
		dog.sleep();
		dog.walk();
		
		
		
		
		scan.close();
		

	}

}
