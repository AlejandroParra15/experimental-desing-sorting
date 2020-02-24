package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.*;
import ui.Main;

class AlgorithmsTest {

	private Algorithms algorithm;
	private int[] expected;

	public void setupStage1() {
		int[] array = { 4, 3, 7, 7, 1, 8, 1, 8, 3, 7 };
		expected = new int[10];
		expected[0] = 1;
		expected[1] = 1;
		expected[2] = 3;
		expected[3] = 3;
		expected[4] = 4;
		expected[5] = 7;
		expected[6] = 7;
		expected[7] = 7;
		expected[8] = 8;
		expected[9] = 8;
		algorithm = new Algorithms(array);
	}

	public void setupStage2() {
		int[] array = { 29, 91, 63, 2, 84, 8, 22, 76, 55, 26, 24, 86, 70, 77, 15, 38, 2, 35, 6, 61 };
		expected = new int[20];
		expected[0] = 2;
		expected[1] = 2;
		expected[2] = 6;
		expected[3] = 8;
		expected[4] = 15;
		expected[5] = 22;
		expected[6] = 24;
		expected[7] = 26;
		expected[8] = 29;
		expected[9] = 35;
		expected[10] = 38;
		expected[11] = 55;
		expected[12] = 61;
		expected[13] = 63;
		expected[14] = 70;
		expected[15] = 76;
		expected[16] = 77;
		expected[17] = 84;
		expected[18] = 86;
		expected[19] = 91;
		algorithm = new Algorithms(array);
	}

	public void setupStage3() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		expected = new int[15];
		expected[0] = 1;
		expected[1] = 2;
		expected[2] = 3;
		expected[3] = 4;
		expected[4] = 5;
		expected[5] = 6;
		expected[6] = 7;
		expected[7] = 8;
		expected[8] = 9;
		expected[9] = 10;
		expected[10] = 11;
		expected[11] = 12;
		expected[12] = 13;
		expected[13] = 14;
		expected[14] = 15;
		algorithm = new Algorithms(array);
	}

	public void setupStage4() {
		int[] array = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		expected = new int[15];
		expected[0] = 1;
		expected[1] = 2;
		expected[2] = 3;
		expected[3] = 4;
		expected[4] = 5;
		expected[5] = 6;
		expected[6] = 7;
		expected[7] = 8;
		expected[8] = 9;
		expected[9] = 10;
		expected[10] = 11;
		expected[11] = 12;
		expected[12] = 13;
		expected[13] = 14;
		expected[14] = 15;
		algorithm = new Algorithms(array);
	}

	@Test
	public void countingTest1() {
		setupStage1();
		int[] result = algorithm.countingSort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	public void countingTest2() {
		setupStage2();
		int[] result = algorithm.countingSort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	public void countingTest3() {
		setupStage3();
		int[] result = algorithm.countingSort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	public void countingTest4() {
		setupStage4();
		int[] result = algorithm.countingSort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	public void countingTest5() {
		int[] array = Main.generateRandomArray(100);
		Algorithms algorithm = new Algorithms(array);
		int[] result = algorithm.countingSort();
		for (int i = 1; i < result.length; i++) {
			assertTrue(result[i - 1] <= result[i], "not ordered");
		}
	}

	@Test
	public void countingTest6()
    {
        int[] array = Main.generateRandomArray(1000);
        Algorithms algorithm = new Algorithms(array);
        int[] result = algorithm.countingSort();
        for (int i = 1; i < result.length; i++) {
			assertTrue(result[i - 1] <= result[i], "not ordered");
		}
    }

	@Test
	void pigeonholeSortTest1() {
		setupStage1();
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	void pigeonholeSortTest2() {
		setupStage2();
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	void pigeonholeSortTest3() {
		setupStage3();
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	void pigeonholeSortTest4() {
		setupStage4();
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 0; i < result.length; i++) {
			assertTrue(result[i] == expected[i], "not ordered");
		}
	}

	@Test
	void pigeonholeSortTest5() {
		int[] array = Main.generateRandomArray(100);
		Algorithms algorithm = new Algorithms(array);
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 1; i < result.length; i++) {
			assertTrue(result[i - 1] <= result[i], "not ordered");
		}
	}

	@Test
	void pigeonholeSortTest6() {
		int[] array = Main.generateRandomArray(1000);
		Algorithms algorithm = new Algorithms(array);
		int[] result = algorithm.pigeonhole_sort();
		for (int i = 1; i < result.length; i++) {
			assertTrue(result[i - 1] <= result[i], "not ordered");
		}
	}

}
