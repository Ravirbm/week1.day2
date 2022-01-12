package week1.day2;

public class PrimeNumber {

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 */
	
	
	

	public static void main(String[] args) {
		
		int input = 13;
		
		int prime = 1;
		
	for	(int i = 2; i<= input /2; i++) {
		
		int check = input%i;
		
		if (check==0) {
			
			prime++;
			
		}
		
	}
		if (prime==1) {
			System.out.println( "The given number " + input + " is prime number");
		}
		else {
			System.out.println( "The given number " + input + " is prime number");
		}
		
		
	}

}
