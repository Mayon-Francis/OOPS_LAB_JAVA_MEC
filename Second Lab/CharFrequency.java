import java.util.Scanner;

public class CharFrequency {
	public static void main( String args[] ) {

		String usrInput;
		char ch;
		int len, freq = 0;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a string");
		usrInput = sc.nextLine();
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);

		len = usrInput.length();
		for(int i=0; i<len; i++) {
			if(   ch == usrInput.charAt(i)  ) {
				freq++;
			}
		}
		System.out.println("\"" + ch + "\" Occurs " + freq + " times in : \""  + usrInput + "\" ");

	}
}
