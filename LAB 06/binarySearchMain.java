import java.util.Scanner;

public class binarySearchMain {

    static void partition(int arr[], int low, int high)
	{
		if(low < high)
		{
			int pivotIndex = high;
			int storeIndex = low;
			for(int j=low; j<high; j++)
			{
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
			partition(arr, low, pivotIndex-1);
			partition(arr, pivotIndex+1, high);
		}


	}

	static void quicksort(int arr[])	
	{
		partition(arr, 0, arr.length-1);
	}
    
    static int binarySearch(int arr[], int key)
    {
        int start = 0, end = arr.length-1;
        while( start <= end)
        {
            int mid = (start + end)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count,key;
        System.out.print("Enter Number of inputs: ");
        count = sc.nextInt();
        int arr[] = new int[count];
        for(int i=0; i<count; i++)
        {
            arr[i] = sc.nextInt();
        }
        quicksort(arr);

        System.out.println("Sorted array");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.print("\n");
        System.out.print("Enter Value to search for: ");
        key = sc.nextInt();

        int index = binarySearch(arr, key);
        if(index == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            index++;
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }
}
