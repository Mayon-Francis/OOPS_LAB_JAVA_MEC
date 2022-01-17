import java.util.Scanner;

public class QuicksortInt
{
	
	void partition(int arr[], int low, int high)
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
				if( arr[j] < arr[pivotIndex] )
				{
					//System.out.println("j " + j);
					int temp        = arr[j];
					arr[j]          = arr[storeIndex];
					arr[storeIndex] = temp;
					storeIndex++;
					//for(int i = 0; i<arr.length; i++)
					//	System.out.print(arr[i] + " ");
				}
			}
			int temp = arr[pivotIndex];
			arr[pivotIndex] = arr[storeIndex];
			arr[storeIndex] = temp;
			pivotIndex = storeIndex;
			partition(arr, low, pivotIndex-1);
			partition(arr, pivotIndex+1, high);
		}
		//for(int i = 0; i<arr.length; i++)
		//	System.out.print(arr[i] + " ");

	}
	void quicksort(int arr[])	
	{
		partition(arr, 0, arr.length-1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int count;
		System.out.print("Enter Number of inputs: ");
		count = sc.nextInt();
		
		int arr[] = new int[count];
		System.out.println("Enter Numbers");
		for(int i=0; i<count; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		QuicksortInt obj = new QuicksortInt();
		obj.quicksort(arr);
		
		System.out.println("Sorted Array");
		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
}
