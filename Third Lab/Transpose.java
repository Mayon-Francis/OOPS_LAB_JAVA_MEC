import java.util.Scanner; 

public class Transpose {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int[][] A, B;
		int m, n;

		System.out.print("Enter Number of rows: ");
		m = sc.nextInt();
		System.out.print("Enter Number of colums: ");
		n = sc.nextInt();
		
		A = new int[m][n];
		B = new int[n][m];

		System.out.println("Enter Matrix Row wise: ");
		getMatrix  (A, m, n);
		System.out.println("You Entered: ");
		printMatrix(A, m, n);
		B = transposeMatrix(A, m, n);
		
		System.out.println("Transpose is:: ");
		printMatrix(B, n, m);
	}


	static void getMatrix( int Arr[][], int m, int n ) {
		Scanner  sc = new Scanner(System.in);
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				Arr[i][j] = sc.nextInt();
			}
		}
	}

	static void printMatrix( int Arr[][], int m, int n ) {
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] transposeMatrix( int Arr[][], int m, int n ) {
		int[][] transp = new int[n][m];

		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				transp[j][i] = Arr[i][j];
			}
		}
		return transp;
	}
}
