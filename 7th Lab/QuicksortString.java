import java.util.Scanner;

public class QuicksortString
{
	
	void partition(String arr[], int low, int high)
	{
		if(low < high)
		{
			int pivotIndex = high;
			int storeIndex = low;
			//System.out.println("One call");
			for(int j=low; j<high; j++)
			{
				//System.out.println("pivot " + pivotIndex);
				//System.out.println("store " + storeIndex);
				if( arr[j].compareTo(arr[pivotIndex]) < 0  )
				{
					//System.out.println("j " + j);
					String temp        = arr[j];
					arr[j]          = arr[storeIndex];
					arr[storeIndex] = temp;
					storeIndex++;
					//for(int i = 0; i<arr.length; i++)
					//	System.out.print(arr[i] + " ");
				}
			}
			String temp = arr[pivotIndex];
			arr[pivotIndex] = arr[storeIndex];
			arr[storeIndex] = temp;
			pivotIndex = storeIndex;
			partition(arr, low, pivotIndex-1);
			partition(arr, pivotIndex+1, high);
		}
		//for(int i = 0; i<arr.length; i++)
		//	System.out.print(arr[i] + " ");

	}
	void quicksort(String arr[])	
	{
		partition(arr, 0, arr.length-1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int count;
		System.out.print("Enter Number of inputs: ");
		count = sc.nextInt();
		
		String arr[] = new String[count];
		System.out.println("Enter Names");
		// Flush Stdin
		if(sc.hasNextLine()){
			sc.nextLine();
		}
		for(int i=0; i<count; i++)
		{
			arr[i] = sc.nextLine();
		}
		sc.close();
		QuicksortString obj = new QuicksortString();
		obj.quicksort(arr);
		
		System.out.println("Sorted Array");
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
}
