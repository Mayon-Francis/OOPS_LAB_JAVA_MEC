import java.util.Scanner;

public class UsrInput {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age;
		String name, batch;

		System.out.println(" Enter name: ");
		name = sc.nextLine();
		

		System.out.println(" Enter Age: ");
		age = sc.nextInt();

		System.out.println(" Enter batch: ");
		batch = sc.nextLine();

		System.out.println("Your Name is: " + name);
		System.out.println("Your Age is: " + age);
		System.out.println("Your Batch is: " + batch);
	}
}
