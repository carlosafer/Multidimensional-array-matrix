package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Array size: ");
		int n = input.nextInt();

		Integer[][] array = new Integer[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("[" + (i + 1) + ", " + (j + 1) + "]: ");
				array[i][j] = input.nextInt();
			}
		}

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMain diagonal: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i][i] + " ");
		}

		System.out.println("\nNegative numbers: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] < 0) {
					System.out.print(array[i][j] + " ");
				}
			}
		}

		input.close();

	}
}
