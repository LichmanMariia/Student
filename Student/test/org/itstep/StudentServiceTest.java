package org.itstep;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StudentServiceTest {

	@Test
	public void testGetStudentInArray() {
		StudentData[] array = new StudentData[3];
		StudentData student1 = new StudentData("Mariia", "Lichman");
		StudentData student2 = new StudentData("Tata", "Kozureva");
		StudentData student3 = new StudentData("Oleg", "Krulov");
		array[0] = student1;
		array[1] = student2;
		array[2] = student3;
		
		StudentService studentService = new StudentService();
		StudentData[] studentName = studentService.getStudentInArray();
		String name = studentName[0].getFirstName();
		assertEquals("Mariia", name);;
		
		
	}

	@Test
	public void testGetStudentInList() {
		ArrayList list = new ArrayList();
		StudentData student1 = new StudentData("Mariia", "Lichman");
		StudentData student2 = new StudentData("Tata", "Kozureva");
		StudentData student3 = new StudentData("Oleg", "Krulov");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		StudentService studentService = new StudentService();
		ArrayList<StudentData> lists = studentService.getStudentInList();
		String secondName = "";
		for (StudentData studentData : studentSecondName) {
			secondName = studentData.getSecondName();
		}
	
	assertNotNull(StudentSecondName, != null);

	}
}

