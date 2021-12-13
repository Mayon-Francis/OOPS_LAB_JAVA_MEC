import java.util.Scanner; 
import java.lang.Math;

public class CheckPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean isPrime = true;
		System.out.print("Enter a Number: ");
		n = sc.nextInt();

		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if( n%i == 0 ) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) 
			System.out.println("This is prime");
		else
			System.out.println("This is not prime");
	}

}
