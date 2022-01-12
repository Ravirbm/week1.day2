package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		//input int[] data = {3,2,11,4,6,7}
		//Need to find the seond largest number

		int[] data = {3,2,11,4,6,7};
		//arrange it in ascending order
		Arrays.sort(data);
		int secondLargest = data.length-2;
		System.out.println(data[secondLargest]);
		
	}

}
