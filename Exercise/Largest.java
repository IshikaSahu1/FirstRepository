package Exercise;

import java.util.Arrays;

public class Largest {

	public static int getLargest(int [] a, int total) {
		Arrays.sort(a);
	return a[total - 1];
	}
	public static void main (String [] args) {
		
		int a [] = {2,3,4,9,5,6};
		int b [] = {23,67,90,89,77,56};
	
			System.out.println("Largest is " + getLargest(a, 6));
			System.out.println("Largest is " + getLargest(b,6));
		}
	
	}
	

