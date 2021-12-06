import java.util.Scanner; 

public class strRev {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input, reverse="";
		int len;

		System.out.print("Enter a string: ");
		input = sc.nextLine();
		len = input.length();
		
		int i = len-1;
		while(i >= 0){
			reverse = reverse + input.charAt(i);
			i--;
		}
		System.out.println("Reverse is: " + reverse);
	}
}
