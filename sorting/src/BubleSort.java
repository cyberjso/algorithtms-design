import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] elements = new int[] { -10, 100, 50, -30, 20, 17, 1000, -70 };

		int unsortedPartition = elements.length - 1;

		while (unsortedPartition >= 0) {

			for (int j = 0; j < unsortedPartition; j++) {

				if (elements[j] > elements[j + 1]) {
					int smallerElement = elements[j + 1];
					int greaterElement = elements[j];

					elements[j] = smallerElement;
					elements[j + 1] = greaterElement;
				}
			}
			
			unsortedPartition--;
		}

		System.out.println(Arrays.toString(elements));
	}

}
