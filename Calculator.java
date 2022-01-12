package week1.day2;

public class Calculator {
	
	public double sub(double num1,double num2) {
		return num1 - num2;
	}
	
	public double mult(double num1,double num2) {
		
		return num1*num2;
	}
	
	public int div(int num1,int num2) {
		
		return num1/num2;
	}
	

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double sub = calc.sub(700.5056, 500.685);
		double mult = calc.mult(10.256, 11.589);
		int div = calc.div(597, 85);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
	
	}

}
