import java.util.Scanner;

public class DigitSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num, sum=0, rem;

		System.out.println(" Enter a number: ");
		num = sc.nextInt();

		while(num) {
				sum += num%10;
				num /= 10;
		}

		System.out.println("Sum of Digits " + sum);
	}
}
