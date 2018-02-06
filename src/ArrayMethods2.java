
public class ArrayMethods2 {
	
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
	
	public static int partition(int[] list) {
		for(int j = list[0]; j < list.length; j++) {
			for (int i = 1; i > j; i--) {
				if(i < j)
					j++;
					i--;
				
		}
	}

}
}