import java.util.Scanner;

class MethodOverloadDemo {
	


		// Circle
	static void calcArea(float r) {
		System.out.println("Area: " + Math.PI*(r*r));
	}

	// Rectangle
	static void calcArea(float a, float b) {
		System.out.println("Area: " + a*b);
	}

	// Triangle
	static void calcArea(float a, float b, float c) {
		// Finding Semi perimeter of the triangle
		float S = (a + b + c) / 2;

		// Finding the area of the triangle
		float Area = (float)Math.sqrt(S * (S - a) * (S - b) * (S - c));
		System.out.println("Area: " + Area);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1. Circle");
		System.out.println("2. Rectangle");
		System.out.println("3. Triangle");
		System.out.print("Enter your choice: ");
		choice = sc.nextInt();

		switch(choice) {
			case 1:
				System.out.print("Enter radius of circle : ");
				int r = sc.nextInt();
				calcArea(r);
				break;
			case 2:
				System.out.print("Enter breadth of rectangle : ");
				int brec = sc.nextInt();
				System.out.print("Enter length of rectangle : ");
				int lrec = sc.nextInt();
				calcArea(lrec, brec);
				break;
			case 3:
				System.out.print("Enter side a of Triangle : ");
				int a = sc.nextInt();
				System.out.print("Enter side b of Triangle : ");
				int b = sc.nextInt();
				System.out.print("Enter side c of Triangle : ");
				int c = sc.nextInt();
				calcArea(a, b, c);
				break;
			default :
				System.out.println("Invalid choice!");
		}
	}
}





