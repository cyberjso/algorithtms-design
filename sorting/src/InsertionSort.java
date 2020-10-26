import java.util.Arrays;

/**
 * Split the list in two groups (sorted and unsorted). Sorted elements are the ones on the left. For each element on the
 * the unsorted partition (elements on the right), compares with element on the sorted partition, until the array
 * becomes sorted.
 *
 * worst time complexity: O(n²)
 * in-place: yes (works on the same given array to order, does not require data structure be duplicated)
 * stable: yes (does not change order of elements with the same key)
 * Recommended: Small lists, simple implementation when compared to more complex algorithms (merge, quick sort)
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		int[] elements = new int[] { -10, 100, 50, -30, 20, 17, 1000, -70 };
		
		int sortedPartition = 0;
		for (int i = 1; i < elements.length; i++) {
			
			boolean notOrdered = true;
			int iterations = 0;
			while (notOrdered) {
				int orderedElement  = elements[sortedPartition - iterations];
				int currentElement  =  elements[i - iterations];
				boolean isSwapped = false;

				// Swap condition
				if (orderedElement > currentElement) {
					elements[sortedPartition - iterations] = currentElement;
					elements[i - iterations] = orderedElement;
					isSwapped =  true;
				}

				// Stop condition. Iteration reaching the end of the list or no elements exchanged positions.
				if (!isSwapped || sortedPartition - iterations == 0) {
					notOrdered = false;
					sortedPartition = i;
				}
				
				iterations++;
			}
		}
		
		System.out.println(Arrays.toString(elements));
	}

}
