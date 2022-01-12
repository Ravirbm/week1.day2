package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		/*
		 * Goal: To find whether a number is an Armstrong number or not
		 * 
		 * inputs: 153
		 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
		 */
		
		int input = 153;
		
		int value = input;
		
		int total = 0;
		
		while(input > 0) {
			
			int rem = input % 10;
			total = total + (rem * rem * rem);
			
			input = input/10;
			
			
			
		}
		
		if (total == value) {
			System.out.println("The given numbber 153 is an Armstrong number");
		}
			else {
				System.out.println("The given numbber 153 is not an Armstrong number");
		}
				

	}

}
