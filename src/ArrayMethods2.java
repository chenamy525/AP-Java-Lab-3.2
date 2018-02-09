import java.util.Arrays;

//Amy Chen PD 2
//Lab 3.2
public class ArrayMethods2 {
	
	public static void main (String[] args) {
	
		String[] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String[] test2 = {"banana", "cherry", "mahogony", "oreos", "pasta"};
		int[] test3 = {3, 4, 2, 7, 12, 22, 0, 1};	
			
		//merge test
		long start = System.nanoTime();
		String[] mergeResult = merge (test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds.");
		System.out.println(Arrays.toString(mergeResult));
		
		//Partition test
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds.");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(Arrays.toString(test3));
	}
	
	//CHANGE TO ALPHABETICAL ORDER
	public static String[] merge(String[] list1, String[] list2) {
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].length() < list2[j].length()) {
				//list1[i] is index 0 of third array
				}
				if (list1[i].length() > list2[j].length()) {
				//list2[j] is index 0 of third array
				}
				//else list1[i] is 0, list2[j] is 1
			}
		}
	}
	
	/*
	Write a method that partitions a list using the first element as the pivot. You should return the
	integer position of the pivot in the newly partitioned array. The original array should be rearranged
	so that all the elements before the pivot are less than or equal to the pivot and all the elements 
	after the pivot are greater than the pivot.
	*/
	public static int partition(int[] list, int first, int next) {
		int pivot = list[first];
		next = pivot + 1;
		for (int i = 0; i < list.length; i++) {
			if (pivot > next) {
				//swap?
				
			}
			if (pivot < next) {
				next++;
			}
		}
		/*while (first < last) {
			
			while (pivot > ) {
				first++;
			}
			while (list[first] > pivot) {
				first--;
			}

		}*/
	}
}

