import java.util.Scanner;
//import java.util.HashMap;
//import java.util.Map;



class GarbageCollect {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Before creating int array, memory is: " + r.freeMemory());
		int arr[] = new int[1000000];
		System.out.println("After creating int array, memory is : " + r.freeMemory());
		arr = null;
		r.gc();
		System.out.println("After calling  garbage collector, memory is : " + r.freeMemory());
	}
}





