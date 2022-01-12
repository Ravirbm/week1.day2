package week1.day2;

public class EmployeeInfo {
	
	private void printCompAd() {
		System.out.println("Chennai");
		

	}
	
	private String getCompAd() {
		System.out.println("My Company Address is");
		return "Chennai";

	}

	public static void main(String[] args) {
		EmployeeInfo ie = new EmployeeInfo();
		ie.printCompAd();
		System.out.println(ie.getCompAd());
		
		// TODO Auto-generated method stub

	}

}
