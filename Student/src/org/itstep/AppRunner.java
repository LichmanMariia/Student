package org.itstep;

import java.util.ArrayList;

public class AppRunner {

	public static void main(String[] args) {
		
		StudentData studentData = new StudentData();
		StudentService studentService = new StudentService();
		StudentData[] studentName = studentService.getStudentInArray();
		for(int i = 0; i <studentName.length; i++) {
			//if(studentName[i].getFirstName() == "Tata") {
			
			System.out.println(studentName[i].getFirstName());
			}
		
		ArrayList<StudentData> lists = studentService.getStudentInList();
		for(StudentData list:lists) {
			System.out.println(list.getSecondName());
		}
		//System.out.println("Your First name " + studentData.getFirstName());
		//System.out.println("Your Second name " + studentData.getSecondName());
	}

}

