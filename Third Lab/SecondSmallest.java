import java.util.Scanner; 

public class SecondSmallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[] A;
		int n, smallest = Integer.MAX_VALUE, secondSmallest =  Integer.MAX_VALUE;
		System.out.print("Enter Number of elements: ");
		n = sc.nextInt();
		A = new int[n];


		System.out.println("Enter Numbers: ");
		
		for(int i = 0; i<n; i++) {
			System.out.print("> ");
			A[i] = sc.nextInt();

			if(A[i] < smallest) {
				secondSmallest = smallest;
				smallest = A[i];
			}
			else if(A[i] < secondSmallest) {
				secondSmallest = A[i];
			}
		}

		System.out.println("Second Smallest: " + secondSmallest);
	}

}
