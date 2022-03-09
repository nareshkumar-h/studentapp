package com.naresh;

import java.time.LocalDate;

public class TestStudent {

	/**
	 * This method should valid whether the given details is valid or not
	 * 
	 * @param student
	 * @throws Exception
	 */
	public static void validateStudentDetails(String name, int age, LocalDate dob) throws Exception {
		if (name == null || name.equals("") || name.trim().equals("")) {
			throw new Exception("Name cannot be null"); // Raise a problem
		}
		else if (age < 0) {
			throw new Exception("Age must be greater than zero");
		}
		else if ( dob.isAfter(LocalDate.now())) {
			throw new Exception("DOB cannot be greater than current date");
		}
		System.out.println("Validation Method completed");
	}

	public static void main(String[] args) {

		// Input
		String name = "Naresh";
		int age = -20;
		LocalDate dob = LocalDate.parse("2023-01-01");
		try {
			// validation
			validateStudentDetails(name, age,dob);
			// if validation is success
			System.out.println("Validation Passed");

		} catch (Exception ex) {
			// if validation failed
			ex.printStackTrace();
			System.out.println("Exception:" + ex.getMessage());
		}	

	}
}
