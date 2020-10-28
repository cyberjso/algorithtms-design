import java.util.Arrays;

/**
 * Shell sort is an optimization of insertion sort. It pre-orders the array traversing It less times, in way that the insertion
 * sort becomes linear when performed, scenario where insertion sort becomes suits best
 *
 * worst time complexity: O(n²)
 * in-place: YES (works on the same given array to order, does not require data structure be duplicated)
 * unstable: NO. The pre-order phase wont guarantee order. Elements from the right might take precedence while being shifted.
 * Recommended: when most of the elements are in an opposite order than they should be.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] elements = new int[] { 20, 35, -15, 7, 55, 1, -22 };
        int loopCounter = 0;

        // Different GAP values can be used using different criteria.Here is just a simple example about how could this value be chosen
        for (int gapValue =  elements.length / 2; gapValue > 0; gapValue /= 2) {

            for (int currentIndex =  gapValue ; currentIndex < elements.length; currentIndex++) {
                int currentElement  =  elements[currentIndex];

                int unsortedIndex = currentIndex;
                while (unsortedIndex >= gapValue && elements[unsortedIndex -  gapValue] > currentElement ) {
                    elements[unsortedIndex] = elements[unsortedIndex - gapValue];
                    unsortedIndex -= gapValue;
                }

                elements[unsortedIndex] = currentElement;
                loopCounter++;
            }

            loopCounter++;
        }

        System.out.println("Ordered elements: " + Arrays.toString(elements));
        System.out.println("Iterations: " + loopCounter);
    }

}
