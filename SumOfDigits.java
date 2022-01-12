package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 246;
		
		//need to get 2+4+6 = 12
		//first use mob operator to separate the numbers 
		//then divide input to reduce and go for mod again
		//add reminder each time to get the output
		int total = 0;
		
		while (input >0) {
			int rem = input%10; // we will get 6
			total = total + rem;
			
			input = input/10;
			
		}
		System.out.println(total);
		
	}

}
