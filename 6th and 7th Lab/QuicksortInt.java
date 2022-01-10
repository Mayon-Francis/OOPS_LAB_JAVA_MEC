// Does not work yet!!!!!!!!!!!!!!!!!
// Ongoing work

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
					int temp        = arr[j];
					arr[j]          = arr[storeIndex];
					arr[storeIndex] = temp;
					storeIndex++;
				}
			}
			int temp = arr[pivotIndex];
			arr[pivotIndex] = arr[storeIndex];
			arr[storeIndex] = temp;
			pivotIndex = storeIndex;
			partition(arr, low+1, pivotIndex);
			partition(arr, pivotIndex+1, high);
		}

	}
	void quicksort(int arr[])	
	{
		partition(arr, 0, arr.length-1);
	}

	public static void main(String args[])
	{
		int arr[] = {-1,2,3,5,4,16,8,-10};
		QuicksortInt obj = new QuicksortInt();
		obj.quicksort(arr);

		for(int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	
}
