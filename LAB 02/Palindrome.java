import java.util.Scanner;

public class Palindrome {
	public static void main( String args[] ) {

		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String usrInput = sc.nextLine();
		int len = usrInput.length();
		int flag = 1;
		for(int i=0; i<(len/2); i++) {
			if(   !(usrInput.charAt(i) == usrInput.charAt(len-1-i) ) ) {
				 flag = 0;
				break;
			}
		}
		if( flag == 1)
			System.out.println("This is a palindrome");
		else 
			System.out.println("This is not a palindrome");
	}
}
