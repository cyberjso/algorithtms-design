import java.util.Arrays;

/**
 * Split the list in two groups (sorted and unsorted). Sorted elements are the ones on the left. For each element on the
 * the unsorted partition (elements on the right). Shift the elements from the unsorted partition to the sorted one until
 * It is ordered.
 *
 * worst time complexity: O(n²)
 * in-place: yes (works on the same given array to order, does not require data structure be duplicated)
 * stable: yes (does not change order of elements with the same key)
 * Recommended: Small lists, simple implementation when compared to more complex algorithms (merge, quick sort) or when most
 * of the elements is already ordered.
 */
public class InsertionSort {
	
	public static void main(String[] args) {
		int[] elements = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		int loopCounter = 0;
		for (int unsortedIndex = 1; unsortedIndex < elements.length; unsortedIndex++) {

			int currentElement  = elements[unsortedIndex];
			int index;
			for (index =  unsortedIndex; index > 0 && elements[index - 1] > currentElement; index--) {
				elements[index] =  elements[index - 1];
				loopCounter++;
			}
			elements[index] =  currentElement;
			loopCounter++;
		}

		System.out.println("Ordered elements: " + Arrays.toString(elements));
		System.out.println("Iterations: " + loopCounter);
	}

}
