package LabSession2;

import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// get size of transaction from user 3
		System.out.println("Enter the numbers of transaction");
		int size = sc.nextInt();

		// allocate an array of size given by user
		int[] arr = new int[size];

		// iterate through the loop to get the value of thr transaction 10, 20 , 30
		System.out.println("Enter the transaction value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		// get the numbers of targets
		System.out.println("Enter the number of targets");
		int numtargets = sc.nextInt();

		// loop as many times as we get the number of target
		for (int i = 0; i < numtargets; i++) {
			// get the target's value
			System.out.println("Enter the target's value");
			int target = sc.nextInt();
			// again start a loop to calculate the sum
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				// sum till the element
				sum = sum + arr[j];
				// check if sum greater than target's value
				if (sum >= target) {
					System.out.println("Traget is reached after " + (j + 1) + "transaction");
					break;

				}
				if (j == arr.length - 1 && sum < target) {
					System.out.println("Given target is not achivied");
				}

			}
		}

	}
}