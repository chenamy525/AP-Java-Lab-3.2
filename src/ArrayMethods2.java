//Amy Chen PD 2
//Lab 3.2
public class ArrayMethods2 {
	
	
	//addtestcode

	int[] list = {1, 4, 4, 5, 2, 4, 3, 17, 0};
	String[] list1 = {};
	String[] list2 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
			
			

	
	
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
	public static int partition(int[] list, int j) {
		int pivot = list[j];
		for (j = 0; j < list.length-1; j++) {
			//???????????????
				if (j < pivot) {
					int yikes = pivot;
					pivot = j;
					j = yikes;
					
				}
				//if test > pivot
			}

		}		
	}
}
