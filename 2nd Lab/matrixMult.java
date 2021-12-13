import java.util.Scanner;

public class matrixMult {
	public static void main( String args[] ) {

		int m, n, p, q;
		int A[][], B[][], C[][]; 
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter a No. of rows of matrix A");
		m = sc.nextInt();
		System.out.println("Enter a No. of columns of matrix A");
		n = sc.nextInt();
		System.out.println("Enter a No. of rows of matrix B");
		p = sc.nextInt();
		System.out.println("Enter a No. of columns of matrix B");
		q = sc.nextInt();
		
		if( n!= p ) {	
			System.out.println("Matrices are incompatible for multiplication! \n Exiting.");
			System.exit(0);
		}
		A = new int[m][n];
		B = new int[p][q];		
		C = new int[m][q];

		System.out.println("Enter a matrix A row wise");
		getMatrix(A, m, n);
		System.out.println("Enter a matrix B row wise");
		getMatrix(B, p, q);
		
		System.out.println("Matrix A :");
		printMatrix(A, m, n);
		System.out.println("Matrix B :");
		printMatrix(B, p, q);
		
		multMatrix( A, n, m, B, p, q , C);

		System.out.println("A mult by B :");
		printMatrix(C, m, q);



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

	static void multMatrix( int Arr1[][], int n, int m, int Arr2[][], int p, int q , int out[][]) {
		for (int i=0; i<m; i++) {
			for (int j=0; j<q; j++) {
				for ( int k=0; k<n; k++)  {
					out[i][j] = out[i][j] + Arr1[i][k] * Arr2[k][j] ;
				}
			}
		}
	}
}
