import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] elements = new int[] { -10, 100, 50, -30, 20, 17, 1000, -70 };
		int greaterKnownIndex = 0;
		int unsortedPartitionIndex  = elements.length - 1;
		
		while (unsortedPartitionIndex >= 0) {
			for (int i = 0; i <= unsortedPartitionIndex; i++) {
				
				if (elements[i] > elements[greaterKnownIndex])
					greaterKnownIndex = i;
				
			}
			
			int smallerElement = elements[unsortedPartitionIndex];
			int greaterElement = elements[greaterKnownIndex];
			elements[unsortedPartitionIndex] = greaterElement;
			elements[greaterKnownIndex] = smallerElement;
			
			unsortedPartitionIndex--;
			greaterKnownIndex = 0;
		}
		
		System.out.println(Arrays.toString(elements));
	}
	
}
