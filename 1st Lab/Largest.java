import java.util.Scanner;

public class Largest {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		char repeat;
		int num, largest = Integer.MIN_VALUE;

		do {
			System.out.print("Enter a number:");
			num = sc.nextInt();
			if(num > largest) {
				largest = num;
			}
			System.out.print("Do you want to enter more (y/n):");
			repeat = sc.next().charAt(0);

		}while(repeat == 'y');

	System.out.println("Largest Number from the ones you entered is:" + largest);
	}
}
