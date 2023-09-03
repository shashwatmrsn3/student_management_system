package com.stlawrence;

import java.util.*;

public class MainClass {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {

		MainClass mainClass = new MainClass();
		while (true) {
			System.out.println("Enter 1 to add student");
			System.out.println("Enter 2 to view student");
			System.out.println("Enter 3 to delete student");
			System.out.println("Enter 4 to update student");

			String choice = mainClass.scanner.nextLine();
			switch (choice) {
			case "1":
				mainClass.addStudent();
				break;
			case "2":
				mainClass.view();
				break;
			case "3":
				mainClass.deleteStudent();
				break;
			case "4":
				mainClass.updateStudent();
				break;
			}
			System.out
					.println("Do you want to continue further? " + "Enter N to exit. Enter any other key to continue");
			String continueFurther = mainClass.scanner.nextLine();
			if (continueFurther.equalsIgnoreCase("N")) {
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

	public void view() {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			System.out.println(i);
			System.out.println(student.getName());
			System.out.println(student.getCourse());
			System.out.println(student.getAddress());
			System.out.println(".......................");
		}
	}

	public void deleteStudent() {
		System.out.println("enter index of student to delete");
		int index = Integer.parseInt(scanner.nextLine());
		students.remove(index);
		System.out.println("student deleted");
	}
	
	public void updateStudent() {
		view();
		System.out.println("Enter student index to update");
		int index = Integer.parseInt(scanner.nextLine());
		System.out.println("Enter new name");
		String name = scanner.nextLine();
		System.out.println("Enter new address");
		String address = scanner.nextLine();
		System.out.println("Enter new course");
		String course = scanner.nextLine();
		
		Student s = students.get(index);
		s.setName(name);
		s.setAddress(address);
		s.setCourse(course);
		
		System.out.println("student updated");
	}

}
