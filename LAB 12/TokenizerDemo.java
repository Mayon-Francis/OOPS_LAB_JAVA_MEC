import java.util.Scanner;
import java.util.StringTokenizer;


public class TokenizerDemo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of space separated inetgers");
		String input = sc.nextLine();
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer( input, " ");
		System.out.println("You Entered:");
		while (st.hasMoreTokens())
		{
			int inputInt = Integer.parseInt( st.nextToken() );
			sum +=inputInt;
			System.out.println(inputInt);
		}
		System.out.println("Sum:" + sum);
	}
}
