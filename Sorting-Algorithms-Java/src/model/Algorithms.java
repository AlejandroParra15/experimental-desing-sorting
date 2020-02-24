package model;

public class Algorithms {

	private int[] array;
	
	public Algorithms(int[] arr) {
		array = arr;
	}
	
	public int[] pigeonhole_sort() {
		return pigeonhole_sort(array, array.length);
	}
	
	public int[] countingSort() {
		return countingSort(array);
	}
	
	private int[] pigeonhole_sort(int arr[], int n) {
		int min = arr[0];
		int max = arr[0];
		int range, i, j, index;

		for (int a = 0; a < n; a++) {
			if (arr[a] > max)
				max = arr[a];
			if (arr[a] < min)
				min = arr[a];
		}

		range = max - min + 1;
		int[] phole = new int[range];

		for (i = 0; i < n; i++)
			phole[arr[i] - min]++;

		index = 0;

		for (j = 0; j < range; j++)
			while (phole[j]-- > 0)
				arr[index++] = j + min;

		return arr;
	}

	private int[] countingSort(int[] array) {

		int size = array.length;
		int[] output = new int[size];

		int max = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] > max)
				max = array[i];
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < max; ++i) {
			count[i] = 0;
		}
		for (int i = 0; i < size; i++) {
			count[array[i]]++;
		}
		for (int i = 1; i <= max; i++) {
			count[i] += count[i - 1];
		}
		for (int i = size - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			count[array[i]]--;
		}
		for (int i = 0; i < size; i++) {
			array[i] = output[i];
		}

		return output;

	}
	
}
