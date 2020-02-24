package ui;

import model.Algorithms;

public class Main {

	public static void main(String[] args) {
		int[] array = generateRandomArray(1000000); // Enter the number of elementes of the array
		Algorithms a = new Algorithms(array);
		long startTime = System.currentTimeMillis();
		int[] sortedArrayPigeonhole = a.pigeonhole_sort();
		//int[] sortedArrayCountingSort = a.countingSort();
		long endTime = System.currentTimeMillis();
		double time = (double) endTime - startTime;
		System.out.println(time);
	}

	public static int[] generateRandomArray(int size) {

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			int current = (int) (Math.random() * size + 1);
			array[i] = current;
		}
		return array;
	}

	public static void print(int[] array) {

		String toPrint = "";

		for (int i : array) {
			toPrint += i + "";
		}

		System.out.println(toPrint);

	}

}
