package LabSession2;

import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// get the number of denomination - 3
		System.out.println("Enter the numbers of demonations");
		int size = sc.nextInt();

		// /allocate an array called as "notes" to hold denominations
		int[] notes = new int[size];

		// get the denominations in the loop
		System.out.println("Enetr the denomination");
		for (int i = 0; i < size; i++)
			notes[i] = sc.nextInt();



	MergeSortImplementation ms = new MergeSortImplementation();
	ms.sort(notes, 0, notes.length-1);
	// check for sorting
	for(int j = 0; j<notes.length; j++)
	{
		System.out.println(notes[j]);
		// what is the amount to pay
		System.out.println("what is the amount to pay");
		int amount = sc.nextInt();
		// variable to save notes number
		int [] numNotes = new int[size];
		
		 //pick the notes
		for(int i=0; i<notes.length; i++) {
			//find out how much to pay
			int n= (int)(amount/notes[i]);
			numNotes[i]=n;
			
			 // set amount tto the reamaing amnt
			amount = amount - (n* notes[i]);
			 // write a condition to find if it is not possible to pay an amount
			//and print  a message "Not possible to pay the amount"
			if(i == notes.length-1 && amount != 0) {
				System.out.println("not possible to pay");
			}
			else if (i == notes.length-1 && amount == 0) {
				for(int  j1=0; j1<numNotes.length; j1++) 
				{
					System.out.println(notes[j1]+ " :"+ numNotes[j1]);
				}
				}
				}
			}
		}

}
