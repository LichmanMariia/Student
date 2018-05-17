package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentData studentData = new StudentData("Mariia", "Lichman");
		System.out.println("Your First name " + studentData.getFirstName());
		System.out.println("Your Second name " + studentData.getSecondName());
	}

}
