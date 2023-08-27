package com.stlawrence;

import java.util.*;

public class MainClass {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<Student>();
	
	public static void main(String[] args) {
		
		
		MainClass mainClass = new MainClass();
		while(true) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to view student");
			System.out.println("Enter 3 to delete student");
			System.out.println("Enter 4 to update student");
			
			String choice = mainClass.scanner.nextLine();
			switch(choice) {
			case "1":
				mainClass.addStudent();
				break;
			case "2":
				System.out.println("You have choose to view student");
				break;
			case "3":
				System.out.println("You have choose to delete student");
				break;
			case "4":
				System.out.println("You have choose to update student");
				break;
			}
			System.out.println("Do you want to continue further? "
					+ "Enter N to exit. Enter any other key to continue");
			String continueFurther = mainClass.scanner.nextLine();
			if(continueFurther.equalsIgnoreCase("N")) {
				break;
			}
		}
	}
	
	public void addStudent() {
		System.out.println("Enter student name");
		String name = scanner.nextLine();
		System.out.println("Enter student address");
		String address = scanner.nextLine();
		System.out.println("Enter student course");
		String coruse = scanner.nextLine();
		
		Student student = new Student();
		student.setAddress(address);
		student.setName(name);
		student.setCourse(coruse);
		
		students.add(student);
		System.out.println("student added.");
	}
}
